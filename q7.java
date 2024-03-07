package map_classwork;

import java.util.*;


public class q7 {
    public static void main(String[] args) {
    	 Map<String,Double> exchangeRates = new TreeMap<>();
    	 exchangeRates.put("USD", 1.0);
         exchangeRates.put("EUR", 0.83);
         exchangeRates.put("GBP", 0.71);
         
         for (String code : exchangeRates.keySet()) {
        	 System.out.println("Code: " + code + ", Rate: " + exchangeRates.get(code));
             
         }
         
     
        
    }
}