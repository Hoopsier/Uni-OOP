package com.mod3.app;

import com.mod3.app.Library.model.Book;
import com.mod3.app.Library.model.LibMember;
import java.util.*;

import com.mod3.app.Library.system.Library;

public class App {
  public static void main(String[] args) {
    // one();
    // BankAccount.main(args);
    library();
  }

  private static void library() {
    Library lib = new Library();
    Book book = new Book("123", "123", "123");
    Book book2 = new Book("123", "123", "123");
    LibMember member = new LibMember("123", 123);
    lib.addBook(book);
    lib.addBook(book2);
    lib.addMember(member);
    lib.borrowBook(member, book);
    lib.reserveBook(book2, member);
    member.printMyStuff();
    lib.listReservedBooks(member);
  }

  /// NOTE: This is 3.2 task 1
  private static void one() {
    List<IVehicle> vehicles = new ArrayList<>();
    vehicles.add(new Car());
    vehicles.add(new Bus());
    vehicles.add(new Motorcycle());
    vehicles.add(new EMotorcycle());
    vehicles.add(new ECar());
    VehicleDemo demo = new VehicleDemo();
    demo.getInfo(vehicles);
  }
}
