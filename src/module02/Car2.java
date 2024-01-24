package module02;

import java.util.Scanner;

public class Car2 {
    private static final Scanner scanner = new Scanner(System.in);
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float targetSpeed;
    private boolean cruiseOn = false;


    public Car2(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;

    }

    public Car2(float gasolineLevel, float speed) {
        this.gasolineLevel = gasolineLevel;
        this.speed = speed;
    }


    public void cruiseControl() {
        System.out.println("::Cruise control engaged::");
        float amount;
        int userChoice;
        while (turnOn()) {
            System.out.println("\n1 Set target\n2 read current target\n3 Turn cruisecontrol on/off");
            userChoice = Integer.parseInt(scanner.nextLine());
            if (userChoice == 1) {
                System.out.println("Set target speed: ");
                targetSpeed = Float.parseFloat(scanner.nextLine());
                if (targetSpeed > 60 && targetSpeed < 180) {
                    System.out.printf("Target speed set to %s", targetSpeed);
                } else {
                    System.out.println("Target speed must be between 60km/h and 180km/h");
                    cruiseControl();
                }
            } else if (userChoice == 2) {
                System.out.printf("Current target speed: %s\n", targetSpeed);
                cruiseControl();
            } else if (userChoice == 3) {
                if (!cruiseOn) {
                    if (speed < targetSpeed) {
                        while (speed < targetSpeed) {
                            accelerate();
                            System.out.println(typeName + ": speed is " + speed + " km/h");
                            if (speed > targetSpeed) {
                                decelerate((int) ((int) speed - targetSpeed));
                                System.out.println(typeName + ": speed is " + speed + " km/h");
                            }

                        }
                    } else if (speed > targetSpeed) {
                        int intAmount = (int) ((int) speed - targetSpeed);
                        while (speed > targetSpeed) {
                            decelerate(15);
                            System.out.println(typeName + ": speed is " + speed + " km/h");
                            if (speed < targetSpeed) {
                                accelerate();
                                System.out.println(typeName + ": speed is " + speed + " km/h");
                            }
                        }
                    } else if (speed == targetSpeed) {
                        System.out.println("You are at target speed");
                    }
                }
                turnOn();
            }
        }
    }

    public boolean turnOn() {
        return true;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    float getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    float getGasolineLevel() {
        return gasolineLevel;
    }

}