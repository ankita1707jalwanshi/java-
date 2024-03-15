package com.basic.Maps;

import java.util.*;

public class Keyvalus {
    public static void main(String[] args) {
        HashMap<Integer,String> m = new HashMap<>();
        m.put(12,"Arun");
        m.put(11,"Raushan");
        m.put(13,"Roshani");
        m.put(14,"Annu");

        System.out.println(m);
        Set set = m.entrySet();
        System.out.println(set);                                //it will return set value
                                                                  //it return set value
//        Iterator itr = set.iterator();
//        while (itr.hasNext()){                                  // it will check there is next value or not.
//       System.out.println(itr.next());
//                                                               //Map.entery filter the key and value.
//            Map.Entry maentry =  (Map.Entry)itr.next();
//            System.out.println(maentry.getKey()+" "+maentry.getValue());
//        }

         for(Map.Entry str : m.entrySet()){
             System.out.println(str.getKey()+" -> "+ str.getValue());
         }

//        String s1 = new String("Arun");
//        String s2 = new String("Arun");
//        String s3 = s1;
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);
//        System.out.println(s1==s2);

    }
}
