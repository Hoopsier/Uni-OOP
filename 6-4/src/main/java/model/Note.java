package model;

public class Note {
  private String title;
  private String content;

  public Note(String _title, String _content) {
    title = _title;
    content = _content;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }
}
