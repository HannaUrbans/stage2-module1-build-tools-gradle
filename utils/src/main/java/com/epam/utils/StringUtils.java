package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null){
return false;
}
         try {double number = Double.parseDouble(str);
             if (number>0 && !Double.isNaN(number))
             {return true;}
             else {return false;}

         }
         catch (NumberFormatException | NullPointerException e)
         {return false;}
    }
}

