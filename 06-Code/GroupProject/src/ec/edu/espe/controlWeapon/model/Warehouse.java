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
    private ArrayList<Explosive>explosives;
    
=======
    private ArrayList<Ammunition> ammunitions;
    private ArrayList<WarMaterial> warMaterials;
>>>>>>> d9a13afd5aa0c608a305b557f7dc7880ffbb46df

    
    
    
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
        return "Warehouse{" + "name=" + name + ", country=" + country + ", city=" + city + ", number=" + number + ", yearFundation=" + yearFundation + ", explosive=" + explosives + '}';
    }

<<<<<<< HEAD
    

    public Warehouse(String name, String country, String city, int number, int yearFundation, ArrayList<Explosive> explosives) {
=======
    public Warehouse(String name, String country, String city, int number, int yearFundation, ArrayList<Ammunition> ammunitions, ArrayList<WarMaterial> warMaterials) {
>>>>>>> d9a13afd5aa0c608a305b557f7dc7880ffbb46df
        this.name = name;
        this.country = country;
        this.city = city;
        this.number = number;
        this.yearFundation = yearFundation;
<<<<<<< HEAD
        this.explosives = explosives;
    }


=======
        this.ammunitions = ammunitions;
        this.warMaterials = warMaterials;
    }



>>>>>>> d9a13afd5aa0c608a305b557f7dc7880ffbb46df
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
     * @return the explosive
     */
    public ArrayList<Explosive> getExplosive() {
        return explosives;
    }

    /**
     * @param explosive the explosive to set
     */
    public void setExplosive(ArrayList<Explosive> explosive) {
        this.explosives = explosive;
    }
    

}
