import java.util.*;

public class sorting_array {
    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt(); // Read the number of elements from the user
        int a[] = new int[n]; // Declare an array of integers with size n
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt(); // Read each element from the user and store it in the array
        }
        // The following section sorts the array using the Bubble Sort algorithm
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i]; // Swap the elements if a[i] is greater than a[j]
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n ; i++) {
            System.out.print(a[i] + " "); // Print each element followed by a comma
        }
    }
}
