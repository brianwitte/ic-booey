package com.booey.ic;

import com.booey.ic.pre.HashTablesAndSorting;


/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        HashTablesAndSorting.bruteForce(intArray, 8);
    }
}
