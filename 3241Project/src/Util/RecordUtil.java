package Util;

import java.util.Scanner;

import Entities.Member;
import Input.InputHelper;

public class RecordUtil {

    public static void addRecord(Scanner scan) {
        int entity = InputHelper.getEntityOption(scan);
        switch (entity) {
            case 1:
                MemberRecordUtil.addRecord(scan);
                break;
            case 2:
                WarehouseRecordUtil.addRecord(scan);
                break;
            case 3:
                EquipmentRecordUtil.addRecord(scan);
                break;
            case 4:
                DroneRecordUtil.addRecord(scan);
                break;
            case 5:
                ReviewRecordUtil.addRecord(scan);
                break;
            case 6:
                EmployeeRecordUtil.addRecord(scan);
                break;
            case 7:
                ShippingContainerRecordUtil.addRecord(scan);
                break;
            case 8:
                ContainerInfoRecordUtil.addRecord(scan);
                break;
            case 9:
                WarehouseOrderRecordUtil.addRecord(scan);
                break;
            case 10:
                WorkplaceRecordUtil.addRecord(scan);
                break;
            case 11:
                RentsRecordUtil.addRecord(scan);
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
                WarehouseRecordUtil.deleteRecord(scan);
                break;
            case 3:
                EquipmentRecordUtil.deleteRecord(scan);
                break;
            case 4:
                DroneRecordUtil.deleteRecord(scan);
                break;
            case 5:
                ReviewRecordUtil.deleteRecord(scan);
                break;
            case 6:
                EmployeeRecordUtil.deleteRecord(scan);
                break;
            case 7:
                ShippingContainerRecordUtil.deleteRecord(scan);
                break;
            case 8:
                ContainerInfoRecordUtil.deleteRecord(scan);
                break;
            case 9:
                WarehouseOrderRecordUtil.deleteRecord(scan);
                break;
            case 10: 
                WorkplaceRecordUtil.deleteRecord(scan);
                break;
            case 11:
                RentsRecordUtil.deleteRecord(scan);
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
                WarehouseRecordUtil.updateRecord(scan);
                break;
            case 3:
                EquipmentRecordUtil.updateRecord(scan);
                break;
            case 4:
                DroneRecordUtil.updateRecord(scan);
                break;
            case 5:
                ReviewRecordUtil.updateRecord(scan);
                break;
            case 6:
                EmployeeRecordUtil.updateRecord(scan);
                break;
            case 7:
                ShippingContainerRecordUtil.updateRecord(scan);
                break;
            case 8:
                ContainerInfoRecordUtil.updateRecord(scan);
                break;
            case 9:
                WarehouseOrderRecordUtil.updateRecord(scan);
                break;
            case 10:
                WorkplaceRecordUtil.updateRecord(scan);
                break;
            case 11:
                RentsRecordUtil.updateRecord(scan);
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
                WarehouseRecordUtil.searchRecord(scan);
                break;
            case 3:
                EquipmentRecordUtil.searchRecord(scan);

                break;
            case 4:
                DroneRecordUtil.searchRecord(scan);
                break;
            case 5:
                ReviewRecordUtil.searchRecord(scan);
                break;
            case 6:
                EmployeeRecordUtil.searchRecord(scan);
                break;
            case 7:
                ShippingContainerRecordUtil.searchRecord(scan);
                break;
            case 8:
                ContainerInfoRecordUtil.searchRecord(scan);
                break;
            case 9:
                WarehouseOrderRecordUtil.searchRecord(scan);
                break;
            case 10:
                WorkplaceRecordUtil.searchRecord(scan);
                break;
            case 11:
                RentsRecordUtil.searchRecord(scan);
                break;
            default:
                System.out.println("You entered an incorrect entity option\n");
                break;
        }
    }

}
