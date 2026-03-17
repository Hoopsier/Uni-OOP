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
    // System.out.println(seven(30000));
    // eight(2, -5, -7);
    nine();
  }

  private static void nine() {
    Scanner scanner = new Scanner(System.in);
    String bits = scanner.nextLine();
    String reversed = "";
    for (int i = bits.length() - 1; i >= 0; i--) {
      reversed += bits.charAt(i);
    }
    for (char bit : bits.toCharArray()) {

    }
    scanner.close();
  }

  private static void eight(int a, int b, int c) {
    final double b2 = (double) Math.pow(b, 2);
    final double sqrt = Math.sqrt(b2 - 4 * a * c);
    final double pos = ((-b) + sqrt) / (2 * a);
    final double neg = ((-b) - sqrt) / (2 * a);
    if (pos == 0 && neg == 0 || Double.isNaN(neg) || Double.isNaN(pos)) {
      System.out.println("Does not touch y0");
      return;
    }
    if (pos == 0 || neg == 0) {
      System.out.println("How???");
    }
    String out = String.format("%s %.2f %s %.2f", "positive:", pos, "negative:", neg);
    System.out.println(out);

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
