package com.mod2.app;

import java.util.*;

public class Library {
  private List<Book> books = new ArrayList<>();

  public void printBooks() {
    System.out.println("Catalogue");
    for (Book book : books) {
      System.out.println(book.title);
      System.out.println("Author: " + book.author);
      System.out.println("Year: " + book.year);
    }
  }

  public void bba(String author) {
    for (Book book : books) {
      if (book.author == author) {
        System.out.println(book.title + ", Year: " + book.year);
      }
    }
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void borrowBook(String title) {
    Book baak = null;
    for (Book book : books) {
      if (book.title != title) {
        continue;
      }
      baak = book;
    }
    if (baak != null) {
      books.remove(baak);
    }
  }

  double getAverageRating() {
    int qtt = 0;
    double sum = 0;
    for (Book book : books) {
      qtt++;
      sum += book.getRating();
    }
    if (qtt == 0) {
      return 0;
    }
    return sum / qtt;
  }

  Book getMostReviewedBook() {
    Book mostReviewed = null;
    int mostReviewedQtt = 0;
    for (Book book : books) {
      if (book.listReviews().size() > mostReviewedQtt) {
        mostReviewed = book;
        mostReviewedQtt = book.listReviews().size();
      }
    }
    return mostReviewed;
  }

  public void returnBook(Book book) {
    addBook(book);
  }

  public boolean isBookAvailable(String title) {
    for (Book book : books) {
      if (book.title == title)
        return true;
    }
    return false;
  }
}
