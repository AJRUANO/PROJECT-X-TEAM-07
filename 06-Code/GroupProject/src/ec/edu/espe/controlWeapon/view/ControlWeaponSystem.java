package ec.edu.espe.controlWeapon.view;

import ec.edu.espe.controlWeapon.model.Ammunition;
import ec.edu.espe.controlWeapon.model.WarMaterial;
import ec.edu.espe.controlWeapon.model.Warehouse;
import ec.edu.espe.controlWeapon.model.Control;
import ec.edu.espe.controlWeapon.model.Program;
import ec.edu.espe.controlWeapon.model.Weapon;

/**
 *
 * @author ASUS
 */
public class ControlWeaponSystem {

    public static void main(String[] args) {
        System.out.println(" ------->Alexander Ruano<-----");
        Ammunition ammunition = new Ammunition();
        WarMaterial warMaterial = new WarMaterial();
        System.out.println("Ammunition is ---> " + ammunition);
        System.out.println("WarMaterial is ---> " + warMaterial);

        System.out.println("------->Javier Paucar<-------");
        Warehouse warehouse = new Warehouse();
        Control control = new Control();
        System.out.println("Warehouse is --->" + warehouse);
        System.out.println("Control is --->" + control);
        
        System.out.println("------->Sanchez Jose<-------");
        Weapon weapon = new Weapon();
        Program program = new Program();
        System.out.println("weapon is --->" + weapon);
        System.out.println("program is --->" + program);
    }
}
