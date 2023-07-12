import java.util.Arrays;

public class Kata {
    public static int[] sortArray(int[] array) {
        // Create a copy of the input array
        int[] sortedArray = Arrays.copyOf(array, array.length);
        
        // Create an array to store the odd numbers in the input array
        int[] oddNumbers = Arrays.stream(sortedArray)
                .filter(n -> n % 2 != 0)
                .sorted()
                .toArray();
        
        // Iterate over the original array and replace the odd numbers with the sorted odd numbers
        int oddIndex = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] % 2 != 0) {
                sortedArray[i] = oddNumbers[oddIndex];
                oddIndex++;
            }
        }
        
        return sortedArray;
    }
}