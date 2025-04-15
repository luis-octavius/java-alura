package com;
import java.util.ArrayList;

public class Student {
  private String name;
  private ArrayList<double> notes = new ArrayList<double>();
  
  public void pushNote(int note) {
    notes.add(note);
  }

  public void setName(String name) {
    this.name = name;
  }
}
