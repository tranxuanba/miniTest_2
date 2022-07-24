package controller;

import model.CrispyFlour;
import model.Material;
import model.Meat;
import view.Client;

import java.util.ArrayList;
import java.util.Scanner;

public class MaterialManager {
    public static ArrayList<Material> materials = new ArrayList<>();

    //them moi vat lieu bot

    public void addCrispyFlours(CrispyFlour crispyFlour) {
        materials.add(crispyFlour);
    }

    // them moi vat lieu thit
    public void addMeat(Meat meat){
        materials.add(meat);
    }
    
    // sua thong tin san pham
    public void updateMaterial(ArrayList<Material> material){
        System.out.println("nhap ma san pham can cap nhat lai thong tin");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        for (int i = 0; i < material.size(); i++) {
            String newid = material.get(i).getId();
            if (newid.equals(id)) {
                if (material.get(i) instanceof CrispyFlour) {
                    material.set(i, Client.newCrispyFlour());
                }else {
                    if (material.get(i) instanceof Meat){
                        material.set(i, Client.newMeat());
                    }
                }
            }
        }
    }

    // xoa thong tin san pham
    public void deleteMaterial(ArrayList<Material> material) {
        System.out.println("nhap id vat lieu can xoa:");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        for (int i = 0; i < material.size(); i++) {
            if ((material.get(i).getId()).equals(id)){
                material.remove(i);
            }else {
                System.out.println("khong co vat lieu trong danh sach");
            }
        }
    }
}