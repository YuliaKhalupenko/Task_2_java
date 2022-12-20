import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Solution {
    public static void main(String[] args) {
        new Solution().execute();
    }
 
    //В методе происходят все основные действия
    private void execute() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите количество элементов последовательности: ");
            int N = Integer.parseInt(reader.readLine());
            int[] array = new int[N];
            for (int i = 0; i < N; ++i) {
                System.out.println("Введите " + i + " элемент: ");
                array[i] = Integer.parseInt(reader.readLine());
            }
            System.out.println("Последовательность: " + Arrays.toString(array));
 
            String res = isIncreasing(array) ? "является" : "не является";
            System.out.println("Последовательность " + res + " строго возрастающей");
        }
        catch (IOException ignored) {}
 
 
    }
 
    //Метод проверяет является ли последовательность строго возрастающей
    private boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= arr[i-1]) return false;
        return true;
    }
}