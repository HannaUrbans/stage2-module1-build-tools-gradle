package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        try {boolean result = true;
        for (String elem : args) {
            double number = Double.parseDouble(elem);
            if (number<=0)
        {result = false;
            break;
            }}
       return result;}
        catch (NumberFormatException e | NullPointerException e)
        {return false;}
    }
}






