package com.epam.rd.autotasks.max;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        if (values == null || values.length == 0) {
            return OptionalInt.empty();
        }

        int maxValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }

        return OptionalInt.of(maxValue);
    }
}
/*
* The code is an implementation of the max method of the MaxMethod class.

The method receives an array of integer values and returns the maximum value among
* the array elements as OptionalInt. The OptionalInt is a class from the java.util package
* that provides a container for an optional value of a primitive type int.
* It is used to represent the presence or absence of a value.

The code uses the stream API from the java.util.stream package to calculate the maximum
*  value of the integer array. It first checks if the input array is either null or empty.
* If it's the case, the method returns an empty OptionalInt.
* If the array is not empty, the method uses the stream API to return the maximum value of
* the array as OptionalInt. The code uses the max method of the IntStream class to get
* the maximum value of the array and then uses the OptionalInt.of method to return
* the result as OptionalInt.

Example:
Let's consider the following example:
* int[] vals = new int[]{-2, 0, 10, 5};
OptionalInt result = MaxMethod.max(vals);
System.out.println(result.getAsInt() == 10); // true
*
* In this example, vals is an integer array with 4 elements, -2, 0, 10, 5.
* The MaxMethod.max(vals) method returns the maximum value of the array, which is 10, as OptionalInt.
* Then, the getAsInt method is called on the result object to retrieve the actual value, which is 10.
* Finally, the result of result.getAsInt() == 10 is compared and it returns true.
* */
