set verbose_level 0
set input_file "disjoint.smv"
set input_order_file "default.ord"
go

add_property -l -n "p0" -p "G (!p)"
add_property -l -n "p1" -p "F r -> (!p U r)"
add_property -l -n "p2" -p "G (q -> G (!p))"
add_property -l -n "p3" -p "G ((q & !r & F r) -> (!p U r))"
add_property -l -n "p4" -p "G (q & !r -> ((G !p) | (!p U r)))"
add_property -l -n "p5" -p "F p"
add_property -l -n "p6" -p "(G !r) | (!r U (p & !r))"
add_property -l -n "p7" -p "G (!q) | F (q & F p)"
add_property -l -n "p8" -p "G (q & !r -> ((G !r) | (!r U (p & !r))))"
add_property -l -n "p9" -p "G (q & !r -> (!r U (p & !r)))"
add_property -l -n "p10" -p "G (!p) | (!p U (G p | (p U (G (!p) | (!p U (G p | (p U (G (!p)))))))))"
add_property -l -n "p11" -p "F r -> ((!p & !r) U (r | ((p & !r) U (r | ((!p & !r) U (r | ((p & !r) U (r | (!p U r)))))))))"
add_property -l -n "p12" -p "F q -> (!q U (q & (G (!p) | (!p U (G p | (p U (G (!p) | (!p U (G p | (p U (G !p)))))))))))"
add_property -l -n "p13" -p "G ((q & F r) -> ((!p & !r) U (r | ((p & !r) U (r | ((!p & !r) U (r | ((p & !r) U (r | (!p U r))))))))))"
add_property -l -n "p14" -p "G (q -> ((!p & !r) U (r | ((p & !r) U (r | ((!p & !r) U (r | ((p & !r) U (r | (G (!p) | (!p U r)) | G p)))))))))"
add_property -l -n "p15" -p "G p"
add_property -l -n "p16" -p "F r -> (p U r)"
add_property -l -n "p17" -p "G (q -> G p)"
add_property -l -n "p18" -p "G ((q & !r & F r) -> (p U r))"
add_property -l -n "p19" -p "G (q & !r -> (G p | (p U r)))"
add_property -l -n "p20" -p "G (!p) | (!p U s)"
add_property -l -n "p21" -p "F r -> (!p U (s | r))"
add_property -l -n "p22" -p "G (!q) | F (q & (G (!p) | (!p U s)))"
add_property -l -n "p23" -p "G ((q & !r & F r) -> (!p U (s | r)))"
add_property -l -n "p24" -p "G (q & !r -> (G (!p) | (!p U (s | r))))"
add_property -l -n "p25" -p "G (p -> F s)"
add_property -l -n "p26" -p "F r -> (p -> (!r U (s & !r))) U r"
add_property -l -n "p27" -p "G (q -> G (p -> F s))"
add_property -l -n "p28" -p "G ((q & !r & F r) -> (p -> (!r U (s & !r))) U r)"
add_property -l -n "p29" -p "G (q & !r -> (G (p -> (!r U (s & !r))) | ((p -> (!r U (s & !r))) U r)))"
add_property -l -n "p30" -p "F p -> (!p U (s & !p & X (!p U t)))"
add_property -l -n "p31" -p "F r -> (!p U (r | (s & !p & X (!p U t))))"
add_property -l -n "p32" -p "(G !q) | (!q U (q & F p -> (!p U (s & !p & X (!p U t)))))"
add_property -l -n "p33" -p "G ((q & F r) -> (!p U (r | (s & !p & X(!p U t)))))"
add_property -l -n "p34" -p "G (q -> (F p -> (!p U (r | (s & !p & X(!p U t))))))"
add_property -l -n "p35" -p "(F (s & X (F t))) -> ((!s) U p)"
add_property -l -n "p36" -p "F r -> ((!(s & (!r) & X (!r U (t & !r)))) U (r | p))"
add_property -l -n "p37" -p "(G !q) | ((!q) U (q & ((F (s & X (F t))) -> ((!s) U p))))"
add_property -l -n "p38" -p "G ((q & F r) -> ((!(s & (!r) & X (!r U (t & !r)))) U (r | p)))"
add_property -l -n "p39" -p "G (q -> (!(s & (!r) & X(!r U (t & !r))) U (r | p) | G (!(s & X (F t)))))"
add_property -l -n "p40" -p "G (s & X (F t) -> X (F (t & F p)))"
add_property -l -n "p41" -p "F r -> (s & X (!r U t) -> X (!r U (t & F p))) U r"
add_property -l -n "p42" -p "G (q -> G (s & X (F t) -> X (!t U (t & F p))))"
add_property -l -n "p43" -p "G ((q & F r) -> (s & X (!r U t) -> X (!r U (t & F p))) U r)"
add_property -l -n "p44" -p "G (q -> (s & X (!r U t) -> X (!r U (t & F p))) U (r | G (s & X (!r U t) -> X (!r U (t & F p)))))"
add_property -l -n "p45" -p "G (p -> F(s & X (F t)))"
add_property -l -n "p46" -p "F r -> (p -> (!r U (s & !r & X (!r U t)))) U r"
add_property -l -n "p47" -p "G (q -> G (p -> (s & X (F t))))"
add_property -l -n "p48" -p "G ((q & F r) -> (p -> (!r U (s & !r & X (!r U t)))) U r)"
add_property -l -n "p49" -p "G (q -> (p -> (!r U (s & !r & X (!r U t)))) U (r | G (p -> (s & X (F t)))))"
add_property -l -n "p50" -p "G (p -> F (s & !z & X (!z U t)))"
add_property -l -n "p51" -p "F r -> (p -> (!r U (s & !r & !z & X ((!r & !z) U t)))) U r"
add_property -l -n "p52" -p "G (q -> G (p -> (s & !z & X (!z U t))))"
add_property -l -n "p53" -p "G ((q & F r) -> (p -> (!r U (s & !r & !z & X ((!r & !z) U t)))) U r)"
add_property -l -n "p54" -p "G (q -> (p -> (!r U (s & !r & !z & X ((!r & !z) U t)))) U (r | G (p -> (s & !z & X (!z U t)))))"

