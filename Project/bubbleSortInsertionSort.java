package Project;

import java.util.Scanner;

public class bubbleSortInsertionSort {
    public static void printArray(int[] arr){
        System.out.print("{");
        for(int z = 0; z < arr.length-1; z++){
            System.out.print(arr[z] + ", ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.print("}");
    }
    public static int[] insertsionSort(int[] arr) {
        int temp, y;
        for (int x = 1; x < arr.length; x++) {
            temp = arr[x];
            y = x-1;
            while(y >= 0){

                if (temp < arr[y]) {
                    arr[x] = arr[y];

                } else {
                    break;
                }
                y--;
            }
            arr[y + 1] = temp;
        }
        printArray(arr);
        return arr;
    }
    public static int[] bubbleSort(int[] arr) {

        for (int x = 0; x < arr.length; x++){
            for (int i = 1; i<arr.length; i++){
                if (arr[i] < arr[i-1]){
                    int placeholder = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = placeholder;
                }
            }
        }
        printArray(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        int numz = pen.nextInt();
        int[] arr = new int[numz];
        for (int x = 0; x < numz; x++){
            System.out.println("Enter a number");
            int curnum = pen.nextInt();
            arr[x] = curnum;
        }
        System.out.println("Bubble sort:");
        bubbleSort(arr);
        System.out.println();
        System.out.println("Insertion sort:");
        insertsionSort(arr);
        pen.close();
    }
}
