#!/bin/sh

p=49
trace=$1

for n in {1..30}; do

cat > temp.cmd <<EOF
go_msat
read_trace traces/trace-${trace}.xml
build_monitor -x -n ${p} -k 30
verify_property -x -n ${p} -e 2 -o output.csv 1.1:${n}
quit
EOF

echo size = ${n}
time NuRV -cpp -quiet -source temp.cmd model_extra.smv

done
