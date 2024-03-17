package music;

public class Piano extends MusicalInstrument {
    private int keyCount;
    private String pedalType;
    @Override
    String play() {
        return "Piano is playing";
    }

    public int getKeyCount() {
        return keyCount;
    }

    public void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }

    public void setPedalType(String pedalType) {
        this.pedalType = pedalType;
    }

    public String getPedalType() {
        return pedalType;
    }

    @Override
    void tune() {
        System.out.println("Piano is tuned ");
    }
}
