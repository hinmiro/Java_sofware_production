package module02;

import java.util.Scanner;

public class CoffeeMaker {
    private boolean onOff;
    private int amount;
    private String type;
    private static Scanner scanner = new Scanner(System.in);

    public CoffeeMaker() {

    }

    private void setType() {
        int selection;
        System.out.println("Type selector:\n1 Normal\n2 Espresso");
        selection = Integer.parseInt(scanner.nextLine());
        if (selection == 1) {
            type = "Normal";
        } else {
            type = "Espresso";
        }
    }

    public boolean isOn() {
        return onOff;
    }

    public void pressOnOff() {
        onOff = !onOff;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public void setAmount() {
        System.out.println("How much coffee: ");
        amount = Integer.parseInt(scanner.nextLine());
        if (amount > 80 || amount < 10) {
            System.out.println("Choose between 10-80ml");
            setAmount();
        }
    }

    public static void main(String[] args) {
        boolean wantCoffee = true;
        String userInput;
        CoffeeMaker phillips = new CoffeeMaker();

        do {

            if (phillips.isOn()) {
                phillips.pressOnOff();
            }
            phillips.setType();
            phillips.setAmount();
            System.out.printf("Cup of %s %s is ready to CONSUME\n", phillips.getAmount(), phillips.getType());
            phillips.pressOnOff();
            System.out.println("Do you want more coffee? yes/no");
            userInput = scanner.nextLine();
            if (userInput.equals("no")) {
                wantCoffee = false;
            }
        } while (wantCoffee);
    }


}
