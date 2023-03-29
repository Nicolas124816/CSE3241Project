package Util;

import java.util.Scanner;

import Input.InputHelper;

public class AddRecordUtil {
    
    public static void addRecord() {
        Scanner scan = new Scanner(System.in);
        int entity = InputHelper.getEntityOption(scan);
        switch(entity) {
            case 1:
                RecordUtil.addMember(memberList, scan);
                continue;
            case 2:
                RecordUtil.addWarehouse(warehouseList, scan);
                continue;
            case 3:
                RecordUtil.addEquipment(equipmentList, scan);
                continue;
            default:
                System.out.println("You entered an incorrect entity option");
                continue;
        }
    }

    public static void deleteRecord() {

    }

    public static void updateRecord() {

    }

    public static void searchRecord() {

    }



}
