import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Util.RecordUtil;
import Entities.Equipment;
import Entities.Warehouse;
import Entities.Member;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<Member> memberList = new ArrayList<Member>();
        List<Warehouse> warehouseList = new ArrayList<Warehouse>();
        List<Equipment> equipmentList = new ArrayList<Equipment>();
        while(true) {
            int operation = getOperationOption(scan);
            int entity = getEntityOption(scan);
            switch(operation) {
                case 1:
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
                case 2:
                    switch(entity) {
                        case 1:
                            RecordUtil.deleteMember(memberList, scan);
                            continue;
                        case 2:
                            RecordUtil.deleteWarehouse(warehouseList, scan);
                            continue;
                        case 3:
                            RecordUtil.deleteEquipment(equipmentList, scan);
                            continue;
                        default:
                            System.out.println("You entered an incorrect entity option");
                            continue;
                    }
                case 3:
                    switch(entity) {
                        case 1:
                            Member foundMember = RecordUtil.searchMember(memberList, scan);
                            System.out.println("Found member: \n" + foundMember.toString());
                            continue;
                        case 2:
                            Warehouse foundWarehouse = RecordUtil.searcWarehouse(warehouseList, scan);
                            System.out.println("Found warehouse: \n:" + foundWarehouse.toString());
                            continue;
                        case 3:
                            Equipment foundEquipment = RecordUtil.searchEquipment(equipmentList, scan);
                            System.out.println("Found equipment: \n" + foundEquipment.toString());
                            continue;
                        default:
                            System.out.println("You entered an incorrect entity option\n");
                            continue;
                    }
                default:
                    System.out.println("You entered an incorrect operation option");
                    continue;

            }
        


        }
    }

    private static int getOperationOption(Scanner scan) {
        System.out.println("Select one of the options (1, 2, or 3): \n1.) Add New Records \n2.) Delete Existing Records \n3.) Search Existing Records \n");
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }

    private static int getEntityOption(Scanner scan) {
        System.out.println("Select one of the options (1, 2, or 3): \n1.) Members \n2.) Warehouses \n3.) Equipment");
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }

    
}
