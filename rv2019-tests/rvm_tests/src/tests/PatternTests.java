package tests;

import java.util.*;
import java.time.Duration;
import java.time.Instant;

public final class PatternTests {
	/* encoded input events */
	static int input[] = {1, 2, 4, 8, 16, 32}; 

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int nmax = 10000000; /* max length of the random trace */

		Random rand = new Random();

		for (int i = 0; i < nmax; i++) {
			int s = rand.nextInt(6);
			v.add(s);
		}

		Instant start = Instant.now();
		int counter = 0;
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			int s = e.nextElement();
			try {
				counter = counter + 1;
				switch (s) {
				case 0:
					rvm.P52RuntimeMonitor.pEvent(v); break;
				case 1:	
					rvm.P52RuntimeMonitor.qEvent(v); break;
				case 2:
					rvm.P52RuntimeMonitor.rEvent(v); break;
				case 3:
					rvm.P52RuntimeMonitor.sEvent(v); break;
				case 4:
					rvm.P52RuntimeMonitor.tEvent(v); break;
				case 5:
					rvm.P52RuntimeMonitor.zEvent(v); break;
				}
			} catch (RuntimeException c) {
				// System.out.println(counter + ",\tfalse");
			}
		}

		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);

		rvsynth.P52 monitor = new rvsynth.P52();
		Enumeration<Integer> e2 = v.elements();
		int reset = 0;
		counter = 0;

		start = Instant.now();
		while(e2.hasMoreElements()) {
			int s = e2.nextElement();
			counter = counter + 1;
			int out = monitor.run(input[s], reset);

			if (1 /* hard */ == reset) {
				reset = 0 /* none */;
			}

			if (2 /* false */ == out) {
				// System.out.println(counter + ",\tfalse");
				reset = 1 /* hard */;
			}
		}

		Instant end2 = Instant.now();
		Duration timeElapsed2 = Duration.between(start, end2);
		
		System.out.println("Time taken (rvm): "+ timeElapsed.toMillis() +" milliseconds");
		System.out.println("Time taken (rvs): "+ timeElapsed2.toMillis() +" milliseconds");
	}
}
