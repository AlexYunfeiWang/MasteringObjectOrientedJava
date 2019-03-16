public class Zoo {
    public static void main(String[] args) {
        Animal bird = new Bird(12, "M", 15);

        bird.eat();
        bird.sleep();
        ((Bird) bird).fly();
    }
}
