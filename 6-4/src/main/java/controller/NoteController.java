package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Note;
import model.Notebook;

public class NoteController {
  Notebook notebook = new Notebook();

  @FXML
  private Text notes;

  @FXML
  private TextField titleField;
  @FXML
  private TextArea contentField;
  @FXML
  private Button addBtn;

  @FXML
  private void addNote() {
    notebook.addNote(new Note(titleField.textProperty().getValue(), contentField.textProperty().getValue()));
    loadNotes();
  }

  private void loadNotes() {
    notes.textProperty().setValue(String.format("Notes:\n%s", notebook));
  }
}
