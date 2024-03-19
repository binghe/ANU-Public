#!/bin/sh

# This script is called by ConTeXt with two arguments:
input="$1";
base="$2";

./munge.exe -w50 < "$input" > "$base.tex"

exec pdflatex "$base"
