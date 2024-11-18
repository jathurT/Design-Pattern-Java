package com.uor.behavioral.strategy;

// Context class
public class SortingContext {

  private SortingStrategy sortingStrategy;

  public SortingContext() {

  }

  public SortingContext(SortingStrategy sortingStrategy) {
    this.sortingStrategy = sortingStrategy;
  }

  public void setSortingStrategy(SortingStrategy sortingStrategy) {
    this.sortingStrategy = sortingStrategy;
  }

  public void performSort(int[] array) {
    sortingStrategy.sort(array);
  }
}
