#!/bin/sh

set -e

MONITOR=p${1}

case ${MONITOR} in
    p0)	PROPERTY="G (!p)";;
    p1) PROPERTY="F r -> (!p U r)";;
    p2) PROPERTY="G (q -> G (!p))";;
    p3) PROPERTY="G ((q \& !r \& F r) -> (!p U r))";;
    p4) PROPERTY="G (q \& !r -> ((G !p) | (!p U r)))";;
    p5) PROPERTY="F p";;
    p6) PROPERTY="(G !r) | (!r U (p \& !r))";;
    p7) PROPERTY="G (!q) | F (q \& F p)";;
    p8) PROPERTY="G (q \& !r -> ((G !r) | (!r U (p \& !r))))";;
    p9) PROPERTY="G (q \& !r -> (!r U (p \& !r)))";;
    p10) PROPERTY="G (!p) | (!p U (G p | (p U (G (!p) | (!p U (G p | (p U (G (!p)))))))))";;
    p11) PROPERTY="F r -> ((!p \& !r) U (r | ((p \& !r) U (r | ((!p \& !r) U (r | ((p \& !r) U (r | (!p U r)))))))))";;
    p12) PROPERTY="F q -> (!q U (q \& (G (!p) | (!p U (G p | (p U (G (!p) | (!p U (G p | (p U (G !p)))))))))))";;
    p13) PROPERTY="G ((q \& F r) -> ((!p \& !r) U (r | ((p \& !r) U (r | ((!p \& !r) U (r | ((p \& !r) U (r | (!p U r))))))))))";;
    p14) PROPERTY="G (q -> ((!p \& !r) U (r | ((p \& !r) U (r | ((!p \& !r) U (r | ((p \& !r) U (r | (G (!p) | (!p U r)) | G p)))))))))";;
    p15) PROPERTY="G p";;
    p16) PROPERTY="F r -> (p U r)";;
    p17) PROPERTY="G (q -> G p)";;
    p18) PROPERTY="G ((q \& !r \& F r) -> (p U r))";;
    p19) PROPERTY="G (q \& !r -> (G p | (p U r)))";;
    p20) PROPERTY="G (!p) | (!p U s)";;
    p21) PROPERTY="F r -> (!p U (s | r))";;
    p22) PROPERTY="G (!q) | F (q \& (G (!p) | (!p U s)))";;
    p23) PROPERTY="G ((q \& !r \& F r) -> (!p U (s | r)))";;
    p24) PROPERTY="G (q \& !r -> (G (!p) | (!p U (s | r))))";;
    p25) PROPERTY="G (p -> F s)";;
    p26) PROPERTY="F r -> (p -> (!r U (s \& !r))) U r";;
    p27) PROPERTY="G (q -> G (p -> F s))";;
    p28) PROPERTY="G ((q \& !r \& F r) -> (p -> (!r U (s \& !r))) U r)";;
    p29) PROPERTY="G (q \& !r -> (G (p -> (!r U (s \& !r))) | ((p -> (!r U (s \& !r))) U r)))";;
    p30) PROPERTY="F p -> (!p U (s \& !p \& X (!p U t)))";;
    p31) PROPERTY="F r -> (!p U (r | (s \& !p \& X (!p U t))))";;
    p32) PROPERTY="(G !q) | (!q U (q \& F p -> (!p U (s \& !p \& X (!p U t)))))";;
    p33) PROPERTY="G ((q \& F r) -> (!p U (r | (s \& !p \& X(!p U t)))))";;
    p34) PROPERTY="G (q -> (F p -> (!p U (r | (s \& !p \& X(!p U t))))))";;
    p35) PROPERTY="(F (s \& X (F t))) -> ((!s) U p)";;
    p36) PROPERTY="F r -> ((!(s \& (!r) \& X (!r U (t \& !r)))) U (r | p))";;
    p37) PROPERTY="(G !q) | ((!q) U (q \& ((F (s \& X (F t))) -> ((!s) U p))))";;
    p38) PROPERTY="G ((q \& F r) -> ((!(s \& (!r) \& X (!r U (t \& !r)))) U (r | p)))";;
    p39) PROPERTY="G (q -> (!(s \& (!r) \& X(!r U (t \& !r))) U (r | p) | G (!(s \& X (F t)))))";;
    p40) PROPERTY="G (s \& X (F t) -> X (F (t \& F p)))";;
    p41) PROPERTY="F r -> (s \& X (!r U t) -> X (!r U (t \& F p))) U r";;
    p42) PROPERTY="G (q -> G (s \& X (F t) -> X (!t U (t \& F p))))";;
    p43) PROPERTY="G ((q \& F r) -> (s \& X (!r U t) -> X (!r U (t \& F p))) U r)";;
    p44) PROPERTY="G (q -> (s \& X (!r U t) -> X (!r U (t \& F p))) U (r | G (s \& X (!r U t) -> X (!r U (t \& F p)))))";;
    p45) PROPERTY="G (p -> F(s \& X (F t)))";;
    p46) PROPERTY="F r -> (p -> (!r U (s \& !r \& X (!r U t)))) U r";;
    p47) PROPERTY="G (q -> G (p -> (s \& X (F t))))";;
    p48) PROPERTY="G ((q \& F r) -> (p -> (!r U (s \& !r \& X (!r U t)))) U r)";;
    p49) PROPERTY="G (q -> (p -> (!r U (s \& !r \& X (!r U t)))) U (r | G (p -> (s \& X (F t)))))";;
    p50) PROPERTY="G (p -> F (s \& !z \& X (!z U t)))";;
    p51) PROPERTY="F r -> (p -> (!r U (s \& !r \& !z \& X ((!r \& !z) U t)))) U r";;
    p52) PROPERTY="G (q -> G (p -> (s \& !z \& X (!z U t))))";;
    p53) PROPERTY="G ((q \& F r) -> (p -> (!r U (s \& !r \& !z \& X ((!r \& !z) U t)))) U r)";;
    p54) PROPERTY="G (q -> (p -> (!r U (s \& !r \& !z \& X ((!r \& !z) U t)))) U (r | G (p -> (s \& !z \& X (!z U t)))))";;
    *)  PROPERTY="TRUE";;
esac

sed "s/MONITOR/${MONITOR}/g;" run0.smv.template > run.${MONITOR}.smv.tmp
sed "s/PROPERTY/${PROPERTY}/g" run.${MONITOR}.smv.tmp > run.${MONITOR}.smv
rm -f run.${MONITOR}.smv.tmp

exec nuXmv -cpp -source run.cmd run.${MONITOR}.smv
