package com.ArrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        String[] friendsArray = {"John", "Chris", "Eric", "Luke"};

        ArrayList<String> friendsArrayList =
                new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        // Retrieve element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));

        // Get size of array
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        // Add element to end of array
        // Can't do it with Array
        friendsArrayList.add("Mitch");
        System.out.println(friendsArrayList.get(4 ));

        // Change a particular element
        friendsArray[0] = "Carl";
        System.out.println(friendsArray[0]);
        friendsArrayList.set(0, "Carl");
        System.out.println(friendsArrayList.get(0));

        // Remove an element
        // Can't do it with Array, has fixed size
        friendsArrayList.remove("Chris");
        System.out.println(friendsArrayList.get(1));

        // Print the array
        System.out.println(friendsArray);
        System.out.println(friendsArrayList);

        // Removing test
        friendsArrayList.add("Eric");
        System.out.println(friendsArrayList);
        friendsArrayList.remove("Eric");
        System.out.println(friendsArrayList);
        friendsArrayList.remove("Eric");
        System.out.println(friendsArrayList);

















    }
}
