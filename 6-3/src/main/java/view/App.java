package view;

import java.awt.event.MouseEvent;
import java.beans.EventHandler;

import controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Hello world!
 */
public class App extends Application {
  private GraphicsContext gc;
  private Canvas canvas = new Canvas(720, 720);
  private Controller controller;

  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage stage) {
    gc = canvas.getGraphicsContext2D();
    controller = new Controller(gc, canvas);
    controller.moveDog(0, 0);
    Scene scene = new Scene(new StackPane(canvas), canvas.getWidth(), canvas.getHeight());
    canvas.setFocusTraversable(true);
    canvas.setOnMouseEntered(event -> {
      controller.setActive(event.getX(), event.getY());
    });
    canvas.setOnMouseExited(event -> {
      controller.setInactive();
    });
    canvas.setOnMouseMoved(event -> {
      controller.setActive(event.getX(), event.getY());
    });
    stage.setOnCloseRequest(event -> {
      controller.kill();
    });
    stage.setScene(scene);
    stage.setTitle("pet");
    stage.show();
  }
}
