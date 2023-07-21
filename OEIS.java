import java.util.Scanner;

public class OEIS {

    public static int calculateOEIS(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Angka input harus lebih besar dari 0");
        }
        return (n * (n + 1)) / 2 + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int n = scanner.nextInt();

        System.out.print("Output\n1");
        int i = 1;
        while (i < n) {
            int result = calculateOEIS(i);
            System.out.print(" " + result);
            i++;
        }
        System.out.print("\n");
    }
}
