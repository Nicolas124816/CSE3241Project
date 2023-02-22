import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select one of the options (1, 2, or 3): \n1.) Add New Records \n2.) Edit Existing Records \n3.) Search Existing Records \n");
        int option = scan.nextInt();

        printEntityOptions();
    }

    private static void printEntityOptions() {
        System.out.println("Select one of the options (1, 2, or 3): \n1.) Members \n2.) Warehouses \n3.) Equipment");
    }

    
}
