package driver;

public class RunDriver {

    private RunDriver() {}

    public static RunDriver runDriver() {
        return new RunDriver();
    }

    public Class<?> getDriverClass() {
        return EmulatorDriver.class;
    }
}
