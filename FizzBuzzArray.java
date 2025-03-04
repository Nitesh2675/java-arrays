import java.util.Scanner;

class FizzBuzzArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        String array[] = new String[number];

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                array[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                array[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                array[i - 1] = "Buzz";
            } else {
                array[i - 1] = String.valueOf(i);
            }
        }

        for (String value : array) {
            System.out.println(value);
        }
    }
}
