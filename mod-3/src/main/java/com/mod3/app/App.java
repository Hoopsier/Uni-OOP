package com.mod3.app;

import com.mod3.app.Library.model.Book;
import com.mod3.app.Library.model.LibMember;
import java.util.*;
import java.net.*;
import java.io.*;

import com.mod3.app.Library.system.Library;

public class App {
  public static void main(String[] args) {
    // one();
    // BankAccount.main(args);
    // library();
    // files();
    fibonacchi();
  }

  private static void fibonacchi() {
    long x = 0;
    long z = 0;
    long y = 1;
    String csv = "";
    for (int i = 0; i < 60; i++) {
      z = x + y;
      csv = csv.concat(x + ",");
      x = y;
      y = z;
    }
    try (OutputStream outputStream = new FileOutputStream("fib.csv")) {
      byte[] bytes = csv.getBytes();
      outputStream.write(bytes);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void files() {
    URL myUrl;
    try {
      myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
    } catch (MalformedURLException e) {
      System.err.println(e);
      return;
    }

    try {
      // open the connection and get the input stream
      // it will automatically generate HTTP GET-request
      InputStream istream = myUrl.openStream();

      // jump to character streams
      InputStreamReader istreamreader = new InputStreamReader(istream);

      // and to buffered reader for efficiency
      BufferedReader reader = new BufferedReader(istreamreader);

      // we use StringBuilder for efficiency, concatenating ordinary Strings is slow
      // and
      // generates unnecessary objects
      String line;
      StringBuilder response = new StringBuilder();

      boolean header = true;
      String[] columnNames = {};
      // here we read the content of the web page line by line
      while ((line = reader.readLine()) != null) {
        if (header) {
          header = false;
          columnNames = line.split(";");
          continue;
        }
        String[] columns = line.split(";");
        String time = columns[0];
        if (!time.contains("01.01.2023")) {
          continue;
        }
        for (int i = 0; i < columnNames.length; i++) {
          System.out.print(columnNames[i] + ": " + columns[i] + ", ");
        }
        System.out.println();
        response.append(line);
      }

      // now it is time to print the result
      reader.close();
      // System.out.println(response.toString());
    } catch (IOException e) {
      System.err.println(e);
    }
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
