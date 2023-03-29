package dailycode;

import java.util.HashSet;
import java.util.Set;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 2;
        arr[3] = 9;
        arr[4] = 1;

        int[] arr2 = new int[5];
        arr2[0] = 3;
        arr2[1] = 7;
        arr2[2] = 2;
        arr2[3] = 9;
        arr2[4] = 1;

//        findSecondLargest(arr);
//        findLargest(arr);
//          sumArr(arr);
//          minArr(arr);
//            reverse(arr);
            commonElements(arr, arr2 );
    }
//    Write a Java program to find the second-largest element in an array.
public static void findSecondLargest(int[] arr) {
    int largest = Integer.MIN_VALUE;
    System.out.println(largest);
    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }
    System.out.println(largest);
    System.out.println(secondLargest);
}
public static void findSecondGrande(int[] arr) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length ; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            arr[i] = largest;
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }
        }
//         Write a Java program to find the sum of all the elements in an array.
    public static void sumArr(int[] arr) {
        int sum= 0;
        for (int i = 0; i < arr.length ; i++) {
          sum += arr[i];
        }
        System.out.println(sum);
    }
//        Write a Java program to find the maximum element in an array.
        public static void findLargest(int[] arr) {
         int largest = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length ; i++) {
                if(arr[i] > largest) {
                    largest = arr[i];
                }
            }
            System.out.println(largest);
        }
//        Write a Java program to find the minimum element in an array.
    public static void minArr(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
//    Write a Java program to reverse an array.
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }

//    Write a Java program to find the common elements between two arrays
    public static void commonElements(int[] arr, int[] arr2) {
        //Create a HashSet to store the common elements
        Set<Integer>  commonElements = new HashSet<>();
        //Loop through arr and add all elements to the HashSet
        for(int i : arr) {
            commonElements.add(i);
        }
        // Loop through arr2 and check if each element is in the HashSet
        for (int i : arr2) {
            if(commonElements.contains(i)) {
                System.out.println(i + " is a common element.");
            }
        }
//          The enhanced for loop is a convenient way to iterate over an array, especially if you only need to access
//          the elements of the array in sequence and don't need to know the current index of the element you're accessing.
//          It's often used in place of a traditional for loop when you don't need to modify the array or access its indices.
    }



























}



