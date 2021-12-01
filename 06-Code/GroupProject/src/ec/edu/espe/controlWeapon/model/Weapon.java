package ec.edu.espe.controlWeapon.model;

/**
 *
 * @author sanchez jose
 */
public class Weapon {

    private String name;
    private String color;
    private String model;
    private int serie;
    private String type;

    public Weapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Weapon{" + "name=" + name + ", color=" + color + ", model=" + model + ", serie=" + serie + ", type=" + type + '}';
    }

    public Weapon(String name, String color, String model, int serie, String type) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.serie = serie;
        this.type = type;
    }

    public void propeelProyectiles() {

    }

    private void destroy() {

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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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
     * @return the serie
     */
    public int getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(int serie) {
        this.serie = serie;
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
