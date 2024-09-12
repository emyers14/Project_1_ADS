/*
 * Name: Ethan Myers
 * Instructor: Dr. Young J Kim
 * Course: Algorithms and Data Structures
 * Due Date: 09/11/2024
 */
public class EvenCheck {
    public static boolean even(int k) {
        return (k & 1) == 0; // bitwise AND to check if even
    }

    public static void main(String[] args) {
        System.out.println(even(4)); // True
        System.out.println(even(7)); // False
    }
}