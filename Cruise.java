package org.practical;
import java.util.*;
public class Cruise {
    public static void main(String[] args) 
    {
    Hash ob;    	
    	Scanner sc = new Scanner(System.in);
        
        Map<Integer,Hash> mapValue = new HashMap<Integer,Hash>();
        
        System.out.println("Enter the Number of Travelers You want On the Cruise");
        
        
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++) 
        {
            mapValue.put(i, new Hash());
        }
        
        //System.out.println("The Values are: "+mapValue.toString());
        
        for(Map.Entry<Integer, Hash> entry:mapValue.entrySet()){    
            int key=entry.getKey();  
            Hash b=entry.getValue();  
            System.out.println(key+" Data:");  
            System.out.println("Name: " + b.name + "\nAge: " + b.age + "\nMember Type: " + b.memberTypes+"\nFees: "+b.fee);    
            } 
        
       System.out.println(Hash.countMembers());
        
    }
}