build_monitor -n 0
build_monitor -n 1
build_monitor -n 2
build_monitor -n 3
build_monitor -n 4
build_monitor -n 5
build_monitor -n 6
build_monitor -n 7
build_monitor -n 8
build_monitor -n 9
build_monitor -n 10
build_monitor -n 11
build_monitor -n 12
build_monitor -n 13
build_monitor -n 14
build_monitor -n 15
build_monitor -n 16
build_monitor -n 17
build_monitor -n 18
build_monitor -n 19
build_monitor -n 20
build_monitor -n 21
build_monitor -n 22
build_monitor -n 23
build_monitor -n 24
build_monitor -n 25
build_monitor -n 26
build_monitor -n 27
build_monitor -n 28
build_monitor -n 29
build_monitor -n 30
build_monitor -n 31
build_monitor -n 32
build_monitor -n 33
build_monitor -n 34
build_monitor -n 35
build_monitor -n 36
build_monitor -n 37
build_monitor -n 38
build_monitor -n 39
build_monitor -n 40
build_monitor -n 41
build_monitor -n 42
build_monitor -n 43
build_monitor -n 44
build_monitor -n 45
build_monitor -n 46
build_monitor -n 47
build_monitor -n 48
build_monitor -n 49
build_monitor -n 50
build_monitor -n 51
build_monitor -n 52
build_monitor -n 53
build_monitor -n 54

