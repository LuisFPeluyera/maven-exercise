import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");

        String input = scanner.nextLine();

        System.out.println(StringUtils.capitalize(input));

        System.out.println("Enter a number");

        input = scanner.nextLine();

        System.out.println(StringUtils.isNumeric(input));

        System.out.println("Enter another string");

        input = scanner.nextLine();
        System.out.println(StringUtils.swapCase(input));
        System.out.println(StringUtils.reverse(input));


    }
}
