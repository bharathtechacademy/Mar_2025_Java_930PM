package assignments;

public class Assignment10_SortingNumbersWithTemp {

    public static void main(String args[]) {
        
        // Declaring and initializing an integer array with 7 elements
        int[] array = { 12, 34, 11, 36, 87, 98, 93 };
        
        // Declaring a temporary variable used for swapping values during sorting
        int temp = 0;

        // Outer loop to iterate through the array elements
        for (int i = 0; i < array.length; i++) {
            
            // Inner loop to compare the current element with the remaining elements
            for (int j = i + 1; j < array.length; j++) {
                
                // If the current element is smaller than the next element
                // This condition ensures sorting in descending order
                if (array[i] < array[j]) {
                    
                    // Swapping the two elements using the temporary variable
                    temp = array[i];     // Store array[i] in temp
                    array[i] = array[j]; // Replace array[i] with array[j]
                    array[j] = temp;     // Put the stored value in array[j]
                }
            }
        }

        // After sorting, the array is in descending order
        // array[0] is the largest, array[1] is the second largest, etc.

        // Printing the second largest number (at index 1)
        System.out.println("Second largest number is :" + array[1]);

        // Printing the third largest number (at index 2)
        System.out.println("Third largest number is :" + array[2]);
    }
}
