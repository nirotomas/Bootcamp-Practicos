/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tomas
 */
public class RomanToDecimal {

        
    private int[]    dec = { 1000,  900,  500,  400,  100,   90,  
                                               50,   40,   10,    9,    5,    4,    1 };

    private String[] roman = { "M",  "CM",  "D",  "CD", "C",  "XC",
                                             "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
    
    public static void romanToDecimal(java.lang.String romanNumber) {
    int decimal = 0;

    
    int lastNumber = 0;
    String romanNumeral = romanNumber.toUpperCase();
         /* operation to be performed on upper cases even if user enters roman values in lower case chars */
    for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
        char convertToDecimal = romanNumeral.charAt(x);

        switch (convertToDecimal) {
            case 'M':
                decimal = processDecimal(1000, lastNumber, decimal);
                lastNumber = 1000;
                break;

            case 'D':
                decimal = processDecimal(500, lastNumber, decimal);
                lastNumber = 500;
                break;

            case 'C':
                decimal = processDecimal(100, lastNumber, decimal);
                lastNumber = 100;
                break;

            case 'L':
                decimal = processDecimal(50, lastNumber, decimal);
                lastNumber = 50;
                break;

            case 'X':
                decimal = processDecimal(10, lastNumber, decimal);
                lastNumber = 10;
                break;

            case 'V':
                decimal = processDecimal(5, lastNumber, decimal);
                lastNumber = 5;
                break;

            case 'I':
                decimal = processDecimal(1, lastNumber, decimal);
                lastNumber = 1;
                break;
        }
    }
    
    System.out.println(decimal);
}

    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
         return lastDecimal - decimal;
        } else {
         return lastDecimal + decimal;
       }
    }

    public String decimalToRoman(int number){
        String aux="";
        
            for (int i=0; i<13; i++) // i<13 because the total unique numbers stored in the above array=13
            {
                /*The while loop is for printing repeated digits like XXX for 30 etc
                   and is also calculating the equivalent Roman number by adding the corresponding
                   Roman Digits from the Array to the String str*/
            while (number >= dec[i])
                {
                number = number-dec[i];
                aux = aux+roman[i];
                }
            }
         
            return aux;
        }
    
}
