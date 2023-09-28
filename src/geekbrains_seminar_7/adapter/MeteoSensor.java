package geekbrains_seminar_7.adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface MeteoSensor {

    int getID();
    double getTemperature();
    double getHumidity();
    double getPressure();
    LocalDateTime getDateTime();



}
