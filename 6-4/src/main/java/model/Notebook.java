package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Notebook implements Serializable {
  private List<Note> notes = new ArrayList<>();

  public void addNote(Note note) {
    notes.add(note);
  }

  @Override
  public String toString() {
    String out = "";
    for (Note note : notes) {
      out += note.getTitle() + "\n  " + note.getContent() + "\n\n";
    }
    return out;
  }
}
