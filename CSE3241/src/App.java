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
        List<Member> memberList = new ArrayList<Member>();
        List<Warehouse> warehouseList = new ArrayList<Warehouse>();
        List<Equipment> equipmentList = new ArrayList<Equipment>();
        while(true) {
            int operation = InputHelper.getOperationOption(scan);
            switch(operation) {
                case 1:
                    AddRecordUtil.addRecord();
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

    
}
