package Input;

import java.util.Scanner;

public class InputHelper {

    public static int getOperationOption(Scanner scan) {
        System.out.println("Select one of the options : \n1.) Add New Records"
                + "\n2.) Delete Existing Records \n3.) Search Existing Records"
                + "\n4.) Update Existing Records" + "\n5.) Run Extra Queries"
                + "\n6.) Quit The Program");
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }

    public static int getEntityOption(Scanner scan) {
        System.out.println("Select one of the options : \n" + "1.) Members \n"
                + "2.) Warehouses \n" + "3.) Equipment\n" + "4.) Drones \n"
                + "5.) Reviews \n" + "6.) Employees\n"
                + "7.) Shipping Containers \n" + "8.) Container Info\n"
                + "9.) Warehouse order\n" + "10.) Workplace\n" + "11.) Rents\n"
                + "12.) Shipment");
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }

    public static int getQueryOptions(Scanner scan) {
        System.out.println("Choose from the following queries: \n"
                + "1.) Find the description of all equipment by MANUFACTURER released before YEAR\n"
                + "2.) Give all the watering equipment and their date of their checkout (renting) from a single member\n"
                + "3.) Give number of employees who are also members of the delivery sevice\n"
                + "4.) Give the average rating for each equipment\n");
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }

}
