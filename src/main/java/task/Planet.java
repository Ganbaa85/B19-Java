package task;

public class Planet extends SolarSystems{
    public boolean havePlanets;

    @Override
    boolean isHaveSun() {
        return false;
    }

    public static void main(String[] args) {
        Planet planet = new Planet();
        planet.solarSystems();
        planet.isHaveSun();
    }
}
