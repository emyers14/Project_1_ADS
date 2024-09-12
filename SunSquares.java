public class SumSquares {
    public static int sumTill(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i * i; // sum of squares
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumTill(5)); // 30 (1^2 + 2^2 + 3^2 + 4^2)
    }
}
