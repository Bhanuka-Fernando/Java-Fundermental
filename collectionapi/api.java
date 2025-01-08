package collectionapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class api {
    public static void main(String args[]){

        ArrayList<Integer> nums = new ArrayList<Integer>();  // add integer as generic
        nums.add(1);
        nums.add(4);
        nums.add(2);
        nums.add(3);

        Map<Integer,String> map = new HashMap<>();
        map.put(100,"java"); // keys must be unique values can be different

        System.out.println(nums.get(2)); // get specific number
        System.out.println(nums);
    }
}
