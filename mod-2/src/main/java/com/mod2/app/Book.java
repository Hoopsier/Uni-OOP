package com.mod2.app;

import java.util.*;

public class Book {
  String title, author;
  int year;
  private List<String> reviews = new ArrayList<>();
  private Rating ratings = new Rating();

  public Book(String title, String author, int year) {
    this.title = title;
    this.author = author;
    this.year = year;
  }

  void rate(int rating) {
    ratings.addRating(rating);
  }

  void addReview(String review) {
    reviews.add(review);
  }

  List<String> listReviews() {
    return reviews;
  }

  double getRating() {
    return ratings.getAverageRating();
  }
}

class Rating {
  private int ones = 0;
  private int twos = 0;
  private int threes = 0;
  private int fours = 0;
  private int fives = 0;

  public void addRating(int rating) {
    switch (rating) {
      case 1:
        ones++;
        break;
      case 2:
        twos++;
        break;
      case 3:
        threes++;
        break;
      case 4:
        fours++;
        break;
      case 5:
        fives++;
        break;
    }
  }

  public double getAverageRating() {
    int qtt = ones + twos + threes + fives + fours;
    int sum = ones + 2 * twos + 3 * threes + 4 * fours + 5 * fives;
    if (qtt == 0) {
      return 0;
    }
    return sum / qtt;
  }
}
