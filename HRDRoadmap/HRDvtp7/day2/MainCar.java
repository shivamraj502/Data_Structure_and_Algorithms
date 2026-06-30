public class MainCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color="blue";
        System.out.println(c1.color);

        Car c2 = new Car();
        c2.color="black";
        System.out.println(c2.color);

        Car c3 = c2;
        System.out.println(c3.color);
    }
}
