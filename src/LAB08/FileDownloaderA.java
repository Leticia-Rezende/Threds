package LAB08;

public class FileDownloaderA implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=5; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Download do arquivo A: Parte " + i + "/5 baixada! " );
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
