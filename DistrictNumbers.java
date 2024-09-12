import java.util.HashSet;
import java.util.Scanner;

public class DistinctNumbers {
    public static boolean areDistinct(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (!set.add(num)) {
                return false; // number repeated
            }
        }
        return true; // all distinct
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by space:");
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        System.out.println(areDistinct(numbers) ? "All numbers are distinct." : "Some numbers are repeated.");
    }
}
