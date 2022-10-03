package org.practical;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Survey {
    
    public static void main(String[] args)
    {
    Toothpaste ob;        
        Scanner sc = new Scanner(System.in);
        
        Map<Integer,Toothpaste> mapValue = new HashMap<Integer,Toothpaste>();
        
        System.out.println("Enter the Number of Customer");
        
        
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++)
        {
            mapValue.put(i, new Toothpaste());
        }
        
        
        for(Map.Entry<Integer, Toothpaste> entry:mapValue.entrySet()){    
            int key=entry.getKey();  
            Toothpaste b=entry.getValue();  
            System.out.println(key+" Data:");  
            System.out.println("ToothPaste: " + b.toothPasteTypes + "\nMember Type: " + b.memberTypes);    
            }
        
       System.out.println(Toothpaste.countToothPaste());
       System.out.println("The Maximum use of Brand is : "+Toothpaste.maxCount());
        
    }
}