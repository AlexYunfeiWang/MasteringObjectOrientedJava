public class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying high");
    }
}
