package module05;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        private boolean cap = true;

        Color(String color) {
            this.color = color;
        }

        ;

        @Override
        public String toString() {
            return color;
        }
    }

    private Color color;
    private boolean cap = true;

    public Pen() {
        this.color = Color.RED;
    }

    public Pen(Color color) {
        this.color = color;
    }

    public String draw() {
        if (cap) {
            return "";
        } else {
            return ("Drawing " + color.toString());
        }
    }

    public void capOn() {this.cap = true;}

    public void capOff() {this.cap = false;}

    public String changeColor(Color newColor) {
        if (cap) {
            this.color = newColor;
        }
        return "Drawing " +this.color;
    }

    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen(Color.BLUE);
        p2.capOff();
        System.out.println(p2.draw());

    }
}
