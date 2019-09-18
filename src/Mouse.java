/*
 * All Mice are Animals but all Animals are not Mice
 */
public class Mouse extends Animal {
    public Mouse() {
        //super();
        System.out.println("A mouse is gnawing...");
    }


    @Override
    public String sleep() {
        return "A mouse sleeps...";
    }

    @Override
    public String eat() {
        return "A mouse eats...";
    }


    public String squeak() {
        //A mouse squeaks but other animals do not so this method
        //is unique to the Mouse class
        return "A mouse squeaks...";
    }
}