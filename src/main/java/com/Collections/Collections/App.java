package com.Collections.Collections;

public class App 
{
    public static void main( String[] args )
    {
        MyList ml=new MyList();
        ml.add(new Integer(2));
        ml.add(new Integer(3));
       System.out.println("Retrieving element at ind 1: "+ ml.get(1));
       ml.add(new Integer(4));
       ml.remove(2);
       ml.add(new Integer(2));
       ml.add(new Integer(3));
       ml.add(new Integer(3));
       ml.add(new Integer(3));
       System.out.print("All Elements in list are ");
       System.out.println(ml);
       System.out.println("Number of elements in list are:"+ml.size());
    }
}
