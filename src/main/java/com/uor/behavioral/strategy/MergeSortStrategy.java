package com.uor.behavioral.strategy;

// Concrete Strategy
public class MergeSortStrategy implements SortingStrategy {
  @Override
  public void sort(int[] array) {
    System.out.println("Sorting array using Merge Sort Strategy");
  }
}
