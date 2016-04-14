/**
 * Describes instances of Cake
 */

public class Cake {

    /**
     * Denotes the flavor of our pie
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
     * Denotes the size of our pie
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
     * Tells us whether or not the name of the pie also refers to a song name
     */

    private int layers = 0;

    public int getLayers(){

        System.out.println(this.layers);
        return this.layers;
    }

    public void setLayers(int newLayers) {

        if(newLayers <= 0) {
            this.size = newLayers;
        }
    }

    /**
     * Sets default parameters for Pie
     *
     * @param flavor Flavor of cake
     * @param size   Size of cake (in inches)
     * @param layers Number of layers in cake
     */

    public Cake(String flavor, int size, int layers) {

        this.flavor = flavor;
        this.size = size;
        this.layers = layers;

    }


    /**
     *
     * @return Returns description of your cake
     */


    public String toString() {
        return "Your cake is a " + size + " inch " +
                flavor + " cake " + "with " + layers + " layers";
    }
}
