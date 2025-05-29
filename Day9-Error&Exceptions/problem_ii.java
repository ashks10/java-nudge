import java.util.Scanner;

public class problem_ii {

    // Custom checked exception
    static class MaxRetrieveExtendsException extends Exception {
        @Override
        public String getMessage() {
            return "Max retrieve attempts are reached";
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 44;
        arr[1] = 17;
        arr[2] = 22;

        try {
            int value = getIndexFromUser(arr);
            System.out.println("Value at index: " + value);
        } catch (MaxRetrieveExtendsException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method that may throw custom exception
    public static int getIndexFromUser(int[] arr) throws MaxRetrieveExtendsException {
        Scanner scanner = new Scanner(System.in);
        int index;
        int attempts = 0;

        while (attempts < 5) {
            try {
                System.out.print("Enter a valid index: ");
                index = scanner.nextInt();
                return arr[index]; // if valid, return value
            } catch (Exception e) {
                System.out.println("Invalid index. Try again.");
                attempts++;
                scanner.nextLine(); // Clear input buffer
            }
        }

        // If failed 5 times, throw custom exception
        throw new MaxRetrieveExtendsException();
    }
}
