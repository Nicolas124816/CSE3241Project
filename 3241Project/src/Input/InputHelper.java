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
                + "7.) Shipping Containers \n");
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }

    public static int getQueryOptions(Scanner scan) {
        System.out.println("Choose from the following queries: \n"
                + "1.) Find the description of all equipment by MANUFACTURER released before YEAR\n"
                + "2.) Give all the watering equipment and their date of their checkout (renting) from a single member\n"
                + "3.) List all the gardening equipment and their unique identifiers with less than 2 units held by the warehouse.\n"
                + "4.) Give all the members who checked out (rented) an electric equipment delivered by DRONE and the electric equipment they checked out.\n"
                + "5.) Find the total number of items rented by a single member\n"
                + "6.) Find the member who has rented the most computer & internet items and the total number of items they have checked out.\n"
                + "7.) Find the serial number and type of equipment with 5 star ratings\n"
                + "8.) Find the serial number and type of equipment that was purchased by members who have been members for 5 or\n"
                + "more years\n"
                + "9.) Find all material of shipping containers that have carried equipment over 5 lbs");
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }

}
