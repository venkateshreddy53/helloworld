package com.coveros.demo.helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

  public static void main(final String[] args) {
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
    final LocalDateTime now = LocalDateTime.now();

    System.out.println("Hello, World! The current time is " + dtf.format(now));
    System.out.println("Hello, World! Invoking  : 1 ");
    System.out.println("Hello, World! Invoking  : 2 ");
    System.out.println("Hello, World! Invoking  : 3 ");
    System.out.println("Hello, World! Invoking  : 4 ");
    System.out.println("Hello, World! Invoking  : 5 ");
    System.out.println("Hello, World! Invoking  : 6 ");
System.out.println("Hello, World! Invoking  : 7 ");
    System.out.println("Hello, World! Invoking  : 8 ");
	    System.out.println("Hello, World! Invoking  : 9 ");

int c = 10 + 20;
if(c > 0)
{
	System.out.println("True");
	System.out.println(c);
	System.out.println("Avin System");
	System.out.println("Bangalore, India");
}
    

  }

}
