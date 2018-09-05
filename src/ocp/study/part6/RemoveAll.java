package ocp.study.part6;

import java.util.*;

/*
 Develop code that uses Java SE 8 collection improvements, including Collection.removeIf(), List.replaceAll(), 
 Map.computeIfAbsent(), and Map.computeIfPresent() methods
 */

public class RemoveAll {

    public static void main(String[] args) {

        // create an empty array list
        ArrayList<String> color_list = new ArrayList<String>();

        // use add() method to add values in the list
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");

        // create an empty array sample with an initial capacity
        ArrayList<String> sample = new ArrayList<String>();

        // use add() method to add values in the list
        sample.add("Green");
        sample.add("Red");
        sample.add("White");

        // remove all elements from second list if it exists in first list
        sample.removeAll(color_list);

        System.out.println("First List :" + color_list);
        System.out.println("Second List :" + sample);

    }
}
