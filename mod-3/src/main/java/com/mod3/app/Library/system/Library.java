package com.mod3.app.Library.system;

import java.util.*;

import com.mod3.app.Library.model.*;

public class Library {
  private List<Book> books = new ArrayList<>();
  private List<LibMember> members = new ArrayList<>();

  public void addBook(Book book) {
    // Add book to the library
    books.add(book);
  }

  public void addMember(LibMember member) {
    // Add member to the library
    members.add(member);
  }

  public void borrowBook(LibMember member, Book book) {
    // Borrow book from the library
    member.borrowBook(book);
  }

  public void returnBook(LibMember member, Book book) {
    // Return book to the library
    member.returnBook(book);
  }

  public void reserveBook(Book book, LibMember member) {
    if (book.isReserved()) {
      return;
    }
    member.reserveBook(book);
  }

  public void unReserveBook(Book book, LibMember member) {
    member.unReserveBook(book);
  }
}
