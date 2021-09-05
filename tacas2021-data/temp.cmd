go_msat
read_trace traces/trace-1.xml
show_property -n 1
verify_property -x -n 1 -o output/output-1.csv 1.1:20
quit
