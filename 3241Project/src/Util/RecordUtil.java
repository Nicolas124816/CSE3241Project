package Util;

import java.util.Scanner;

import Entities.Employee;
import Entities.Equipment;
import Entities.Member;
import Entities.Warehouse;
import Input.InputHelper;

public class RecordUtil {

    public static void addRecord(Scanner scan) {
        int entity = InputHelper.getEntityOption(scan);
        switch (entity) {
            case 1:
                MemberRecordUtil.addRecord(scan);
                break;
            case 2:
                WarehouseRecordUtil.addRecord();
                break;
            case 3:
                EquipmentRecordUtil.addRecord();
                break;
            case 6:
                EmployeeRecordUtil.addRecord(scan);
                break;
            default:
                System.out.println("You entered an incorrect entity option");
                break;
        }
    }

    public static void deleteRecord(Scanner scan) {
        int entity = InputHelper.getEntityOption(scan);
        switch (entity) {
            case 1:
                MemberRecordUtil.deleteRecord(scan);
                break;
            case 2:
                WarehouseRecordUtil.deleteRecord();
                break;
            case 3:
                EquipmentRecordUtil.deleteRecord();
                break;
            case 6:
                EmployeeRecordUtil.addRecord(scan);
                break;
            default:
                System.out.println("You entered an incorrect entity option");
                break;
        }
    }

    public static void updateRecord(Scanner scan) {
        int entity = InputHelper.getEntityOption(scan);
        switch (entity) {
            case 1:
                MemberRecordUtil.updateRecord(scan);
                break;
            case 2:
                WarehouseRecordUtil.updateRecord();
                break;
            case 3:
                EquipmentRecordUtil.updateRecord();
                break;
            case 6:
                EmployeeRecordUtil.updateRecord(scan);
                break;
            default:
                System.out.println("You entered an incorrect entity option");
                break;
        }
    }

    public static void searchRecord(Scanner scan) {
        int entity = InputHelper.getEntityOption(scan);
        switch (entity) {
            case 1:
                Member foundMember = MemberRecordUtil.searchRecord(scan);
                System.out.println("Found member: \n" + foundMember.toString());
                break;
            case 2:
                Warehouse foundWarehouse = WarehouseRecordUtil.searchRecord();
                System.out.println(
                        "Found warehouse: \n:" + foundWarehouse.toString());
                break;
            case 3:
                Equipment foundEquipment = EquipmentRecordUtil.searchRecord();
                System.out.println(
                        "Found equipment: \n" + foundEquipment.toString());
                break;
            case 6:
                Employee emp = EmployeeRecordUtil.searchRecord(scan);
                System.out.println("Found employee: " + emp.toString());
                break;
            default:
                System.out.println("You entered an incorrect entity option\n");
                break;
        }
    }

}
