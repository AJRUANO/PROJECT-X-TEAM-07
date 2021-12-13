package ec.edu.espe.controlWeapon.view;

import ec.edu.espe.controlWeapon.model.Ammunition;
import ec.edu.espe.controlWeapon.model.WarMaterial;
import ec.edu.espe.controlWeapon.model.Warehouse;
import ec.edu.espe.controlWeapon.model.Control;
import ec.edu.espe.controlWeapon.model.Explosive;
import ec.edu.espe.controlWeapon.model.Program;
import ec.edu.espe.controlWeapon.model.Time;
import ec.edu.espe.controlWeapon.model.Weapon;
import java.util.ArrayList;

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

        System.out.println("\n------->Javier Paucar<-------");
        Warehouse warehouse = new Warehouse();
        Control control = new Control();
        System.out.println("Warehouse is --->" + warehouse);
        System.out.println("Control is --->" + control);

        System.out.println("\n------->Sanchez Jose<-------");
        Weapon weapon = new Weapon();
        Program program = new Program();
        System.out.println("Weapon is --->" + weapon);
        System.out.println("Program is --->" + program);

        System.out.println("\n------->Leandro Quinga<-------");
        ArrayList<Explosive>explosives = new ArrayList<>();      
        Explosive explosive = new Explosive();
        System.out.println("Explosive is --->" + explosive);

        System.out.println("\n------->Paul Saltos<-------");
        Time time = new Time();
        System.out.println("Time is --->" + time);

    }
}
