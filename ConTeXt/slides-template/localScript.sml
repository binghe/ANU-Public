(* Put your local theorems here for including into slides *)

open HolKernel Parse boolLib bossLib;

open probabilityTheory large_numberTheory;

val _ = new_theory "local";

val _ = export_theory ();
val _ = html_theory "local";
