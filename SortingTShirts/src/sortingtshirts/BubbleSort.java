package sortingtshirts;

import models.TShirt;
import printing.Print;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {


    //bubblesort method
    Print pr= new Print();
    public List<Integer> bubbleSort(List<Integer> arr) {
        List<Integer> arr2 = new ArrayList<>(arr);
        int n = arr2.size(); // 5
        for (int i = 0; i < n - 1; i++) // i = 0, 1
        {
            for (int j = 0; j < n - i - 1; j++) // j = 5-0-1 = 4, 5-1-1 = 3  bubblesort
            {
                if (arr2.get(j) > arr2.get(j + 1)) { //search array bubblesort
                    // swap arr[j+1] and arr[j]
                    int temp = arr2.get(j);
                    arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                    arr2.set(j + 1, temp); // arr[j+1] = temp;
                }
            }
        }
        return (arr2); //return sorted array
    }

    //bubblesort (by size)
    private List<TShirt> bubbleSortTShirtsBySize(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC
    // sortingType = 1 - DESC
    {
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();  //SIZE
        switch (sortingType) {
            //ASCENDING
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() > arr2.get(j + 1).getSize().ordinal()) {  //Ordinal enum  ASC SIZE
                            // swap arr[j+1] and arr[j]
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }

                break;
            //DESCEDING
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() < arr2.get(j + 1).getSize().ordinal()) {  // Ordinal enum DESC SIZE
                            // swap arr[j+1] and arr[j]
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }
                break;
        }

        return (arr2);
    }

    private List<TShirt> bubbleSortTShirtsByColor(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC
    // sortingType = 1 - DESC
    {
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getColor().ordinal() > arr2.get(j + 1).getColor().ordinal()) {  //COLOR ASC
                            // swap arr[j+1] and arr[j]
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getColor().ordinal() < arr2.get(j + 1).getColor().ordinal()) {  //COLOR DESC
                            // swap arr[j+1] and arr[j]
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }
                break;
        }

        return (arr2);
    }

    private List<TShirt> bubbleSortTShirtsByFabric(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC
    // sortingType = 1 - DESC
    {
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getFabric().ordinal() > arr2.get(j + 1).getFabric().ordinal()) {
                            // swap arr[j+1] and arr[j]
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getFabric().ordinal() < arr2.get(j + 1).getFabric().ordinal()) {
                            // swap arr[j+1] and arr[j]
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }
                break;
        }

        return (arr2);
    }


    /* CHOOSE bubbleSortTShirts
    0-SIZE
    1-COLOR
    2-FABRIC

    // sortingType = 0 - ASC
    // sortingType = 1 - DESC
     */
    public void bubbleSortTShirts(List<TShirt> arr, int sortByAttribute, int sortingType) {
        List<TShirt> arr2 = new ArrayList<>(arr);
        if (sortingType == 0) {
            switch (sortByAttribute) {
                // ASC
                case 0:
                    arr2 = bubbleSortTShirtsBySize(arr2, 0);
                    pr.printArray(arr2);
                    break;
                // DESC
                case 1:
                    arr2 = bubbleSortTShirtsByColor(arr2, 0);
                    pr.printArray(arr2);
                    break;
                case 2:
                    arr2 = bubbleSortTShirtsByFabric(arr2, 0);
                    pr.printArray(arr2);
                    break;
            }
        } else {
            switch (sortByAttribute) {
                // desc
                case 0:
                    arr2 = bubbleSortTShirtsBySize(arr2, 1);
                    pr.printArray(arr2);
                    break;
                // DESC
                case 1:
                    arr2 = bubbleSortTShirtsByColor(arr2, 1);
                    pr.printArray(arr2);
                    break;
                case 2:
                    arr2 = bubbleSortTShirtsByFabric(arr2, 1);
                    pr.printArray(arr2);
                    break;
            }
            }


        }

        }


