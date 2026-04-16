package app;

class SALTest extends Thread {
  private SafeArrayList SAL;

  public SALTest(SafeArrayList sal) {
    SAL = sal;
  }

  @Override
  public void run() {
    SAL.add((int) (Math.random() * 5));
    System.out.println(SAL.getSize());
    sleep();
    SAL.removeAtIndex(0);
  }

  private void sleep() {
    try {
      Thread.sleep((int) (Math.random() * 1000) + 30);
    } catch (InterruptedException e) {
    }
  }
}
