import java.util.Scanner;

public class Main {
    // Method to calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten double values:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double avg = average(numbers);
        System.out.println("The average value is: " + avg);
    }
}
