import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = scanner.nextLine().split(" ");
        int[] array = new int[stringArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        int num = scanner.nextInt();
        if (num > array.length) {
            num = num % array.length;
        }
        for (int i = 0; i < num; i++) {
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}