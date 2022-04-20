import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        if (size > 1) {
            int temp = a[size - 1];
            for (int i = size - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
