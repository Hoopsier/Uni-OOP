package com.mod3.app.Library.model;

public class Book {
  private String title;
  private String author;
  private String isbn;
  private boolean reserved;

  public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public String getISBN() {
    return this.isbn;
  }

  public void setReserved(boolean val) {
    reserved = val;
  }

  public boolean isReserved() {
    return reserved;
  }

  // Constructor, getters, setters
}
