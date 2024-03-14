package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean result = true;
        if (args == null || args.isEmpty()){
            return false;
        }
        for (String elem : args) {
            try {
                double number = Double.parseDouble(elem);
                if (Double.isNaN(number) || number <= 0) {
                    result = false;
                    break;
                } }
            catch (NumberFormatException | NullPointerException e){
            result = false;
        }
    }
    return result;
}}






