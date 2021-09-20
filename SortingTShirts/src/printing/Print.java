/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

import models.TShirt;
import models.random.RandomTShirt;
import sort.Sort;
import sortingtshirts.BucketSort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George.Pasparakis
 */
public class Print {
    private int num;
    //BucketSort s = new BucketSort();
    /* Prints the array */
    public void printArray(List<TShirt> arr)
    { 
        //int n = arr.size();
        for (TShirt ts : arr) {
            System.out.println(ts);
        }
    }

public void printArrayOriginal(int num){
    //Original array
    this.num=num;
    System.out.println("Original Array");
      // create an array of random Tshirts
        List<TShirt> randomTShirts = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
        randomTShirts.add(new RandomTShirt());
        //print
        System.out.println(randomTShirts.get(i));


        }

        //s.bucketSortTShirtsBySizeThenColorThenFabric(randomTShirts, 0);
    }
}
