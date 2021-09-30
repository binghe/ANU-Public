go_msat

add_property -l -n "p1" -p "G (switch_on -> F (temp=100))"

build_monitor -x -k 30 -P "p1"

read_trace trace.xml
show_traces 1

show_property -P "p1"
echo Monitoring p1 ...
verify_property -x -P "p1" 1

quit
