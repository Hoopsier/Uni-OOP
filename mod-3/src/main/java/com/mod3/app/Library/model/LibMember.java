package com.mod3.app.Library.model;

import java.util.*;

public class LibMember {
  private String name;
  private int memberId;
  private List<Book> borrowedBooks = new ArrayList<>();
  private List<Book> reservedBooks = new ArrayList<>();

  public LibMember(String name, int id) {
    this.name = name;
    memberId = id;
  }

  public List<Book> getBorrowedBooks() {
    return this.borrowedBooks;
  }

  public String getName() {
    return this.name;
  }

  public int getId() {
    return this.memberId;
  }

  public void borrowBook(Book book) {
    borrowedBooks.add(book);
  }

  public void returnBook(Book book) {
    borrowedBooks.remove(book);
  }

  public void reserveBook(Book book) {
    reservedBooks.add(book);
    book.setReserved(true);
  }

  public void unReserveBook(Book book) {
    reservedBooks.remove(book);
    book.setReserved(false);
  }

  public void printMyStuff() {
    System.out.println("reserved: " + reservedBooks);
    System.out.println("borrowed: " + borrowedBooks);
  }
  // Constructor, getters, setters
}
