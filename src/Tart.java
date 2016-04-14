/**
 * Describes instances of Tart by flavor and size
 */

public class Tart {

    /**
     * Denotes the flavor of our tart
     */

    private String flavor = "";

    public String getFlavor(){

        System.out.println(this.flavor);
        return this.flavor;
    }

    public void setFlavor(String newFlavor) {

        if(newFlavor.equals("Dirt")){
            System.out.println("Gross!");
        }
    }

    /**
     * Denotes the size of our tart
     */

    private int size = 0;

    public int getPanSize(){

        System.out.println(this.size);
        return this.size;
    }

    public void setSize(int newSize) {

        if(newSize <= 0) {
            this.size = newSize;
        }
    }

    /**
     * Tells us what's on top of our tart
     */

    private String topping = "";

    public String getTopping(){

        System.out.println(this.flavor);
        return this.flavor;
    }

    public void setTopping(String newTopping) {

        if(newTopping.equals("Dirt")){
            System.out.println("Gross!");
        }
    }

    /**
     * Sets default parameters for Tart
     * @param flavor Flavor of Tart
     * @param size Size of Tart (in inches)
     * @param topping What's on top of the tart
     */

    public Tart(String flavor, int size, String topping){

        this.flavor = flavor;
        this.size = size;
        this.topping = topping;

    }

    /**
     *
     * @return Returns description of your tart
     */

    public String toString() {
        return "Your tart is a " + size + " inch " + flavor + " tart, topped with " + topping;
    }
}

