import lib.Observer;

import java.util.Date;

public class Client implements Observer {
    private Date date;
    private String name;
    private int temperature;
    private String weather;

    @Override
    public void update(Object data) {
        if(data instanceof WeatherData){
            WeatherData weatherData = (WeatherData) data;
            this.temperature = weatherData.temperature;
            this.weather = weatherData.weather;
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(date.toString()).append(":");
        sb.append(name).append(":");
        sb.append(",温度:").append(temperature).append("度");
        sb.append(",天气状况:").append(weather);
        return sb.toString();
    }

    Client(String name) {
        this.date = new Date();
        this.name = name;
    }
}
