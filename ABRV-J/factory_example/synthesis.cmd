set verbose_level 0
set input_file "Empty_BI_bool.smv"
go
add_property -l -p "G ((s.bottle_present[2] & !s.move_belt) -> (s.bottle_ingr1[2] & s.bottle_ingr2[2]))"
build_monitor -n 0
generate_monitor -n 0 -m "M" -o "monitor" -L "smv" -l 2 -c "s.bottle_present[2] & s.bottle_ingr1[2] & s.bottle_ingr2[2] & s.move_belt"
quit
