package com.expandai.service;

public class FibonacciRecursive implements Fibonacci {

  @Override
  public long number(int n) {
    if(n < 0) {
      throw new IllegalArgumentException("Passed number must be more or equal 0");
    } else if(n == 0 || n == 1) {
      return n;
    }

    return number(n-1) + number(n-2);
  }
}
