# Run the tests

    ant build
    ./run-tests.sh

# Changing the Pattern ID

To change the default pattern (0) to another one, say, 10:

  1. modify `src/tests/PatternTests.java`, replacing all "P0" with "P10"
  2. execute `./run-tests.sh`
 
