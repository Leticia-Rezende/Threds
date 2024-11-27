package LAB07;

public class HumiditySensor implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <=5; i++){
            try {
                Thread.sleep(1500);
                int humidity = 20 + (int)(Math.random() * 10);
                System.out.println("Sensor de Umidade: " + humidity + "%" );
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
