#!/bin/sh

p=$1
e=$2

mkdir -p outputs

cat > temp.cmd <<EOF
go_msat
build_monitor -x -n ${p} -k 50
EOF

for n in {1..10}; do
    echo "read_trace traces/trace-${n}.xml" >> temp.cmd
    echo "verify_property -x -e ${e} -n ${p} -o outputs/p${p}-e${e}-t${n}.csv ${n}" >> temp.cmd
done

echo "quit" >> temp.cmd

time NuRV -cpp -quiet -source temp.cmd model_extra.smv
