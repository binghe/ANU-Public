model:
	../bin/nuXmv -cpp -source patterns_with_BI.cmd main.smv
	mkdir -p patterns_with_BI
	mv p*s.smv patterns_with_BI/

modelp:
	../bin/nuXmv -cpp -source patterns_with_BI2.cmd main.smv
	mkdir -p patterns_with_BI2
	mv p*s.smv patterns_with_BI2/

clean:
	rm -f run*.*.smv

run:
	for i in {0..54}; do echo $i; ./run0.sh $i; done
	for i in {0..54}; do echo $i; ./run1.sh $i; done
