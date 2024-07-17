//Write a java program to get all keys from a Tree Map

import java.util.*;

public class TreeMapping {
public static void main(String[] args) {
    //Create a tree map
    TreeMap<String,String> tree_map1 = new TreeMap<String, String>();

    //put elements to the map
    tree_map1.put("C1", "Red");
    tree_map1.put("C2","Green");
    tree_map1.put("C3","Black");
    tree_map1.put("C4","white");

    Set<String> keys = tree_map1.keySet();
    for(String key : keys){
        System.out.println(key);
    }
}
    
}
