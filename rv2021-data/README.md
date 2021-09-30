# Benchmarks

```
$ time NuRV -int -cpp -source tests.cmd model_extra.smv

real	5m24.907s
user	5m23.973s
sys	0m0.703s

(if counterexample is ON)

real	6m43.552s
user	6m42.659s
sys	0m0.725s


verify_property -e -n $i 1.1:5

real	1m6.028s
user	1m5.671s
sys	0m0.303s

```
