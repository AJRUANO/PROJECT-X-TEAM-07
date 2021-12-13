package ec.edu.espe.controlWeapon.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Javier Paucar
 * @author Alexander Ruano
 */
public class Warehouse {

    private String name;
    private String country;
    private String city;
    private int number;
    private int yearFundation;
<<<<<<< HEAD
    private ArrayList<Weapon> weapons;
=======
    private ArrayList<Ammunition> ammunitions;
    private ArrayList<WarMaterial> warMaterials;
    private ArrayList<Warehouse> warehouses;
    private ArrayList<Control> controls;
>>>>>>> 1a7b3a9eae6b12871bf64f5f97f5f581c892284d

    public Warehouse(String name, String country, String city, int number, int yearFundation, ArrayList<Ammunition> ammunitions, ArrayList<WarMaterial> warMaterials, ArrayList<Warehouse> warehouses, ArrayList<Control> controls) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.number = number;
        this.yearFundation = yearFundation;
        this.ammunitions = ammunitions;
        this.warMaterials = warMaterials;
        this.warehouses = warehouses;
        this.controls = controls;
    }
    
    

    public Warehouse(String name, String country, String city, int number, int yearFundation, ArrayList<Ammunition> ammunitions, ArrayList<WarMaterial> warMaterials, ArrayList<Warehouse> warehouses) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.number = number;
        this.yearFundation = yearFundation;
        this.ammunitions = ammunitions;
        this.warMaterials = warMaterials;
        this.warehouses = warehouses;
    }
    
    
    private void security() {

    }

    private void intelligence() {

    }

    public void support() {

    }

    public Troops defended() {

        return new Troops();

    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Warehouse{" + "name=" + name + ", country=" + country + ", city=" + city + ", number=" + number + ", yearFundation=" + yearFundation + '}';
    }

    public Warehouse(String name, String country, String city, int number, int yearFundation, ArrayList<Weapon> weapons) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.number = number;
        this.yearFundation = yearFundation;
        this.weapons = weapons;
=======
        return "Warehouse{" + "name=" + getName() + ", country=" + getCountry() + ", city=" + getCity() + ", number=" + getNumber() + ", yearFundation=" + getYearFundation() + '}';
>>>>>>> 1a7b3a9eae6b12871bf64f5f97f5f581c892284d
    }

   

    public Warehouse() {
        System.out.println("\n--------> DATA Warehouse 1 <--------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---> name <---");
        name = scanner.next();
        System.out.println("---> country <---");
        country = scanner.next();
        System.out.println("---> city <---");
        city = scanner.next();
        System.out.println("---> number <---");
        number = scanner.nextInt();
        System.out.println("---> year fundation <---");
        yearFundation = scanner.nextInt();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the yearFundation
     */
    public int getYearFundation() {
        return yearFundation;
    }

    /**
     * @param yearFundation the yearFundation to set
     */
    public void setYearFundation(int yearFundation) {
        this.yearFundation = yearFundation;
    }

    /**
<<<<<<< HEAD
     * @return the weapons
     */
    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    /**
     * @param weapons the weapons to set
     */
    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

}
=======
     * @return the ammunitions
     */
    public ArrayList<Ammunition> getAmmunitions() {
        return ammunitions;
    }

    /**
     * @param ammunitions the ammunitions to set
     */
    public void setAmmunitions(ArrayList<Ammunition> ammunitions) {
        this.ammunitions = ammunitions;
    }

    /**
     * @return the warMaterials
     */
    public ArrayList<WarMaterial> getWarMaterials() {
        return warMaterials;
    }

    /**
     * @param warMaterials the warMaterials to set
     */
    public void setWarMaterials(ArrayList<WarMaterial> warMaterials) {
        this.warMaterials = warMaterials;
    }

    /**
     * @return the warehouses
     */
    public ArrayList<Warehouse> getWarehouses() {
        return warehouses;
    }

    /**
     * @param warehouses the warehouses to set
     */
    public void setWarehouses(ArrayList<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    /**
     * @return the controls
     */
    public ArrayList<Control> getControls() {
        return controls;
    }

    /**
     * @param controls the controls to set
     */
    public void setControls(ArrayList<Control> controls) {
        this.controls = controls;
    }

}
>>>>>>> 1a7b3a9eae6b12871bf64f5f97f5f581c892284d
