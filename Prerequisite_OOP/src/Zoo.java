public class Zoo {
    public static void main(String[] args) {
        Animal sparrow = new Sparrow(12, "M", 15);
        sparrow.move();

        //not going to work because sparrow is of type Animal
        //sparrow.fly();

        Sparrow sparrow1 = new Sparrow(12,"M", 15);
        sparrow1.move();
        sparrow1.fly();

        Bird b = new Sparrow(1,"F",1);

        //won't work either, because Bird doesn't implement Flyable,
        //only Sparrow implements Flyable, b is of Bird type
        //b.fly()

        Flyable flyingBird = new Sparrow(1,"M", 1);
        flyingBird.fly(); //can only call fly because flyingBird is of type FLyable
    }
}
