package com.mod1.app;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

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
    // nine();
    // ten();
    // eleven();
    // twelve();
    // thirteen();
    fourteen();
  }

  private static void fourteen() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many numbers?");
    int numCount = Integer.parseInt(scanner.nextLine());
    Integer[] nums = new Integer[numCount];
    List<Integer> newNums = new ArrayList<>();
    boolean isThere;
    for (Integer i = 0; i < numCount; i++) {
      System.out.print("Enter integer" + (i + 1) + ": ");
      nums[i] = Integer.parseInt(scanner.nextLine());
    }
    scanner.close();
    for (Integer i : nums) {
      if (newNums.size() == 0) {
        newNums.add(i);
        continue;
      }
      isThere = false;
      for (Integer j : newNums) {
        if (i == j) {
          isThere = true;
        }
      }
      if (!isThere) {
        newNums.add(i);
      }
    }
    System.out.println(newNums);
  }

  private static void thirteen() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many numbers?");
    int numCount = Integer.parseInt(scanner.nextLine());
    int[] nums = new int[numCount];
    int[] max = { 0, 0 };
    int[] maxIndex = { 0, 0 };
    for (int i = 0; i < numCount; i++) {
      System.out.print("Enter integer" + (i + 1) + ": ");
      nums[i] = Integer.parseInt(scanner.nextLine());
    }

    scanner.close();
    for (int i = 0; i < numCount; i++) {
      if (nums[i] > max[0]) {
        max[1] = nums[0];
        maxIndex[1] = maxIndex[0];
        max[0] = nums[i];
        maxIndex[0] = i;
        continue;
      }
      if (nums[i] > max[1]) {
        max[1] = nums[i];
        maxIndex[1] = i;
      }
    }
    System.out.println("Biggest sum is " + (max[0] + max[1]));
    System.out.println("At integers " + (maxIndex[0] + 1) + " and " + (maxIndex[1] + 1));
  }

  private static void twelve() {
    String[] firstNames = {
        "Liam", "Emma", "Noah", "Olivia", "Ava",
        "Elijah", "Sophia", "Lucas", "Mia", "Amelia"
    };

    String[] lastNames = {
        "Smith", "Johnson", "Williams", "Brown", "Jones",
        "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"
    };
    String fullName;

    Scanner scanner = new Scanner(System.in);
    System.out.print("How many names would you like?");
    int names = Integer.parseInt(scanner.nextLine());
    scanner.close();
    for (int i = 0; i < names; i++) {
      fullName = firstNames[ThreadLocalRandom.current().nextInt(0, firstNames.length)] + " "
          + lastNames[ThreadLocalRandom.current().nextInt(0, lastNames.length)];
      System.out.println(fullName);
    }
  }

  private static void eleven() {
    int luku = (int) (Math.random() * 10) + 1;
    List<Integer> items = new ArrayList<>();
    for (int i = 1; i < 11; i++) {
      items.add(i * luku);
    }
    System.out.println(items);
  }

  private static void ten() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Starting point please:");
    int start = Integer.parseInt(scanner.nextLine());
    System.out.print("Ending point please:");
    int end = Integer.parseInt(scanner.nextLine());
    List<Integer> primaries = new ArrayList<>();
    boolean isPrimary;
    scanner.close();
    for (int i = start; i <= end; i++) {
      isPrimary = tenpointtwo(i);
      if (isPrimary) {
        primaries.add(i);
      }
    }
    System.out.println(primaries);
  }

  private static boolean tenpointtwo(int i) {
    for (int j = 2; j * j <= i; j++) {
      if (i % j == 0) {
        return false;
      }
    }
    return true;
  }

  private static void nine() {
    Scanner scanner = new Scanner(System.in);
    char[] chars = scanner.nextLine().toCharArray();
    String bit = "";
    int bitVal = 1;
    int sum = 0;
    for (int i = chars.length - 1; i >= 0; i--) {
      bit = "";
      bit += chars[i];
      int val = Integer.parseInt(bit);
      if (val == 1) {
        sum += val * bitVal;
      }
      bitVal *= 2;
    }
    System.out.println(sum);
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
