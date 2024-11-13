package com.uor.behavioral.strategy;

// Concrete Strategy
public class BubbleSortStrategy implements SortingStrategy {
  @Override
  public void sort(int[] array) {
    System.out.println("Sorting array using Bubble Sort Strategy");
  }
}
