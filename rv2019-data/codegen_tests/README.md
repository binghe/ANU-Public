# Correctness of explicit-state monitor after program synthesis

## Purpose

The correctness of symbolic monitor is proved as a theorem in
the paper; the correctness of explicit-state monitor is not proved,
however, for each individual monitor it's possible to check if it's
aligned with the corresponding symbolic monitor.

## Methodology

Given a LTL property, first generate random traces with all
input variables. For nuXmv, convert the trace into XML format
(counterexample schema); for C-based monitors, use simple plain text
format from CRV. Both monitors output in CRV's Oracle format (CSV),
extended for LTL3. The explicit-state monitor is correct if the two
outputs are identical.

(CRV: Competition of Runtime Verification)

## Source code

 - `traces.lisp` (Common Lisp) for generating 500 traces in CSV format
   (Component 1: traces), and XML format (NuSMV, counterexample) in
   "traces" sub-directory

 - `monitor.c` (C) for testing all 50 C-monitor on any CSV-based trace.

# Performance comparisons of symbolic and explicit-state monitors

To support this performance test, repeated tests should be done, since
a single run is quite short.

## BDD monitors generating all oracles 55x500

real	1m31.145s
user	1m7.955s
sys	0m5.145s

## C monitors verifying all oracles 55x500

real	0m5.937s
user	0m0.725s
sys	0m0.803s
