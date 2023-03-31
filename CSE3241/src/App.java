import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Util.AddRecordUtil;
import Util.RecordUtil;
import Entities.Equipment;
import Entities.Warehouse;
import Input.InputHelper;
import Entities.Member;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int operation = InputHelper.getOperationOption(scan);
            switch(operation) {
                case 1:
                    AddRecordUtil.addRecord();
                    break;
                case 2:
                    AddRecordUtil.deleteRecord();
                    break;
                case 3:
                    AddRecordUtil.searchRecord();
                    break;
                default:
                    System.out.println("You entered an incorrect operation option");
                    continue;

            }
        


        }
    }

    
}
