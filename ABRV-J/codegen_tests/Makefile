# this generates all C-based monitors in current directory

pattern:
	../bin/NuRV -source patterns.cmd all.smv
	mv p*.[ch] patterns
	cat patterns/p*.h > monitor.h
	make -C patterns

oracle:
	../bin/NuRV -source oracles.cmd all.smv

monitor: monitor.c monitor.h patterns/p0.o
	${CC} -o monitor monitor.c patterns/p*.o
