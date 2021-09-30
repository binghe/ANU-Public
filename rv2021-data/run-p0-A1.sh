#!/bin/sh

p=0
O=0
trace=3

for n in {1..30}; do

cat > temp.cmd <<EOF
go_msat
read_trace traces/trace-${trace}.xml
verify_property -e -n ${p} -O ${O} -o output.csv 1.1:${n}
quit
EOF

echo size = ${n}
time NuRV -cpp -quiet -source temp.cmd model_extra.smv

done
