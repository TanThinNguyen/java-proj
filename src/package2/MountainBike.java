package package2;

public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    // Override lại phương thức toString ở baseclass Bicycle
    public String toString() {
        return (super.toString() + "\nSeatHeight: " + seatHeight);
    }
}