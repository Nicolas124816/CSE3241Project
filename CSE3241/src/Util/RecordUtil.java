package Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Equipment;
import Entities.Member;
import Entities.Warehouse;
import Entities.Superclasses.Item;

public class RecordUtil {
    
    public static void addMember(List<Member> memberList, Scanner scan) {
        System.out.println("Enter first name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scan.nextLine();
        System.out.println("Enter address: ");
        String address = scan.nextLine();
        System.out.println("Enter phone number (no dashes or spaces): ");
        String phone = scan.nextLine();
        System.out.println("Enter email address: ");
        String email = scan.nextLine();
        System.out.println("Enter the join date for the member: ");
        String startDate = scan.nextLine();
        System.out.println("Enter the member ID: ");
        String id = scan.nextLine();
        Member added = new Member(firstName, lastName, address, phone, email, startDate, null, id);
        System.out.println("Added new member: \n" + added.toString());
        memberList.add(added);
    }

    public static void addWarehouse(List<Warehouse> warehouseList, Scanner scan) {
        System.out.println("Enter warehouse ID: ");
        int id = scan.nextInt();
        System.out.println("Enter warehouse city: ");
        String city = scan.nextLine();
        System.out.println("Enter the address: ");
        String address = scan.nextLine();
        System.out.println("Enter the warehouse phone number (no dashes or spaces): ");
        int phone = scan.nextInt();
        System.out.println("Enter the manager name");
        String manager = scan.nextLine();

        warehouseList.add(new Warehouse(id, city, address, phone, manager));
    }

    public static void addEquipment(List<Equipment> equipmentsList, Scanner scan) {
        System.out.println("Enter the inventory ID: ");
        int id = scan.nextInt();
        System.out.println("Enter the expiration date: ");
        String date = scan.nextLine();
        System.out.println("Enter the description: ");
        String desc = scan.nextLine();
        System.out.println("Enter the manufacturer: ");
        String manufacturer = scan.nextLine();
        System.out.println("Enter the model number: ");
        int modelNum = scan.nextInt();
        System.out.println("Enter the year: ");
        int year = scan.nextInt();
        System.out.println("Enter the serial number: ");
        int serial = scan.nextInt();
        System.out.println("Enter the equipment type: ");
        String type = scan.nextLine();
        System.out.println("Enter the arrival date: ");
        String arrivalDate = scan.nextLine();
        System.out.println("Enter the weight (decimal value): ");
        double weight = scan.nextDouble();
        System.out.println("Enter the size: ");
        String size = scan.nextLine();
        List<String> sizes = new ArrayList<>();
        sizes.add(size);
        Item equipmentItem = new Item(id, date, desc, manufacturer, modelNum, year, serial);
        equipmentsList.add(new Equipment(equipmentItem, type, arrivalDate, weight, sizes));

    }

    public static Member searchMember(List<Member> memberList, Scanner scan) {
        System.out.println("Enter the member's email: ");
        String email = scan.nextLine();
        for (Member member : memberList) {
            if (member.getEmail().equals(email)) {
                return member;
            }
        }
        return null;
    }

    public static Warehouse searcWarehouse(List<Warehouse> warehouseList, Scanner scan) {
        System.out.println("Enter the warehouse ID: ");
        int warehouseID = scan.nextInt();
        for (Warehouse warehouse : warehouseList) {
            if (warehouse.getWarehouseID() == warehouseID) {
                return warehouse;
            }
        }

        return null;
    }

    public static Equipment searchEquipment(List<Equipment> equipmentList, Scanner scan) {
        System.out.println("Enter equipment serial number: ");
        int serialNum = scan.nextInt();
        for (Equipment equipment: equipmentList) {
            if (equipment.getSerialNumber() == serialNum) {
                return equipment;
            }
        }

        return null;
    }

    public static void deleteMember(List<Member> memberList, Scanner scan) {
        Member delete = searchMember(memberList, scan);
        System.out.println("Deleted member: \n" + delete.toString());
        memberList.remove(delete);

    }

    public static void deleteWarehouse(List<Warehouse> warehouseList, Scanner scan) {
        Warehouse delete = searcWarehouse(warehouseList, scan);
        System.out.println("Deleted warehouse: \n" + delete.toString());
        warehouseList.remove(delete);
    }

    public static void deleteEquipment(List<Equipment> equipmentList, Scanner scan) {
        Equipment delete = searchEquipment(equipmentList, scan);
        System.out.println("Deleted equipment: \n" + delete.toString());
        equipmentList.remove(delete);
    }
}
