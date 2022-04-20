import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();    
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int num : array) {
            if (num > n) {
                sum += num;
            }
        }
        System.out.print(sum); 
    }
}
