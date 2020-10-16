#!/bin/sh

for n in {0..54}; do

cat > temp.cmd <<EOF
go_msat
read_trace traces/trace-1.xml
verify_property -x -n ${n} -o output.csv 1.1:20
quit
EOF

echo P${n}
time NuRV -cpp -quiet -source temp.cmd model_extra.smv

done
