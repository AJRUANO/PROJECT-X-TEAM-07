package ec.edu.espe.controlWeapon.model;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez
 */
public class Program {

    private String name;
    private String type;

    public void doWork() {

    }

    private void solveProblem() {

    }

    private void delete() {

    }

    @Override
    public String toString() {
        return "Program{" + "name=" + name + ", type=" + type + '}';
    }

    public Program(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Program() {
        System.out.println("---------Data Program----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Name-->");
        name = scanner.next();
        System.out.println("--Type-->");
        type = scanner.next();
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

}
