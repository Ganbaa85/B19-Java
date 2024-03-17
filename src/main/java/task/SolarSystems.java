package task;

public abstract class SolarSystems extends Galaxy{

   abstract boolean isHaveSun();

    @Override
    Planet planet() {
        return null;
    }

    @Override
    SolarSystems solarSystems() {
        return null;
    }

}
