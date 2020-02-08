package src.main.java;


import src.main.java.Chocolate.*;
import src.main.java.Sweet.*;
import src.main.java.Gift.*;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        int option;
    	Scanner in = new Scanner(System.in);
    	
    	Chocolate chocolate1=new Chocolate("Cadbury Dairy Milk",60,20);
        Chocolate chocolate2=new Chocolate("Barone",30,20);
        Chocolate chocolate3=new Chocolate("Galaxy",50,20);
        
        Sweet sweets1=new Sweet("Gulabjamun",300,200);
        Sweet sweets2=new Sweet("Kheer",300,100);
        Sweet sweets3=new Sweet("Kajukatli",300,100);
        Sweet sweets4=new Sweet("Rasgulla",400,100);
    	
    	Gift gift=new Gift();
        gift.addChocolates(chocolate1,chocolate2,chocolate3);
        gift.addSweets(sweets1,sweets2,sweets3,sweets4);
    	
        do{
        	System.out.println("----------NEW YEAR GIFT----------");
        	System.out.println("1 - Chocolates");
        	System.out.println("2 - Sweets");
        	System.out.println("3 - Chocolates and Sweets");
        	System.out.print("Enter Your Choice : ");
        	option = in.nextInt();
        	switch(option)
        	{
        		case 1: System.out.println("Chocolates Block Selected");
        				ArrayList<Chocolate> arrayList = gift.getChocolates();
        				
        				for (Chocolate c:arrayList) {
        					System.out.println(c.toString());
        				}
        				System.out.println();
        				break;
        				
        		case 2: System.out.println("Sweets Block Selected");
        				ArrayList<Sweet> arrayList1 = gift.getSweets();
        				
        				for (Sweet s:arrayList1){
        					System.out.println(s.toString());
        				}
        				System.out.println();
        				break;
        				
        		case 3: System.out.println("Chocolates and Sweets Block Selected");
        				ArrayList<Chocolate> arrayList2 = gift.getChocolates();
        				ArrayList<Sweet> arrayList3 = gift.getSweets();
        				
        				for (Chocolate c:arrayList2) {
        					System.out.println(c.toString());
        				}
        				System.out.println();
        				for (Sweet s:arrayList3){
        					System.out.println(s.toString());
        				}
        				System.out.println();        				
        				break;
        		default:System.out.println("Invalid Option");
        				break;
        	}
        }while(option < 4);
        in.close();
    }
}