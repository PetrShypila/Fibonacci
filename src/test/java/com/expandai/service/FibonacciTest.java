package com.expandai.service;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class FibonacciTest {
  @Rule
  public final ExpectedException exception = ExpectedException.none();

  private static final Fibonacci fibonacciBinet = new FibonacciBinet();
  private static final Fibonacci fibonacciRecursive = new FibonacciRecursive();
  private static final long[] regularNumbers = {
    0L,  1L,  1L,  2L,  3L,  5L,  8L,  13L,  21L,  34L,  55L,  89L,  144L,  233L,  377L,
    610L,  987L,  1597L,  2584L,  4181L,  6765L, 10946L,  17711L,  28657L,  46368L,  75025L,
    121393L,  196418L,  317811L,  514229L,  832040L,  1346269L,  2178309L,  3524578L,
    5702887L,  9227465L,  14930352L,  24157817L,  39088169L,  63245986L,  102334155L
  };

  @Test
  public void testFibonacciSequence() {
    for (int i = 0; i < regularNumbers.length; i++) {
      assertThat(regularNumbers[i], equalTo(fibonacciBinet.number(i)));
      assertThat(regularNumbers[i], equalTo(fibonacciRecursive.number(i)));
    }
  }

  @Test
  public void testBinetNegativeValue() {
    exception.expect(IllegalArgumentException.class);
    fibonacciBinet.number(-1);
  }

  @Test
  public void testRecursiveNegativeValue() {
    exception.expect(IllegalArgumentException.class);
    fibonacciRecursive.number(-1);
  }
}
