package app;

import controller.Controller;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Hello world!
 */
public class App extends Application {
  Controller controller = new Controller();
  // UI element declarations
  private GridPane grid = new GridPane();
  private HBox box = new HBox();
  private Label inputLabel = new Label("Input");
  private TextField inputField = new TextField();
  private final static String OUTPUTTEXT = "Output:";
  private static Label outputLabel = new Label(OUTPUTTEXT);
  private final String[] CURRENCIES = { "usd", "eur", "pound" };
  private ChoiceBox<String> choiceIn = new ChoiceBox<>(FXCollections.observableArrayList(CURRENCIES));
  private ChoiceBox<String> choiceOut = new ChoiceBox<>(FXCollections.observableArrayList(CURRENCIES));
  private Button convertBtn = new Button("Convert");
  // end of UI element declarations

  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage window) {

    box.getChildren().add(inputLabel);
    box.getChildren().add(inputField);
    grid.add(box, 0, 0);
    grid.add(choiceIn, 1, 0);
    grid.add(outputLabel, 0, 1);
    grid.add(choiceOut, 1, 1);
    grid.add(convertBtn, 0, 2);

    window.setTitle("Currency Converter");
    Scene view = new Scene(grid);
    view.getStylesheets().add("style.css");
    window.setScene(view);
    convertBtn.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        controller.convert(inputField.textProperty().getValue(), choiceIn.getValue(), choiceOut.getValue());
      }
    });
    window.show();
  }

  public static void setOutput(String value) {
    outputLabel.setText(String.format("%s %s", OUTPUTTEXT, value));
  }
}
