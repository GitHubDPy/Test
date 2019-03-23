package com.wch.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TransferTest2 {
	
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        Person change = change(person);
        System.out.println(person);
        System.out.println(change);
        List list = new ArrayList<>();
        list.add(null);
        Set  set  =  new HashSet<>();
        set.add(null);
       
        
        
  
    }

    public static Person change(Person p) {
        p = new Person();
        return p;
    }
}

/**
 * Person类
 */
class Person {

}