package OOP_seminars.geekbrains_seminar_7.adapter;

import java.time.LocalDateTime;

public class AdapterST500 implements MeteoSensor{

    private SensorTemperature sensor;

    public AdapterST500(SensorTemperature sensor) {
        this.sensor = sensor;
    }

    @Override
    public int getID() {
        return sensor.getIdentifier();
    }

    @Override
    public double getTemperature() {
        return sensor.temperature();
    }

    @Override
    public double getHumidity() {
        return 0;
    }

    @Override
    public double getPressure() {
        return 0;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
