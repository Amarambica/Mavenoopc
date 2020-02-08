package src.main.java;
//package com.epam.oops.Gifts;

import src.main.java.Chocolate.*;
import src.main.java.Sweet.*;

import java.util.*;

public class Gift {

	private ArrayList<Chocolate> chocolates;
	private ArrayList<Sweet> sweets;
	
	public Gift() {
		
		chocolates = new ArrayList<Chocolate>();
		sweets = new ArrayList<Sweet>();
		
	}
	
	public void addChocolates(Chocolate... chocolates){
        this.chocolates.addAll(Arrays.asList(chocolates));
    }

    public void addSweets(Sweet... sweets){
        this.sweets.addAll(Arrays.asList(sweets));
    }
    
    public ArrayList<Chocolate> getChocolates() {
        return chocolates;
    }

    public ArrayList<Sweet> getSweets() {
        return sweets;
    }
    
    public int findTotalWeight(){
        int weight = 0;
        
        for(Chocolate c: this.chocolates)
            weight += c.getWeight(weight);
        for(Sweet s: this.sweets)
              weight += s.getWeight(weight);

        return weight;
    }

}