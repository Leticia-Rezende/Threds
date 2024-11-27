package LAB07;

public class Main {

    public static void main(String[] args) {
        Thread x1 = new Thread (new TemperatureSensor());
        Thread x2 = new Thread(new HumiditySensor());
        x1.start();
        x2.start();
        System.out.println("\n"+ "Monitoramento de Sensores Concluído!" + "\n");
    }
}
