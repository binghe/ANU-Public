default:
	../bin/nuXmv -source patterns_fullobs.cmd all.smv
	mv p*.smv patterns/

model:
	../bin/nuXmv -cpp -source patterns_with_BI_fullobs.cmd main.smv
	mv p*s.smv patterns_with_BI/

model2:
	../bin/nuXmv -cpp -source patterns_with_BI2_fullobs.cmd main_new.smv
	mkdir -p patterns_with_BI2
	mv p*s.smv patterns_with_BI2/

clean:
	rm -f run*.*.smv
