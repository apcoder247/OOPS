import java.util.*;

public class StringMenuProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        while (true) {
            System.out.println("\n1. Check Palindrome");
            System.out.println("2. Sort Alphabetically");
            System.out.println("3. Reverse String");
            System.out.println("4. Concatenate Original + Reverse");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    String rev = new StringBuilder(str).reverse().toString();
                    if (str.equalsIgnoreCase(rev))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");
                    break;

                case 2:
                    char[] arr = str.toCharArray();
                    Arrays.sort(arr);
                    System.out.println("Sorted: " + new String(arr));
                    break;

                case 3:
                    System.out.println("Reversed: " +
                            new StringBuilder(str).reverse());
                    break;

                case 4:
                    String reversed = new StringBuilder(str).reverse().toString();
                    System.out.println("Concatenated: " + str + reversed);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}