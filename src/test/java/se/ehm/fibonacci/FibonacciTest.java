package se.ehm.fibonacci;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Fibonacci.
 */
public class FibonacciTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FibonacciTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FibonacciTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testFibonacci()
    {
        assertTrue( true );
    }
}
