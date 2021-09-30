go_msat

read_trace traces/trace-1.xml
read_trace traces/trace-2.xml
read_trace traces/trace-3.xml
read_trace traces/trace-4.xml
read_trace traces/trace-5.xml

verify_property -x -n 54 -o output.csv 1.1:10

quit
