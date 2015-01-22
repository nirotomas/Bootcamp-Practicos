/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tomas
 */
public class ConvertNumber {
    String number;
    
    private static final String[] unidad = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    
    private static final String[] decena = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    
    private static final  String[] centena = {"houndred","million", "billion"};
    
    
    public void ConvertNumberToWord(int number){
    
        String aux = null;
        int aux1 = 0;
        
        if (number<=999){
            this. number = convertCent(number);
        }
        while(number>0){
            if (number%100 != 0){
                String s = convertCent(number%1000);
                if (aux1 > 0)
                    s = s+" "+centena[aux1-1];
                if (aux == null)    
                    aux = s;
                else
                    aux= s+", "+aux;
            }
            
            number /= 1000;
            aux1++;
        }//end while
        this.number = aux;        
    }

  
    
    public String convertCent(int number){
    
        String s = unidad[number/100]+" hundred";
        String aux = convertDec(number%100);
        if (number <= 99)
            return aux;
        else if (number % 100 == 0 )
            return s;
        else
            return s+""+aux;
    }
    
    public String convertDec(int number){
        if (number < 20){
            return unidad[number];
        }
        
        String s1 = decena [number/10-2]; 
         if (number%10 == 0)
             return s1;
         return s1+"-"+unidad[number%10];
    }
    
    
    @Override
    public String toString(){
        return ""+this.number;
    }
    
}
