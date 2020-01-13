package com.booey.ic.pre;

import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HashTablesAndSorting {

    static Logger logger = Logger.getLogger(HashTablesAndSorting.class.getName());

    public static List<Pair> bruteForce (int[] arr, int num){

        List<Pair> pairList = new ArrayList();

        for(int i=0; i < arr.length; i++) {
            for (int j=0;j < arr.length; j++) {
                if (i + j == num){
                    pairList.add(new Pair(i, j));
                }
            }
        }
        logger.log(Level.INFO, pairList.toString());
        return pairList;
    }
}
