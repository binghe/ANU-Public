set verbose_level 0
set input_file "Factory_BI_bool.smv"
go
add_property -l -p "G ((s.bottle_present[2] & !s.move_belt) -> (s.bottle_ingr1[2] & s.bottle_ingr2[2]))"
build_monitor -n 0
generate_monitor -n 0 -m "M_BI" -o "monitor_BI" -L "smv" -l 2 -c "s.bottle_present[0] & s.bottle_present[1] & s.bottle_present[2] & s.bottle_ingr1[0] & s.bottle_ingr1[1] & s.bottle_ingr1[2] & s.bottle_ingr2[0] & s.bottle_ingr2[1] & s.bottle_ingr2[2] & s.move_belt"
quit
