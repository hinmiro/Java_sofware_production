package module02;

public class SportsCar extends Car3 {
    private float speed;
    private float gasolineLevel;
    private String typeName;

    public SportsCar(String typeName) {
        super(typeName);
    }

    public SportsCar(String typeName, float gasolineLevel, float speed) {
        super(typeName, gasolineLevel, speed);
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 20;
            gasolineLevel -= 5;
        }
        else
            speed = 0;
    }

    void decelerate() {
        if (gasolineLevel > 0) {
            if (30 > 0)
                speed = Math.max(0, speed - 30);
        } else
            speed = 0;
    }
}
