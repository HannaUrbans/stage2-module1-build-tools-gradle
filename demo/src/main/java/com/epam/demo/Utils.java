package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean result = true;
        for (String elem : args) {
            int number = Integer.parseInt(elem);
            if (number<=0)
        {result = false;
            break;
            }}
       return result;
    }
}






