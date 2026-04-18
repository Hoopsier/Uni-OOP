package app;

import controller.Controller;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * NOTE: I did not name the package view, because effort
 */
public class App extends Application {
  private static Label result = new Label("");
  private TextField wordField = new TextField();
  private TextField descField = new TextField();
  private TextField queryField = new TextField();
  private static Label result2 = new Label();
  private Controller controller = new Controller();

  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage window) {
    VBox vBox = new VBox();
    FlowPane pane = new FlowPane();
    Button button = new Button("Add Word");
    Button button2 = new Button("Search Word");
    pane.getChildren().add(wordField);
    pane.getChildren().add(descField);
    pane.getChildren().add(button);
    pane.getChildren().add(result);
    vBox.getChildren().add(pane);
    FlowPane pane2 = new FlowPane();
    pane2.getChildren().add(queryField);
    pane2.getChildren().add(button2);
    pane2.getChildren().add(result2);
    vBox.getChildren().add(pane2);
    Scene view = new Scene(vBox);
    window.setTitle("6-1");
    window.setScene(view);
    button.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        controller.addWord(wordField.textProperty().getValue(), descField.textProperty().getValue());
      }
    });
    button2.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        controller.search(queryField.textProperty().getValue());
      }
    });

    window.show();
  }

  public static void setResult(String value) {
    result2.setText(value);
  }

  public static void setHint() {
    result.setText("Add someting into those back to back text fields.");
  }
}
