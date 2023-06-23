//  Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class third {
    public static void main(String[] args) throws IOException {
        int[] arr = { 3, 6, 1, 8, 2, 4 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Array after iteration " + (i + 1) + ": " + Arrays.toString(arr));
            if (!swapped) {
                break;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
        BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
        writer.write("Sorted array: " + Arrays.toString(arr));
        writer.close();
    }

}
