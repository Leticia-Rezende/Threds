package LAB07;


public class TemperatureSensor implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=5; i++){
            try {
                Thread.sleep(1000);
                int temperature = 50 + (int)(Math.random() * 50);
                System.out.println("Sensor de Temperatura: " + temperature + "%");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
