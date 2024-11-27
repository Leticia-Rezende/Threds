package LAB06;

public class EmailSender extends Thread{
    @Override
    public void run (){
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("Enviando e-mails " + i + "/5... ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
