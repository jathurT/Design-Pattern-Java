package com.uor.behavioral.strategy;

public class Client {
  public static void main(String[] args) {
    SortingContext sortingContext = new SortingContext(new QuickSortStrategy());
    int[] array = {1, 5, 3, 2, 4};
    sortingContext.performSort(array);

    sortingContext.setSortingStrategy(new MergeSortStrategy());
    sortingContext.performSort(array);

    sortingContext.setSortingStrategy(new BubbleSortStrategy());
    sortingContext.performSort(array);
  }
}
