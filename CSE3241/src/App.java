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
                        case 2:
                            RecordUtil.addWarehouse(warehouseList, scan);
                        case 3:
                            RecordUtil.addEquipment(equipmentList, scan);
                        default:
                            System.out.println("You entered an incorrect entity option");
                    }
                case 2:
                    switch(entity) {
                        case 1:
                            RecordUtil.deleteMember(memberList, scan);
                        case 2:
                            RecordUtil.deleteWarehouse(warehouseList, scan);
                        case 3:
                            RecordUtil.deleteEquipment(equipmentList, scan);
                        default:
                            System.out.println("You entered an incorrect entity option");
                    }
                case 3:
                    switch(entity) {
                        case 1:
                            RecordUtil.searchMember(memberList, scan);
                        case 2:
                            RecordUtil.searcWarehouse(warehouseList, scan);
                        case 3:
                            RecordUtil.searchEquipment(equipmentList, scan);
                        default:
                            System.out.println("You entered an incorrect entity option");
                    }
                default:
                    System.out.println("You entered an incorrect operation option");
            }
        


        }
    }

    private static int getOperationOption(Scanner scan) {
        System.out.println("Select one of the options (1, 2, or 3): \n1.) Add New Records \n2.) Delete Existing Records \n3.) Search Existing Records \n");
        return scan.nextInt();
    }

    private static int getEntityOption(Scanner scan) {
        System.out.println("Select one of the options (1, 2, or 3): \n1.) Members \n2.) Warehouses \n3.) Equipment");
        return scan.nextInt();
    }

    
}
