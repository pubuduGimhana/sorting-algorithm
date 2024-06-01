package sortingAlgorithm;

import java.util.Scanner;

public class ModifiedBubbleSort {

    public static void bubbleSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces: ");
        String userInput = scanner.nextLine();

        try {
            String[] inputStrings = userInput.split(" ");
            int[] numbersArray = new int[inputStrings.length];
            for (int i = 0; i < inputStrings.length; i++) {
                numbersArray[i] = Integer.parseInt(inputStrings[i]);
            }

            bubbleSort(numbersArray);

            System.out.println("Sorted array: ");
            for (int number : numbersArray) {
                System.out.print(number + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid list of integers.");
        } finally {
            scanner.close();
        }
    }
}



