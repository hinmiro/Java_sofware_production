package module02;

public class CarDriver {

    public static void main(String[] args) {
        Car3 myCar;

        myCar = new Car3("Ferrari");
        myCar.fillTank();

     /*   for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        } */
    }
}