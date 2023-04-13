package cse3241;

import java.util.Scanner;

import Input.InputHelper;
import Util.ExtraQueries;
import Util.RecordUtil;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        DBConnection.establishConn();

        while (true) {
            int operation = InputHelper.getOperationOption(scan);
            switch (operation) {
                case 1:
                    RecordUtil.addRecord(scan);
                    break;
                case 2:
                    RecordUtil.deleteRecord(scan);
                    break;
                case 3:
                    RecordUtil.searchRecord(scan);
                    break;
                case 4:
                    RecordUtil.updateRecord(scan);
                    break;
                case 5:
                    ExtraQueries.runExtraQueries(scan);
                    break;
                case 6:
                    System.out.println("Shutting down...");
                    DBConnection.closeConn();
                    System.out.println("Shut down successfully. ");
                    System.exit(0);
                    break;
                default:
                    System.out.println(
                            "You entered an incorrect operation option");
                    continue;

            }

        }

    }

}
