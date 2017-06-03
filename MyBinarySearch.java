import java.util.Scanner;
import java.util.Arrays;

public class MyBinarySearch {


    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param  a the array of integers, must be sorted in ascending order
     * @param  key the search key
     * @return index of key in array {@code a} if present; {@code -1} otherwise
     */
    public static int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            /* Key is in a[lo..hi] or not present. */
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key <= a[mid]) {
                return mid;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    /**
     * Reads in a sequence of integers from the whitelist file, specified as
     * a command-line argument; reads in integers from standard input;
     * prints to standard output those integers that do <em>not</em> appear in the file.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int i = sc.nextInt();
        int[] array = new int[i];


        System.out.println("Enter " + i + " integers");

        for (int c = 0; c < i; c++) {
            array[c] = sc.nextInt();
        }

        System.out.println("Enter value to find");
        int search = sc.nextInt();

        MyBinarySearch mbs = new MyBinarySearch();
        Arrays.sort(array);
        System.out.println(search + " was found at index " + mbs.binarySearch(array, search) + " in array " + Arrays.toString(array));


//        MyBinarySearch mbs = new MyBinarySearch();
//        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
//        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
//        int[] arr1 = {6,34,78,123,432,900};
//        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
    }


}