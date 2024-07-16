//Write a program to convert hashset to treeset

import java.util.*;
public class Hashtotree{
    public static void main(String[] args){
        //Create an empty hash set
    HashSet<String> h_set = new HashSet<String>();

    //use add() method to add values in the hash set
    h_set.add("Red");
    h_set.add("Green");
    h_set.add("Black");
    h_set.add("white");
    h_set.add("Pink");
    h_set.add("yellow");
    System.out.println("Original Hash Set: " +h_set);

    //Create a TreeSet of Hashelements
    Set<String> tree_set = new TreeSet<String>(h_set);

    //Display TreeSet elements
    System.out.println("Treeset elements:");
    for(String element : tree_set){
        System.out.println(element);
    }
    }
}