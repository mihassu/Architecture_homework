package lesson04.bridge;

public abstract class AbstractSensor {

    SensorImpl sensorImpl;

    public AbstractSensor(SensorImpl sensorImpl) {
        this.sensorImpl = sensorImpl;
    }
}
