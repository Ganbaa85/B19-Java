package music;

public class TestInstrument {
    public static void main(String[] args) {
        guitar acousticGuitar = new guitar();
        acousticGuitar.setElectrical(false);
        acousticGuitar.setNumberOfStrings(5);
        acousticGuitar.tune();
        System.out.println(acousticGuitar.play());
        System.out.println("NUmber of strings is "+ acousticGuitar.getNumberOfStrings());
        System.out.println("Is this guitar electrical "+ acousticGuitar.isElectrical());
        Piano fortepiano = new Piano();
        fortepiano.setKeyCount(88);
        fortepiano.setPedalType("metal");
        System.out.println("The number keys in the piano is "+ fortepiano.getKeyCount());
        System.out.println("Pedal type of this piano is "+ fortepiano.getPedalType());

    }
}
