package view;

import controller.MaterialManager;
import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private static ArrayList<Material> materials = MaterialManager.materials;
    static {
        Material sp1 = new CrispyFlour("1", "bot nang", LocalDate.of(2022,12,12), 120, 2);
        Material sp2 = new CrispyFlour("2", "bot mi", LocalDate.of(2022,10,12), 150, 4);
        Material sp3 = new CrispyFlour("3", "bot nem", LocalDate.of(2022,6,12), 160, 5);
        Material sp4 = new CrispyFlour("4", "bot tom", LocalDate.of(2022,5,12), 100, 3);
        Material sp5 = new CrispyFlour("5", "bot tep", LocalDate.of(2022,4,12), 50, 2);

        Material sp6 = new Meat("6", "thit lon", LocalDate.of(2021,4,23), 180, 3);
        Material sp7 = new Meat("7", "thit de", LocalDate.of(2021,6,23), 150, 5);
        Material sp8 = new Meat("8", "thit cuu", LocalDate.of(2021,7,23), 170, 9);
        Material sp9 = new Meat("9", "thit bo", LocalDate.of(2021,8,23), 190, 3);
        Material sp10 = new Meat("10", "thit cho", LocalDate.of(2021,9,23), 130, 10);
        materials.add(sp1);
        materials.add(sp2);
        materials.add(sp3);
        materials.add(sp4);
        materials.add(sp5);
        materials.add(sp6);
        materials.add(sp7);
        materials.add(sp8);
        materials.add(sp9);
        materials.add(sp10);
    }

    public static void main(String[] args) {
        MaterialManager materialManager = new MaterialManager();
        // in ra danh sach sau khi them moi vat lieu bot
        materialManager.addCrispyFlours(newCrispyFlour());
        for (Material x:
             materials) {
            System.out.println(x);
        }
        //in ra danh sach khi them moi vat lieu thit
        materialManager.addMeat(newMeat());
        for (Material x:
                materials) {
            System.out.println(x);
        }
        // sua lai thong tin vat lieu theo id
        materialManager.updateMaterial(materials);
        for (Material x:
                materials) {
            System.out.println(x);
        }
        // xoa thong tin vat lieu theo id
        materialManager.deleteMaterial(materials);
        for (Material x:
                materials) {
            System.out.println(x);
        }
    }

   //them moi thong tin san pham bot
    public static CrispyFlour newCrispyFlour() {
        CrispyFlour crispyFlour = new CrispyFlour();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id vat lieu:");
        String id = scanner.nextLine();
        crispyFlour.setId(id);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("nhap ten vat lieu");
        String name = scanner1.nextLine();
        crispyFlour.setName(name);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("moi nhap vao ngay san xuat");
        LocalDate manufacturingDate = LocalDate.of(scanner2.nextInt(),scanner2.nextInt(),scanner2.nextInt());
        crispyFlour.setManufacturingDate(manufacturingDate);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("moi nhap vao gia vat lieu");
        int cost = scanner3.nextInt();
        crispyFlour.setCost(cost);
        System.out.println("moi nhap vao so luong");
        int quantity = scanner3.nextInt();
        crispyFlour.setQuantity(quantity);
        return crispyFlour;
    }

    // them moi thong tin san pham thit
    public static Meat newMeat() {
        Meat meat = new Meat();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("nhap id vat lieu");
        String id = scanner.nextLine();
        meat.setId(id);
        System.out.println("nhap ten vat lieu");
        String name = scanner.nextLine();
        meat.setName(name);
        System.out.println("moi nhap vao ngay san xuat vat lieu");
        LocalDate manufacturingDate = LocalDate.of(scanner1.nextInt(), scanner1.nextInt(), scanner.nextInt());
        meat.setManufacturingDate(manufacturingDate);
        System.out.println("moi nhap vao gia vat lieu");
        int cost = scanner1.nextInt();
        meat.setCost(cost);
        System.out.println("moi nhap vao khoi luong vat lieu");
        double weight = scanner1.nextDouble();
        meat.setWeight(weight);
        return meat;
    }



}
