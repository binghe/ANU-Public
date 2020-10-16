go_msat

add_property -l -n "p1" -p "G (switch_on -> F (temp=100))"
add_property -l -n "p2" -p "G (switch_on -> F [0,7] (temp=100))"

read_trace trace.xml
show_traces 1

show_property -P "p1"
echo Monitoring p1 ...
verify_property -x -P "p1" 1

show_property -P "p2"
echo Monitoring p2 ...
verify_property -x -P "p2" 1

quit
