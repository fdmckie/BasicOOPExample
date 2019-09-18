public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.bark());

        Mouse m = new Mouse();
        print(m.eat());
        print(m.sleep());
        print(m.squeak());
    }

//When the main is executed (within AnimalApp.java class), it 1st calls the Animal class. It prints the results of the
//execution of the Animal() constructor and the eat() and sleep() methods within the Animal class.
//The execution of the call of the Cat class is next. It prints the results of the execution of the parent class default constructor (Animal) and the
//default constructor of the Cat class. Next the results of the overriden eat() and sleep() methods are printed.
// It also prints the result of the the purr() method (which is specific to the Cat class.
//The execution of the call of the Bird class is next. It prints the results of the execution of the parent class default constructor (Animal) and the
//default constructor of the Cat class. Next the results of the overriden eat() and sleep() methods are printed.
//It also prints the result of the fly() method (which is specific to the Bird class).

    private static void print(String s) {
        System.out.println(s);
    }
}
