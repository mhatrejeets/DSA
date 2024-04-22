import java.util.*;

public class Hashing {

    public static void hashFunctionWithoutReplacement(int[] arr, int[] hashedArr, int hashedKey) {
        for (int i = 0; i < 10; i++) {
            hashedArr[i] = -1;
        }
        for (int i = 0; i < 10; i++) {
            if (hashedArr[arr[i] % hashedKey] == -1) {
                hashedArr[arr[i] % hashedKey] = arr[i];
            } else {
                for (int j = 0; j < 10; j++) {
                    if (hashedArr[j] == -1) {
                        hashedArr[j] = arr[i];
                        break;
                    }
                }
            }
        }
    }

    public static void hashFunctionWithReplacement(int[] arr, int[] hashedArr, int hashedKey) {
        for (int i = 0; i < 10; i++) {
            hashedArr[i] = -1;
        }
        for (int i = 0; i < 10; i++) {
            int index = arr[i] % hashedKey;

            if (hashedArr[index] == -1) {
                hashedArr[index] = arr[i];
            } else {
                int newIndex = (index + 1) % 10; // Linear probing
                while (hashedArr[newIndex] != -1) {
                    newIndex = (newIndex + 1) % 10; // Move to the next index
                }
                hashedArr[newIndex] = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hashKey: ");
        int hashKey = scanner.nextInt();

        int[] arr = new int[10];
        System.out.println("\nEnter the elements of the array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int[] hashArr = new int[10];
        hashFunctionWithoutReplacement(arr, hashArr, hashKey);
        System.out.print("\nThe hashed Array without replacement is: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(hashArr[i] + " ");
        }

        int[] hashArr1 = new int[10];
        hashFunctionWithReplacement(arr, hashArr1, hashKey);
        System.out.print("\nThe hashed Array with replacement is: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(hashArr1[i] + " ");
        }

        scanner.close();
    }
}
