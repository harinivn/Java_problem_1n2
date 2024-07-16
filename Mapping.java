//Write a java program to test if a map contains a mapping for the specified value

import java.util.*;

public class Mapping {
    public static void main(String args[]){
        HashMap <Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3,"Balck");
        hash_map.put(4,"white");
        hash_map.put(5,"blue");

        //print the map
        System.out.println("The Original map: " + hash_map);
        System.out.println("1. Is value \'Green\' exists? ");
        if(hash_map.containsValue("Green")){
            System.out.println("yes!");
        }else{
            System.out.println("no!");
        }
        if(hash_map.containsValue("orange")){
            System.out.println("yes");
        }else{
            System.out.println("no!");
        }

    }
}
