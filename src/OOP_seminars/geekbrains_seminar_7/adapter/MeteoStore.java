package OOP_seminars.geekbrains_seminar_7.adapter;

public class MeteoStore {

    boolean save(MeteoSensor meteoSensor){
        System.out.format("Saving data from sensor [%d] at %s%n temperature - %f ; humidity - %f ; pressure - %f \n\r",
                meteoSensor.getID(),
                meteoSensor.getDateTime(),
                meteoSensor.getTemperature(),
                meteoSensor.getHumidity(),
                meteoSensor.getPressure());
        return true;
    }

    /*boolean save(SensorTemperature sensorTemperature){
        System.out.format("Saving data from sensor [%d] at  temperature - %f  \n\r",
                sensorTemperature.getIdentifier(),
                sensorTemperature.temperature());
        return true;
    }*/

}
