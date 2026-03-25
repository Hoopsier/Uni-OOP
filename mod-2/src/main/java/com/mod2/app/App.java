package com.mod2.app;

/**
 * Hello world!
 */
public class App {
  // NOTE: I understand why you would stuff the testing code into the methods, but
  // I don't care, since this is easier.
  // NOTE: this module also contains the third part, since we reuse classes.
  public static void main(String[] args) {
    // one();
    // two();
    // three();
    // four();
    // fivesixseven();
    // teneleventwelve();
    // fourteenfifteen();
    seventeen();
  }

  private static void seventeen() {
    ShapeCalc calc = new ShapeCalc();
    calc.printAreas();
  }

  private static void fourteenfifteen() {
    Car scar = new SportsCar("loser");
    scar.accelerate();
    System.out.println(scar.speed);
    Bus bus = new Bus();
    bus.passengerEnter(123);
    System.out.println(bus.getPassengers());
  }

  private static void teneleventwelve() {
    Book bam = new Book("Zero", "two", 3);
    Book bam2 = new Book("One", "two", 3);
    Book bam3 = new Book("Two", "four", 3);
    Book bam4 = new Book("One", "two", 3);
    Library lib = new Library();
    lib.addBook(bam);
    lib.addBook(bam2);
    lib.addBook(bam3);
    lib.addBook(bam4);
    lib.borrowBook("Zero");
    System.out.println(lib.isBookAvailable("Zero"));
    System.out.println(lib.isBookAvailable("Two"));
    lib.printBooks();
    System.out.println("=====");
    lib.returnBook(bam);
    lib.bba("two");
    bam2.addReview("Weeweewoowoo");
    System.out.println("Library average rating is " + lib.getAverageRating());
    bam.rate(5);
    System.out.println("Library most reviewed book is " + lib.getMostReviewedBook().title);
  }

  private static void fivesixseven() {
    GroceryListManager glm = new GroceryListManager();
    glm.addItem("asdsad", 123, "cats");
    glm.checkItem("asdsad");
    glm.removeItem("asdsad");
    glm.addItem("asdgad", 32, "cats");
    glm.addItem("asdsad", 532, "cats");
    glm.addItem("asdsfd", 1, "cats");
    glm.addItem("asdsaa", 53, "dogs");
    glm.displayList();
    System.out.println("========");
    glm.displayCategory("cats");
    System.out.println("========");
    glm.displayCategory("dogs");
  }

  private static void four() {
    CarDriver cd = new CarDriver();
    cd.run();
  }

  private static void three() {
    CoffeeMachineDriver cmd = new CoffeeMachineDriver(new CoffeeMachine());
    cmd.test();
  }

  private static void two() {
    Car myCar = new Car("Goober");
    Car yourCar = new Car("Gofer", 15, 88);
    System.out.println(myCar.getSpeed() + "\n" + yourCar.getSpeed());
  }

  private static void one() {
    TelevisionViewer vw = new TelevisionViewer();
    vw.Start();
  }
}
