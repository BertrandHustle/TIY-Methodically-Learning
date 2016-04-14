/**
 * Describes instances of brownie by flavor and size
 */

public class Brownie {

    /**
     * Denotes the flavor of our brownie
     */

    private String flavor = "";

    public String getFlavor(){

        System.out.println(this.flavor);
        return this.flavor;
    }

    /**
     * Denotes the size of our brownie pan (in inches)
     */

    private int panSize = 0;

    /**
     * Denotes number of brownies left in pan
     */


    public int getPanSize(){

        System.out.println(this.panSize);
        return this.panSize;
    }

    /**
     * Sets default parameters for brownie
     * @param flavor Flavor of brownie
     * @param panSize Size of brownie pan (in inches)
     */

    public Brownie(String flavor, int panSize){

        this.flavor = flavor;
        this.panSize = panSize;

    }

    /**
     * sets pan size
     */

    public void setPanSize(int newPanSize) {

        if(newPanSize <= 0) {
            this.panSize = newPanSize;
        }
    }

    public void setFlavor(String newFlavor) {

        if(newFlavor.equals("Blondie")){
            System.out.println("That's not a real brownie!");
        }
    }

    /**
     *
     * @return Returns description of your brownies
     */

    public String toString() {
        return "You made a " + panSize + " inch pan of " + flavor + " brownies.";
    }
}
