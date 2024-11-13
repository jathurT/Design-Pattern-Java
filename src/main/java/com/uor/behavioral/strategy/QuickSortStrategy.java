package com.uor.behavioral.strategy;

// Concrete Strategy
public class QuickSortStrategy implements SortingStrategy {
  @Override
  public void sort(int[] array) {
    System.out.println("Sorting array using Quick Sort Strategy");
  }
}