!echo 0
generate_monitor -n 0 -L "java" -l 1 -c "p" -v "p & q & r & s & t & z" -o "P0"
generate_monitor -n 1 -L "java" -l 1 -c "p & r" -v "p & q & r & s & t & z" -o "P1"
generate_monitor -n 2 -L "java" -l 1 -c "p & q" -v "p & q & r & s & t & z" -o "P2"
generate_monitor -n 3 -L "java" -l 1 -c "p & q & r" -v "p & q & r & s & t & z" -o "P3"
generate_monitor -n 4 -L "java" -l 1 -c "p & q & r" -v "p & q & r & s & t & z" -o "P4"
generate_monitor -n 5 -L "java" -l 1 -c "p" -v "p & q & r & s & t & z" -o "P5"
generate_monitor -n 6 -L "java" -l 1 -c "p & r" -v "p & q & r & s & t & z" -o "P6"
generate_monitor -n 7 -L "java" -l 1 -c "p & q" -v "p & q & r & s & t & z" -o "P7"
generate_monitor -n 8 -L "java" -l 1 -c "p & q & r" -v "p & q & r & s & t & z" -o "P8"
generate_monitor -n 9 -L "java" -l 1 -c "p & q & r" -v "p & q & r & s & t & z" -o "P9"
!echo 10
generate_monitor -n 10 -L "java" -l 1 -c "p" -v "p & q & r & s & t & z" -o "P10"
generate_monitor -n 11 -L "java" -l 1 -c "p & r" -v "p & q & r & s & t & z" -o "P11"
generate_monitor -n 12 -L "java" -l 1 -c "p & q" -v "p & q & r & s & t & z" -o "P12"
generate_monitor -n 13 -L "java" -l 1 -c "p & q & r" -v "p & q & r & s & t & z" -o "P13"
generate_monitor -n 14 -L "java" -l 1 -c "p & q & r" -v "p & q & r & s & t & z" -o "P14"
generate_monitor -n 15 -L "java" -l 1 -c "p" -v "p & q & r & s & t & z" -o "P15"
generate_monitor -n 16 -L "java" -l 1 -c "p & r" -v "p & q & r & s & t & z" -o "P16"
generate_monitor -n 17 -L "java" -l 1 -c "p & q" -v "p & q & r & s & t & z" -o "P17"
generate_monitor -n 18 -L "java" -l 1 -c "p & q & r" -v "p & q & r & s & t & z" -o "P18"
generate_monitor -n 19 -L "java" -l 1 -c "p & q & r" -v "p & q & r & s & t & z" -o "P19"
!echo 20
generate_monitor -n 20 -L "java" -l 1 -c "p & s" -v "p & q & r & s & t & z" -o "P20"
generate_monitor -n 21 -L "java" -l 1 -c "p & r & s" -v "p & q & r & s & t & z" -o "P21"
generate_monitor -n 22 -L "java" -l 1 -c "p & q & s" -v "p & q & r & s & t & z" -o "P22"
generate_monitor -n 23 -L "java" -l 1 -c "p & q & r & s" -v "p & q & r & s & t & z" -o "P23"
generate_monitor -n 24 -L "java" -l 1 -c "p & q & r & s" -v "p & q & r & s & t & z" -o "P24"
generate_monitor -n 25 -L "java" -l 1 -c "p & s" -v "p & q & r & s & t & z" -o "P25"
generate_monitor -n 26 -L "java" -l 1 -c "p & r & s" -v "p & q & r & s & t & z" -o "P26"
generate_monitor -n 27 -L "java" -l 1 -c "p & q & s" -v "p & q & r & s & t & z" -o "P27"
generate_monitor -n 28 -L "java" -l 1 -c "p & q & r & s" -v "p & q & r & s & t & z" -o "P28"
generate_monitor -n 29 -L "java" -l 1 -c "p & q & r & s" -v "p & q & r & s & t & z" -o "P29"
!echo 30
generate_monitor -n 30 -L "java" -l 1 -c "p & s & t" -v "p & q & r & s & t & z" -o "P30"
generate_monitor -n 31 -L "java" -l 1 -c "p & r & s & t" -v "p & q & r & s & t & z" -o "P31"
generate_monitor -n 32 -L "java" -l 1 -c "p & q & s & t" -v "p & q & r & s & t & z" -o "P32"
generate_monitor -n 33 -L "java" -l 1 -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "P33"
generate_monitor -n 34 -L "java" -l 1 -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "P34"
generate_monitor -n 35 -L "java" -l 1 -c "p & s & t" -v "p & q & r & s & t & z" -o "P35"
generate_monitor -n 36 -L "java" -l 1 -c "p & r & s & t" -v "p & q & r & s & t & z" -o "P36"
generate_monitor -n 37 -L "java" -l 1 -c "p & q & s & t" -v "p & q & r & s & t & z" -o "P37"
generate_monitor -n 38 -L "java" -l 1 -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "P38"
generate_monitor -n 39 -L "java" -l 1 -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "P39"
!echo 40
generate_monitor -n 40 -L "java" -l 1 -c "p & s & t" -v "p & q & r & s & t & z" -o "P40"
generate_monitor -n 41 -L "java" -l 1 -c "p & r & s & t" -v "p & q & r & s & t & z" -o "P41"
generate_monitor -n 42 -L "java" -l 1 -c "p & q & s & t" -v "p & q & r & s & t & z" -o "P42"
generate_monitor -n 43 -L "java" -l 1 -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "P43"
generate_monitor -n 44 -L "java" -l 1 -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "P44"
generate_monitor -n 45 -L "java" -l 1 -c "p & s & t" -v "p & q & r & s & t & z" -o "P45"
generate_monitor -n 46 -L "java" -l 1 -c "p & r & s & t" -v "p & q & r & s & t & z" -o "P46"
generate_monitor -n 47 -L "java" -l 1 -c "p & q & s & t" -v "p & q & r & s & t & z" -o "P47"
generate_monitor -n 48 -L "java" -l 1 -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "P48"
generate_monitor -n 49 -L "java" -l 1 -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "P49"
!echo 50
generate_monitor -n 50 -L "java" -l 1 -c "p & s & t & z" -v "p & q & r & s & t & z" -o "P50"
!echo 51
generate_monitor -n 51 -L "java" -l 1 -c "p & r & s & t & z" -v "p & q & r & s & t & z" -o "P51"
!echo 52
generate_monitor -n 52 -L "java" -l 1 -c "p & q & s & t & z" -v "p & q & r & s & t & z" -o "P52"
!echo 53
generate_monitor -n 53 -L "java" -l 1 -c "p & q & r & s & t & z" -v "p & q & r & s & t & z" -o "P53"
!echo 54
generate_monitor -n 54 -L "java" -l 1 -c "p & q & r & s & t & z" -v "p & q & r & s & t & z" -o "P54"

quit
