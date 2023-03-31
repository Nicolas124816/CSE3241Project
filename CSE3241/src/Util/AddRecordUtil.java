package Util;

import java.util.Scanner;

import Entities.Equipment;
import Entities.Member;
import Entities.Warehouse;
import Input.InputHelper;

public class AddRecordUtil {
    
    public static void addRecord() {
        Scanner scan = new Scanner(System.in);
        int entity = InputHelper.getEntityOption(scan);
        switch(entity) {
            case 1:
                MemberRecordUtil.addRecord();
                break;
            case 2:
                WarehouseRecordUtil.addRecord();
                break;
            case 3:
                EquipmentRecordUtil.addRecord();
                break;
            default:
                System.out.println("You entered an incorrect entity option");
                break;
        }
    }

    public static void deleteRecord() {
        Scanner scan = new Scanner(System.in);
        int entity = InputHelper.getEntityOption(scan);
        switch(entity) {
            case 1:
                MemberRecordUtil.deleteRecord();
                break;
            case 2:
                WarehouseRecordUtil.deleteRecord();
                break;
            case 3:
                EquipmentRecordUtil.deleteRecord();
                break;
            default:
                System.out.println("You entered an incorrect entity option");
                break;
        }
    }

    public static void updateRecord() {
        Scanner scan = new Scanner(System.in);
        int entity = InputHelper.getEntityOption(scan);
        switch(entity) {
            case 1:
                MemberRecordUtil.updateRecord();
                break;
            case 2:
                WarehouseRecordUtil.updateRecord();
                break;
            case 3:
                EquipmentRecordUtil.updateRecord();
                break;
            default:
                System.out.println("You entered an incorrect entity option");
                break;
        }
    }

    public static void searchRecord() {
        Scanner scan = new Scanner(System.in);
        int entity = InputHelper.getEntityOption(scan);
        switch(entity) {
            case 1:
                Member foundMember = MemberRecordUtil.searchRecord();
                System.out.println("Found member: \n" + foundMember.toString());
                break;
            case 2:
                Warehouse foundWarehouse = WarehouseRecordUtil.searchRecord();
                System.out.println("Found warehouse: \n:" + foundWarehouse.toString());
                break;
            case 3:
                Equipment foundEquipment = EquipmentRecordUtil.searchRecord();
                System.out.println("Found equipment: \n" + foundEquipment.toString());
                break;
            default:
                System.out.println("You entered an incorrect entity option\n");
                break;
        }
    }



}
