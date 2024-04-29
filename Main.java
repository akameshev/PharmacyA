package pharmacy.PharmacyA;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Component succincAcid = new Component("Succinic Acid","50mg",20);
        Component alcohol = new Component("Alcohol","50mg",15);
        Component zhenshen = new Component("Zhenshen","25mg",30);
        Component selitra = new Component("Selitra","15mg",25);
        Component AscorbAcid = new Component("Ascorb Acid","40mg",10);

        Pharmacy pharmacy1 = new Pharmacy("pharmacy1");
        pharmacy1.addComponent(succincAcid,alcohol);
        Pharmacy pharmacy2 = new Pharmacy("pharmacy2");
        pharmacy2.addComponent(selitra,zhenshen);
        Pharmacy pharmacy3 = new Pharmacy("pharmacy3");
        pharmacy3.addComponent(succincAcid,alcohol);
        Pharmacy pharmacy4 = new Pharmacy("pharmacy4");
        pharmacy4.addComponent(AscorbAcid,alcohol);
//        System.out.println(pharmacy1.hashCode());
//        System.out.println(pharmacy2.hashCode());
//        System.out.println(pharmacy3.hashCode());
//        System.out.println(pharmacy4.hashCode());
        Set<Pharmacy> listPharmacy = new HashSet<>();
        listPharmacy.add(pharmacy1);
        listPharmacy.add(pharmacy2);
        listPharmacy.add(pharmacy3);
        listPharmacy.add(pharmacy4);
        System.out.println("Unique pharmacy:");
        for(Pharmacy pharmacy:listPharmacy){
            System.out.println(pharmacy.getName()+pharmacy.getComponents());
        }
        System.out.println("PharmacyList size with unique pharmacy: "+listPharmacy.size());
    }

}
