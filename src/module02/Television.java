package module02;

public class Television {
    private int channel;
    private boolean onOff = false;

    public Television() {}

    public boolean isOn() {
        return onOff;
    }
    public void pressOnOff() {
        onOff = !onOff;
    }

    public void setChannel(int chan) {
        channel = chan;
    }

    public int getChannel() {
        return channel;
    }
}
