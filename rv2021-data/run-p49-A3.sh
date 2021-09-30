#!/bin/sh

p=49
O=0
trace=$1

for n in {1..30}; do

cat > temp.cmd <<EOF
go_msat
read_trace traces/trace-${trace}.xml
build_monitor -x -n ${p} -k 30
verify_property -x -e 1 -n ${p} -O ${O} -o output.csv 1.1:${n}
quit
EOF

echo size = ${n}
time NuRV -cpp -quiet -source temp.cmd model_extra.smv

done
