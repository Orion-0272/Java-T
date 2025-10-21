/*
Arrays:
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
These values in array are known as element and are stored at contiguous memory location.
Each element have a particular index, which starts from 0 to infinite.

Syntax:
<datatype>[] <array-name> = {<value1>, <value2>, ......, <value n>};
*/

package NonPrimitiveDatatypes;

public class Arrays {
    public static void main(String[] args) {
        int[] integer_array = {1, 2, 3, 4, 5, 6};

        // We can access each element inside array using index.
        System.out.println(integer_array[0]); // OUTPUT: 1 as first element in array is 1.
        System.out.println(integer_array[1]);
        System.out.println(integer_array[2]);

        // Also we can iterate over the array to access all elements.
        System.out.println("------------- Output using loop -----------------");
        for (int index = 0; index < integer_array.length; index++) {
            System.out.println(integer_array[index]);
        }

        // -------------------------------------------------------------------------------------------------------------

        // This is a two-dimensional array. Basically an array inside another array. This is usually known as matrix.
        int[][] two_d_array = {
                {0, 2, 4, 6},
                {3, 5, 7, 9}
        };

        System.out.println("------------- Output of two dimensional array -----------------");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(two_d_array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
