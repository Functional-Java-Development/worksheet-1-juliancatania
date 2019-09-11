package com.gig;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {



                Integer intArray[] = new Integer[100];

                Arrays.setAll(intArray, variable -> getRandomNumber());

                Arrays.sort(intArray, (var1, var2) -> {

                    if (var1.toString().length() == var2.toString().length()) {

                        return var2.compareTo(var1);

                    }

                            return var1.compareTo(var2);

                        }

                        );

        for (Integer variable: intArray) {

            System.out.println(variable);
        }

    }

    public static int getRandomNumber()
    {
        int x = (int) (Math.random() * ((56 - 1) + 1)) ;
        return x;
    }
}


