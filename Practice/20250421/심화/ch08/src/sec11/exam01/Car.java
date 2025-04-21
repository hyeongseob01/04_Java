package sec11.exam01;

public class Car {
    Tire tire1;
    Tire tire2;
    public Car() {
        this.tire1 = new HankookTire();
        this.tire2 = new KumhoTire();
    }
    public void run() {
        tire1.roll();
        tire2.roll();
    }
}
