/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtshirts;

import java.util.ArrayList;
import java.util.List;

import jdk.swing.interop.SwingInterOpUtils;
import models.TShirt;
import models.Timer;
import models.random.RandomTShirt;
import printing.Print;

/**
 * @author George.Pasparakis
 */
public class SortingTShirts {
    static List<TShirt> randomTShirts;

    /**
     *
     */
    public static void View() {
        int numberOfRandomTShirts = 5;
        Print p = new Print();
        BubbleSort bub = new BubbleSort();
        QuickSort qs = new QuickSort();
        BucketSort b = new BucketSort();
        RandomTShirt r = new RandomTShirt();
        p.printArrayOriginal(numberOfRandomTShirts);
        Print pr = new Print();
        randomTShirts = new ArrayList<>(numberOfRandomTShirts);
        for (int i = 0; i < numberOfRandomTShirts; i++) {
            randomTShirts.add(new RandomTShirt());
            System.out.println(randomTShirts.get(i));
        }

        System.out.println("-------------Bucket sorted----------------");
        //Size
        //asc
        System.out.println("\nBucket Sorted Array By Size Ascending");
        Timer bucketTimer = new Timer();
        b.bucketSortTShirts(randomTShirts, 0, 0);
        bucketTimer.stop();
        System.out.println("Bucket Sort Time: " + bucketTimer.elapsedTime());
        System.out.println();
        //desc
        System.out.println("\nBucket Sorted Array By Size Desc");
        b.bucketSortTShirts(randomTShirts, 0, 1);
//      color
        //asc
        System.out.println();
        System.out.println("\nBucket Sorted Array By Color Asc");
        b.bucketSortTShirts(randomTShirts, 1, 0);
//      desc
        System.out.println();
        System.out.println("\nBucket Sorted Array By color Desc");
        b.bucketSortTShirts(randomTShirts, 1, 1);
//      fabric
        //asc
        System.out.println();
        System.out.println("\nBucket Sorted Array By Fabric Asc");
        b.bucketSortTShirts(randomTShirts, 2, 0);
        //desc
        System.out.println();
        System.out.println("\nBucket Sorted Array By fabric Desc");
        b.bucketSortTShirts(randomTShirts, 2, 1);
        System.out.println();

        b.bucketSortTShirtsBySizeThenColorThenFabric(randomTShirts, 0);

//-------------------------------------------------------------------------------------------------------//

        //bubble sorted
        System.out.println("-------------Bubble sorted----------------");
        System.out.println("\nBubble Sorted Array By Size Ascending");
        bub.bubbleSortTShirts(randomTShirts, 0, 0);
        System.out.println("\nBubble Sorted Array By size Des");
        bub.bubbleSortTShirts(randomTShirts, 0, 1);
        System.out.println("\nBubble Sorted Array By COLOR Ascending");
        bub.bubbleSortTShirts(randomTShirts, 1, 0);
        System.out.println("\nBubble Sorted Array By COLOR DES");
        bub.bubbleSortTShirts(randomTShirts, 1, 1);
        System.out.println("\nBubble Sorted Array By FABRIC Ascending");
        bub.bubbleSortTShirts(randomTShirts, 2, 0);
        System.out.println("\nBubble Sorted Array By FABRIC DES");
        bub.bubbleSortTShirts(randomTShirts, 2, 1);

//  //QUICK SORT
//
        System.out.println("\nQuick Sorted Arrays ----");

        System.out.println("By size asceding");
        pr.printArray(qs.quickSortTShirts(randomTShirts, 0, numberOfRandomTShirts - 1, 0, 0));
        System.out.println("By color asc");
        pr.printArray(qs.quickSortTShirts(randomTShirts, 0, numberOfRandomTShirts - 1, 1, 0));
        System.out.println("By Fabric asc");
        pr.printArray(qs.quickSortTShirts(randomTShirts, 0, numberOfRandomTShirts - 1, 2, 0));
//
        System.out.println("\nQuick Sorted Arrays ----");
        System.out.println("By size des");
        pr.printArray(qs.quickSortTShirts(randomTShirts, 0, numberOfRandomTShirts - 1, 0, 1));
        System.out.println("By color des");
        pr.printArray(qs.quickSortTShirts(randomTShirts, 0, numberOfRandomTShirts - 1, 1, 1));
        System.out.println("By Fabric des");
        pr.printArray(qs.quickSortTShirts(randomTShirts, 0, numberOfRandomTShirts - 1, 2, 1));
    }
}