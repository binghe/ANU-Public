default:
	../bin/nuXmv -cpp -source patterns.cmd all.smv
	mkdir -p patterns
	mv p*.smv patterns/

fullobs:
	../bin/nuXmv -source patterns_fullobs.cmd all.smv
	mkdir -p patterns_fullobs
	mv p*.smv patterns_fullobs/

clean:
	rm -f run*.*.smv
