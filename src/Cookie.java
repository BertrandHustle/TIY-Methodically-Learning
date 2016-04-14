/**
 * Describes instances of Cookie
 */

public class Cookie {

    /**
     * Denotes the flavor of our Cookie
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
     * Denotes the number of cookies we have
     */

    private int numberOfCookies = 0;

    public int getNumberOfCookies(){

        System.out.println(this.numberOfCookies);
        return this.numberOfCookies;
    }

    public void setNumberOfCookies(int newSize) {

        if(newSize <= 0) {
            this.numberOfCookies = newSize;
        }
    }


    /**
     * Tells us how many batches we made
     */

    private int batches = 0;

    public int getBatches(){

        System.out.println(this.numberOfCookies);
        return this.numberOfCookies;
    }

    public void setBatches(int newBatches) {

        if(newBatches <= 0) {
            this.numberOfCookies = newBatches;
        }
    }

    /**
     * Sets default parameters for Cookie
     * @param flavor Flavor of Cookie
     * @param numberOfCookies Number of cookies we made
     * @param batches Number of batches of cookies we made
     */

    public Cookie(String flavor, int numberOfCookies, int batches){

        this.flavor = flavor;
        this.numberOfCookies = numberOfCookies;
        this.batches = batches;

    }

    /**
     *
     * @return Returns description of your cookies
     */

    public String toString() {
        return "You have " + numberOfCookies + " " + flavor + " cookies. You made " + batches
                + " batches";
    }
}
