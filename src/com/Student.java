package com;
import java.util.ArrayList;

public class Student {
  private String name;
  private ArrayList<Double> notes = new ArrayList<Double>();
  
  public void pushNote(double note) {
    notes.add(note);
  }

  public void setName(String name) {
    this.name = name;
  }

  public double calculateMedia() {
    double sum = 0;

    for (int i = 0; i < notes.size(); i++) {
      sum += notes.get(i);
    }
    return sum / notes.size();
  }
}
