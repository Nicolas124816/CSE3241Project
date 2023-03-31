package Input;

import java.util.Scanner;

public class InputHelper {

    public static int getOperationOption(Scanner scan) {
        System.out.println(
                "Select one of the options (1, 2, or 3): \n1.) Add New Records \n2.) Delete Existing Records \n3.) Search Existing Records \n");
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }

    public static int getEntityOption(Scanner scan) {
        System.out.println(
                "Select one of the options (1, 2, or 3): \n1.) Members \n2.) Warehouses \n3.) Equipment");
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }

}
