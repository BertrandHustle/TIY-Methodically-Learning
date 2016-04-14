/**
 * Describes instances of Pie
 */

public class Pie {

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

    private boolean songName = true;

    public boolean getSongName(){

        System.out.println(this.songName);
        return this.songName;
    }

    public void setSongName(String newSongName) {

        if(newSongName.contains("Nickelback")){
            System.out.println("Pick a good band!");
        }
    }

    /**
     * Sets default parameters for Pie
     * @param flavor Flavor of pie
     * @param size Size of pie (in inches)
     * @param songName Whether or not the pie shares its' name with a song
     */

        public Pie(String flavor, int size, boolean songName){

            this.flavor = flavor;
            this.size = size;
            this.songName = songName;

        }

    /**
     *
     * @return Returns description of your pie
     */

    public String toString(){
            return "Your pie is a " + size + " inch " + flavor + " pie. ";
        //    if (songName == true) {
        //        return "Hey, this is the name of a song!";
            }

        }



