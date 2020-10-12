
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
//         write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12};
//        
//        System.out.println(smallest(array));
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);


//        String word = "market_data";
//        String label = word.replaceAll("_", " ");
//        System.out.println(label);

    }
    
    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int index = 0;
 
        while (index < array.length) {
            if (array[index] < smallest) {
                smallest = array[index];
            }
 
            index = index + 1;
        }
 
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int placeOfSmallest = 0;
 
        int index = 0;
        while (index < array.length) {
            if (array[index] < array[placeOfSmallest]) {
                placeOfSmallest = index;
            }
 
            index = index + 1;
        }
 
        return placeOfSmallest;
    }
    
      public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int placeOfSmallest = startIndex;
 
        int index = startIndex;
        while (index < array.length) {
            if (array[index] < array[placeOfSmallest]) {
                placeOfSmallest = index;
            }
 
            index = index + 1;
        }
 
        return placeOfSmallest;
    }
      
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length - 1) {
            int smallestAt = indexOfSmallestFrom(array, index);
            swap(array, index, smallestAt);
 
            index = index + 1;
        }
    }   

}
