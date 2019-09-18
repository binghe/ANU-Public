set input_file "disjoint.smv"
set input_order_file "default.ord"
go
add_property -l -p "p U q"
add_property -l -p "Y p | q"
build_monitor -n 0
build_monitor -n 1
generate_monitor -n 0 -l 3 -L "c" -o "M0"
generate_monitor -n 1 -l 3 -L "c" -o "M1"
quit
