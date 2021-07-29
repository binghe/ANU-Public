set verbose_level 0
set input_file "Factory_BI_bool.smv"
go
add_property -l -p "G (!s.fault)"
build_monitor -n 0
read_trace trace1.xml
read_trace trace2.xml
verify_property -n 0 1
verify_property -n 0 2
quit
