package data_structures;

import java.util.*;

public class CollectionView {

        /**
         * INSTRUCTIONS
         * <p>
         * A map is given to you below, with some data inserted into it.
         * <p>
         * Retrieve the Collection view of the values present in map
         */

        public static void main(String[] args) {

                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(5, "San Jose");
                map.put(6, "Seattle");
                map.put(2, "LA");
                map.put(4, "Boston");
                map.put(1, "NYC");
                map.put(3, "Denver");

                Set set = map.entrySet();//Converting to Set so that we can traverse
                Iterator itr = set.iterator();
                while (itr.hasNext()) {
                        //Converting to Map.Entry so that we can get key and value separately
                        Map.Entry entry = (Map.Entry) itr.next();
                        System.out.println(entry.getKey() + " " + entry.getValue());


                }
        }
}