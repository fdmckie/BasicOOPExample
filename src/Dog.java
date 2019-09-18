/*
 * All Dogs are Animals but all Animals are not Dogs
 */
public class Dog extends Animal {
    public Dog() {
        //super();
        System.out.println("A dog is wagging its tail...");
    }


    @Override
    public String sleep() {
        return "A dog sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A dog eats...";
    }


    public String bark() {
        //Dogs bark but other animals do not so this method
        //is unique to the Dog class
        return "A dog barks...";
    }
}