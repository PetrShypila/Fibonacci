package com.expandai.service;

public class FibonacciBinet implements Fibonacci {

  @Override
  public long number(int n) {
    if(n < 0) {
      throw new IllegalArgumentException("Passed number must be more or equal 0");
    }

    final double a = (1 + Math.sqrt(5)) / 2;
    final double b = (1 - Math.sqrt(5)) / 2;

    final double fraction = (Math.pow(a, n) - Math.pow(b, n)) / Math.sqrt(5);
    return Double.valueOf(Math.floor(fraction)).longValue();
  }
}
