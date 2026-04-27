package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
  ShoppingCart cart;

  @BeforeEach
  void createCar() {
    cart = new ShoppingCart();
  }

  @Test
  void canAdd() {
    cart.addToCart("x", 15);
    assertEquals(1, cart.getSize());
  }

  @Test
  void canRemove() {
    cart.addToCart("x", 15);
    cart.removeFromCart("x");
    assertEquals(0, cart.getSize());
  }

  @Test
  void canCalculateTotal() {
    cart.addToCart("x", 15);
    cart.addToCart("y", 17);
    assertEquals(32, cart.getValue());
  }
}
