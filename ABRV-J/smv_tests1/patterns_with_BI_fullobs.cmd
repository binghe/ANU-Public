set verbose_level 0
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
generate_monitor -n 0 -l 2 -L "smv" -c "p" -v "p & q & r & s & t & z" -o "p0s"
generate_monitor -n 1 -l 2 -L "smv" -c "p & r" -v "p & q & r & s & t & z" -o "p1s"
generate_monitor -n 2 -l 2 -L "smv" -c "p & q" -v "p & q & r & s & t & z" -o "p2s"
generate_monitor -n 3 -l 2 -L "smv" -c "p & q & r" -v "p & q & r & s & t & z" -o "p3s"
generate_monitor -n 4 -l 2 -L "smv" -c "p & q & r" -v "p & q & r & s & t & z" -o "p4s"
generate_monitor -n 5 -l 2 -L "smv" -c "p" -v "p & q & r & s & t & z" -o "p5s"
generate_monitor -n 6 -l 2 -L "smv" -c "p & r" -v "p & q & r & s & t & z" -o "p6s"
generate_monitor -n 7 -l 2 -L "smv" -c "p & q" -v "p & q & r & s & t & z" -o "p7s"
generate_monitor -n 8 -l 2 -L "smv" -c "p & q & r" -v "p & q & r & s & t & z" -o "p8s"
generate_monitor -n 9 -l 2 -L "smv" -c "p & q & r" -v "p & q & r & s & t & z" -o "p9s"
!echo 10
generate_monitor -n 10 -l 2 -L "smv" -c "p" -v "p & q & r & s & t & z" -o "p10s"
generate_monitor -n 11 -l 2 -L "smv" -c "p & r" -v "p & q & r & s & t & z" -o "p11s"
generate_monitor -n 12 -l 2 -L "smv" -c "p & q" -v "p & q & r & s & t & z" -o "p12s"
generate_monitor -n 13 -l 2 -L "smv" -c "p & q & r" -v "p & q & r & s & t & z" -o "p13s"
generate_monitor -n 14 -l 2 -L "smv" -c "p & q & r" -v "p & q & r & s & t & z" -o "p14s"
generate_monitor -n 15 -l 2 -L "smv" -c "p" -v "p & q & r & s & t & z" -o "p15s"
generate_monitor -n 16 -l 2 -L "smv" -c "p & r" -v "p & q & r & s & t & z" -o "p16s"
generate_monitor -n 17 -l 2 -L "smv" -c "p & q" -v "p & q & r & s & t & z" -o "p17s"
generate_monitor -n 18 -l 2 -L "smv" -c "p & q & r" -v "p & q & r & s & t & z" -o "p18s"
generate_monitor -n 19 -l 2 -L "smv" -c "p & q & r" -v "p & q & r & s & t & z" -o "p19s"
!echo 20
generate_monitor -n 20 -l 2 -L "smv" -c "p & s" -v "p & q & r & s & t & z" -o "p20s"
generate_monitor -n 21 -l 2 -L "smv" -c "p & r & s" -v "p & q & r & s & t & z" -o "p21s"
generate_monitor -n 22 -l 2 -L "smv" -c "p & q & s" -v "p & q & r & s & t & z" -o "p22s"
generate_monitor -n 23 -l 2 -L "smv" -c "p & q & r & s" -v "p & q & r & s & t & z" -o "p23s"
generate_monitor -n 24 -l 2 -L "smv" -c "p & q & r & s" -v "p & q & r & s & t & z" -o "p24s"
generate_monitor -n 25 -l 2 -L "smv" -c "p & s" -v "p & q & r & s & t & z" -o "p25s"
generate_monitor -n 26 -l 2 -L "smv" -c "p & r & s" -v "p & q & r & s & t & z" -o "p26s"
generate_monitor -n 27 -l 2 -L "smv" -c "p & q & s" -v "p & q & r & s & t & z" -o "p27s"
generate_monitor -n 28 -l 2 -L "smv" -c "p & q & r & s" -v "p & q & r & s & t & z" -o "p28s"
generate_monitor -n 29 -l 2 -L "smv" -c "p & q & r & s" -v "p & q & r & s & t & z" -o "p29s"
!echo 30
generate_monitor -n 30 -l 2 -L "smv" -c "p & s & t" -v "p & q & r & s & t & z" -o "p30s"
generate_monitor -n 31 -l 2 -L "smv" -c "p & r & s & t" -v "p & q & r & s & t & z" -o "p31s"
generate_monitor -n 32 -l 2 -L "smv" -c "p & q & s & t" -v "p & q & r & s & t & z" -o "p32s"
generate_monitor -n 33 -l 2 -L "smv" -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "p33s"
generate_monitor -n 34 -l 2 -L "smv" -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "p34s"
generate_monitor -n 35 -l 2 -L "smv" -c "p & s & t" -v "p & q & r & s & t & z" -o "p35s"
generate_monitor -n 36 -l 2 -L "smv" -c "p & r & s & t" -v "p & q & r & s & t & z" -o "p36s"
generate_monitor -n 37 -l 2 -L "smv" -c "p & q & s & t" -v "p & q & r & s & t & z" -o "p37s"
generate_monitor -n 38 -l 2 -L "smv" -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "p38s"
generate_monitor -n 39 -l 2 -L "smv" -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "p39s"
!echo 40
generate_monitor -n 40 -l 2 -L "smv" -c "p & s & t" -v "p & q & r & s & t & z" -o "p40s"
generate_monitor -n 41 -l 2 -L "smv" -c "p & r & s & t" -v "p & q & r & s & t & z" -o "p41s"
generate_monitor -n 42 -l 2 -L "smv" -c "p & q & s & t" -v "p & q & r & s & t & z" -o "p42s"
generate_monitor -n 43 -l 2 -L "smv" -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "p43s"
generate_monitor -n 44 -l 2 -L "smv" -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "p44s"
generate_monitor -n 45 -l 2 -L "smv" -c "p & s & t" -v "p & q & r & s & t & z" -o "p45s"
generate_monitor -n 46 -l 2 -L "smv" -c "p & r & s & t" -v "p & q & r & s & t & z" -o "p46s"
generate_monitor -n 47 -l 2 -L "smv" -c "p & q & s & t" -v "p & q & r & s & t & z" -o "p47s"
generate_monitor -n 48 -l 2 -L "smv" -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "p48s"
generate_monitor -n 49 -l 2 -L "smv" -c "p & q & r & s & t" -v "p & q & r & s & t & z" -o "p49s"
!echo 50
generate_monitor -n 50 -l 2 -L "smv" -c "p & s & t & z" -v "p & q & r & s & t & z" -o "p50s"
!echo 51
generate_monitor -n 51 -l 2 -L "smv" -c "p & r & s & t & z" -v "p & q & r & s & t & z" -o "p51s"
!echo 52
generate_monitor -n 52 -l 2 -L "smv" -c "p & q & s & t & z" -v "p & q & r & s & t & z" -o "p52s"
!echo 53
generate_monitor -n 53 -l 2 -L "smv" -c "p & q & r & s & t & z" -v "p & q & r & s & t & z" -o "p53s"
!echo 54
generate_monitor -n 54 -l 2 -L "smv" -c "p & q & r & s & t & z" -v "p & q & r & s & t & z" -o "p54s"

quit
