package tests;

import java.time.Duration;
import java.time.Instant;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

public final class PatternTests2 {
    /* encoded input events for rvsynth monitors */
    static int input[] = { 1, 2, 4, 8, 16, 32 };

    public static void main(String[] args) throws ClassNotFoundException {
	Vector<Integer> v = new Vector<Integer>();
	int nmax = 10000000; /* max length of the random trace */

	Random rand = new Random();

	for (int i = 0; i < nmax; i++) {
	    int s = rand.nextInt(6);
	    v.add(s);
	}

	Instant start;
	int counter;

	rvsynth.P54 monitor = new rvsynth.P54();
	Enumeration<Integer> e2 = v.elements();
	int reset = 0, resets2 = 0;
	counter = 0;

	start = Instant.now();
	while (e2.hasMoreElements()) {
	    int s = e2.nextElement();
	    counter = counter + 1;
	    int out = monitor.run(input[s], reset);

	    if (1 /* hard */ == reset) {
		reset = 0 /* none */;
		resets2 ++;
	    }

	    if (2 /* false */ == out) {
		// System.out.println(counter + ",\tfalse");
		reset = 1 /* hard */;
	    }
	}

	Instant end2 = Instant.now();
	Duration timeElapsed2 = Duration.between(start, end2);

	System.out.println("Time taken (rvs): " + timeElapsed2.toMillis() + " milliseconds");
	System.out.println("Number of resets: " + resets2);
    }

}
