package com.mod1.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    // oneAndTwo();
    // three();
    // four();
    // System.out.println(String.format("%.2f", five(100)));
    // System.out.println(six());
    System.out.println(seven(30000));
  }

  private static String seven(double grams) {
    final int leiviska = (int) Math.floor(grams / 13.28 / 32 / 20);
    final int nails = (int) Math.floor(grams / 13.28 / 32 % 20);
    final double bullets = grams / 13.28 % 32;

    return String.format("%s %s %d %s %d %s %.2f %s",
        grams, " grams is ",
        leiviska, "leiviska,",
        nails, "naula, and",
        bullets,
        "bullets");
  }

  private static double six() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("a:");
    final double a = Double.parseDouble(scanner.nextLine());
    System.out.print("b:");
    final double b = Double.parseDouble(scanner.nextLine());
    scanner.close();
    return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
  }

  private static double five(double F) {
    final double C = (F - 32) * 0.555555556;
    return C;
  }

  private static void four() {
    Cat cat = new Cat("Muscles");
    cat.meow();
  }

  private static void three() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Gimme a number: ");
    int first = Integer.parseInt(scanner.nextLine());
    System.out.print("Gimme a second number: ");
    int second = Integer.parseInt(scanner.nextLine());

    System.out.print("Gimme a third number: ");
    int third = Integer.parseInt(scanner.nextLine());

    System.out.println("Sum of them all is: " + (first + second + third));

    scanner.close();
  }

  private static void oneAndTwo() {
    System.out.println("Hello World!");
    String[] tree = { "    *",
        "   ***",
        "  *****",
        " *******" };
    for (String branch : tree) {
      System.out.println(branch);
    }
  }
}
