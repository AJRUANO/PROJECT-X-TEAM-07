package ec.edu.espe.controlWeapon.model;

import java.util.Scanner;

/**
 *
 * @author Javier Paucar
 */
public class Control {

    private String name;
    private String colour;
    private String model;
    private int yearFabrication;

    public Control(String name, String colour, String model, int yearFabrication) {
        this.name = name;
        this.colour = colour;
        this.model = model;
        this.yearFabrication = yearFabrication;
    }

    public Control() {

        System.out.println("\n--------> DATA Control 1 <--------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---> name <---");
        name = scanner.next();
        System.out.println("---> colour <---");
        colour = scanner.next();
        System.out.println("---> model <---");
        model = scanner.next();
        System.out.println("---> year fundation <---");
        yearFabrication = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Control{" + "name=" + name + ", colour=" + colour + ", model=" + model + ", yearFabrication=" + yearFabrication + '}';
    }

    public void organize() {

    }

    private void change() {

    }

    private void doPlan() {

    }

    public void calculate() {

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
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the yearFabrication
     */
    public int getYearFabrication() {
        return yearFabrication;
    }

    /**
     * @param yearFabrication the yearFabrication to set
     */
    public void setYearFabrication(int yearFabrication) {
        this.yearFabrication = yearFabrication;
    }

}
