package com.expandai;

import com.expandai.service.Fibonacci;
import com.expandai.service.FibonacciBinet;
import com.expandai.service.FibonacciRecursive;

public class Main {
  public static void main(String[] args) {
    if(args.length > 1) {
      System.out.println("Invalid amount of arguments passed. Usage: 'java -jar Main <FIBONACCI_NUMBER_INDEX>'");
    }

    final int fibonacciIndex = Integer.parseInt(args[0]);

    final Fibonacci fibonacciRecursive = new FibonacciRecursive();
    final Fibonacci fibonacciBinet = new FibonacciBinet();

    try {
      System.out.println(String.format("%dth fibonacci number is: %s", fibonacciIndex, fibonacciRecursive.number(fibonacciIndex)));
      System.out.println(String.format("%dth fibonacci number is: %s", fibonacciIndex, fibonacciBinet.number(fibonacciIndex)));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
