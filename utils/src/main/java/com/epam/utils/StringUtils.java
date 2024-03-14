package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         try {int number = Integer.parseInt(str);
             if (number>0)
             {return true;}
             else {return false;}

         }
         catch (NumberFormatException e)
         {System.out.println ("Введите число");
        return false;}
    }
}
