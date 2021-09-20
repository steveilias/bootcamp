package sortingtshirts;

import models.TShirt;
import models.enums.Size;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
    QuickSort s = new QuickSort();


    // Step 1: divide to n + 1 buckets as the number of elements,
    // e.g. if we have 10 elements then we create 10 buckets
    // Step 2: place similar data to each bucket,
    // e.g. 1: { 10, 11, 22, 2, 19, 3, 17}
    // n = 7, b[0], b[1], b[2], b[3], b[4], b[5], b[6], b[7]
    // b[1] = { 10, 11, 19, 17}
    // b[2] = { 22, 2 }
    // b[3] = { 3 }
    // e.g. 2: { 0, 0, 1, 3, 0, 4, 2, 3 }
    // int n = randomTShirts.size();
    // List<TShirt>[] buckets = new List<TShirt>[randomTShirts.size()]();
    // b[0] = { 0, 0, 0 }
    // b[1] = { 1, 1, 1, 1, 1 } <----- randomTShirts.get(22).getSize().ordinal() = 1
    // b[2] = { 2 }
    // b[3] = { 3, 3 }
    // b[4] = { 4 }
    // Step 3: sort each bucket ??????????
    public void bucketSortTShirts(List<TShirt> randomTShirts, int sortByAttribute, int sortingType) {
        // Step 1 - Create buckets, Size.length
        int noOfBuckets = Size.values().length;

        // Step 1, create noOfBuckets buckets
        List<TShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
            buckets[i] = new ArrayList<TShirt>(); // initialize the buckets
        }

        // Step 2, divide into buckets
        for (TShirt tShirt : randomTShirts) {
//              System.out.println(tShirt.getSize().ordinal()); // 3
            switch (sortByAttribute) {
                case 0:
                    buckets[tShirt.getSize().ordinal()].add(tShirt);
                    break;
                case 1:
                    buckets[tShirt.getColor().ordinal()].add(tShirt);
                    break;
                case 2:
                    buckets[tShirt.getFabric().ordinal()].add(tShirt);
                    break;
            }
        }

        // Step 3, print
        // just print the contents of each bucket
        if (sortingType == 0) {
            for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
                for (int j = 0; j < buckets[i].size(); j++) {

                    System.out.println(buckets[i].get(j));
                }
            }
        } else if ((sortingType == 1) ){
           for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
                for (int j = 0; j < buckets[i].size(); j++) {
                    System.out.println(buckets[i].get(j));
                }
           }
        }
    }

    public void bucketSortTShirtsBySizeThenColorThenFabric(List<TShirt> randomTShirts, int sortingType) {
        List<TShirt> tShirts = new ArrayList<>();

        // Step 1 - Create noOfBuckets buckets, Size.length
        int noOfBuckets = Size.values().length;

        List<TShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
            buckets[i] = new ArrayList<TShirt>(); // initialize the buckets
        }

        // Step 2, divide into buckets, Sort By Size
        for (TShirt tShirt : randomTShirts) {
            buckets[tShirt.getSize().ordinal()].add(tShirt);
        }

        // Step 3, Sort By Color
        for (List<TShirt> bucket : buckets) {
            s.quickSortTShirts(bucket, 0, bucket.size() - 1, 1, 0);

            // Step 4, Sort By Fabric
            List<TShirt> bucketByFabric = new ArrayList<>(bucket);
            bucketSortTShirts(bucketByFabric, 2, 0);
            s.quickSortTShirts(bucketByFabric, 0, bucketByFabric.size() - 1, 2, 0);
            bucket = bucketByFabric;
        }

        // combine all the buckets to 1 List
        for (List<TShirt> bucket : buckets) {
            for (TShirt tShirt : bucket) {
                tShirts.add(tShirt);
            }
        }

        System.out.println("\nBucket Sorted Array By Size Ascending and By Color Ascending and by Fabric Ascending");
        for (TShirt tShirt : tShirts) {
            System.out.println(tShirt);
        }
    }
}
