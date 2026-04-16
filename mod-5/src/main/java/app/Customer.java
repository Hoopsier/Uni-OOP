package app;

import java.util.Random;

class Customer extends Thread {
  private Random random = new Random();
  private Reservee reservee;
  private int id;

  Customer(Reservee _reservee, int _id) {
    reservee = _reservee;
    id = _id;
  }

  @Override
  public void run() {
    boolean[] seats = reservee.getSeats();
    int qtt = random.nextInt(1, 5);
    try {
      seats[id + qtt] = true;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Customer " + id + " could not reserve " + qtt + " tickets");
      return;
    }
    for (int j = 0; j < qtt; j++) {
      seats[id + j] = true;
    }
    System.out.println("Customer " + id + " reserved " + qtt + " tickets");
  }
}

class Reservee {
  private boolean[] seats = new boolean[17];

  public synchronized boolean[] getSeats() {
    return seats;
  }

  Reservee() {
  }
}
