
/*  CS310 Fall 2014
    Programming Assignment #1
    Sample driver program
    September 8, 2014
    Alan Riggins
*/    

import data_structures.*;
public class Driver {
    private OrderedListADT<Integer> v;
    
    public Driver() {
        v = new OrderedVector<Integer>();
        int size = 10000;
        for(int i=0; i < size; i++)
            v.insert(i);
        for(int i=size-1; i >= 0; i--)
            v.remove(i);
        print("Size is " + v.size()); 
        v.insert(25);
        v.insert(4);
        v.insert(22);
        v.insert(30);
        v.insert(2);
        for(Integer i : v)
            print(""+i);
        print("Size is " + v.size()); 
        int index = v.size()-1;   
        while(index >= 0)
            print("Removing "+v.remove(index--));
        }
        
    private void print(String val) {
        System.out.println(val);
        }
        
    public static void main(String [] args) {
        new Driver();
        }
    }