package controller;

import model.CrispyFlour;
import model.Material;

import java.util.ArrayList;

public class MaterialManager {
    public static ArrayList<Material> materials = new ArrayList<>();

    //them moi vat lieu bot

    public void addCrispyFlours(CrispyFlour crispyFlour) {
        materials.add(crispyFlour);
    }
}
