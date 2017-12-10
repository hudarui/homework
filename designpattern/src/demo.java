public class demo {
    public static void main(String[] args) {
        //创建一个气象台
        MeteorologicalStation meteorologicalStation = new MeteorologicalStation();

        //创建一些客户端并订阅气象
        Client iphone = new Client("iphone");
        meteorologicalStation.subscribe(iphone);
        Client android = new Client("android");
        meteorologicalStation.subscribe(android);
        Client pc = new Client("pc");
        meteorologicalStation.subscribe(pc);
        Client ipad = new Client("ipad");
        meteorologicalStation.subscribe(ipad);

        //发布天气
        meteorologicalStation.setTemperature(28);
        meteorologicalStation.setWeather("多云");
        meteorologicalStation.notifyObserver();

        System.out.println();

        meteorologicalStation.setTemperature(12);
        meteorologicalStation.setWeather("下雨");
        meteorologicalStation.notifyObserver();
    }
}