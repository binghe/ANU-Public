set verbose_level 0
set input_file "Factory_BI_bool.smv"
go
go_msat
add_property -l -p "G (! (s.fault[0] | s.fault[1]))"
add_property -l -p "G ((s.bottle_present[2]) -> (s.bottle_ingr1[2] & s.bottle_ingr2[2]))"
build_monitor -n 0
build_monitor -n 1

echo tests on trace 1
read_trace trace1.xml
show_property -n 0
verify_property -n 0 1
show_property -n 1
verify_property -n 1 1

echo tests on trace 2
read_trace trace2.xml
show_property -n 0
verify_property -n 0 2
show_property -n 1
verify_property -n 1 2

echo tests on trace 3 (partially observable)
read_trace trace3.xml
show_property -n 0
heartbeat -R -n 0 -s 3.1
heartbeat -n 0 -s 3.2
heartbeat -n 0 -s 3.3
heartbeat -r -n 0 -s 3.4
heartbeat -n 0 -s 3.5
heartbeat -n 0 -s 3.6
heartbeat -n 0 -s 3.7
heartbeat -r -n 0 -s 3.8
heartbeat -n 0 -s 3.9
heartbeat -n 0 -s 3.10

show_property -n 1
heartbeat -R -n 1 -s 3.1
heartbeat -n 1 -s 3.2
heartbeat -n 1 -s 3.3
heartbeat -n 1 -s 3.4
heartbeat -r -n 1 -s 3.5
heartbeat -r -n 1 -s 3.6
heartbeat -r -n 1 -s 3.7
heartbeat -r -n 1 -s 3.8
heartbeat -r -n 1 -s 3.9
heartbeat -r -n 1 -s 3.10

quit
