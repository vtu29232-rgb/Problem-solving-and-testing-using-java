import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        System.out.print("Enter the index (0-4): ");
        int i = sc.nextInt();

        if (i >= 0 && i < arr.length) {
            System.out.println("Array element = " + arr[i]);
        } else {
            System.out.println("Invalid index! Please enter an index from 0 to 4.");
        }

        sc.close();
    }
}