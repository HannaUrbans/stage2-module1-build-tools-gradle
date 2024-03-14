package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         try {double number = Double.parseDouble(str);
             if (number>0)
             {return true;}
             else {return false;}

         }
         catch (NumberFormatException e)
         {return false;}
    }
}
