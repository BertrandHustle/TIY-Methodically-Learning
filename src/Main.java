public class Main {

    public static void main(String[] args) {

        Pie cherry = new Pie("cherry", 14, true);

        System.out.println(cherry.toString());

        Pie chess = new Pie("chess", 16, false);

        System.out.println(chess.toString());

        Cake germanChocolate = new Cake("German chocolate", 14, 3);

        System.out.println(germanChocolate.toString());

        Cake strawberry = new Cake("strawberry", 16, 2);

        System.out.println(strawberry.toString());

        Cookie chocolateChip = new Cookie("chocolate chip", 24, 2);

        System.out.println(chocolateChip.toString());

        Cookie snickerdoodle = new Cookie("snickerdoodle", 12, 1);

        System.out.println(snickerdoodle.toString());

        Brownie chocolate = new Brownie("chocolate", 14);

            chocolate.setPanSize(26);

            chocolate.getPanSize();

            chocolate.setFlavor("Blondie");

        System.out.println(chocolate.toString());

        Brownie peanutButter = new Brownie("peanut butter", 24);

            peanutButter.setFlavor("Bailey's");

        System.out.println(peanutButter.toString());

        Tart lemon = new Tart("lemon", 3, "meringue");

        System.out.println(lemon.toString());

        Tart passionFruit = new Tart("passion fruit", 3, "creme fraiche");

        System.out.println(passionFruit.toString());




    }
}
