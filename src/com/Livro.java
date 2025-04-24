package com;

public class Livro {
  private String title;
  private String author;

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getDetails() {
       String str = """
          Title: %s
          Author: %s
        """;
       return String.format(str, this.title, this.author);
  }
}
