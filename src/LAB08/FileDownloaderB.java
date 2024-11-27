package LAB08;

public class FileDownloaderB implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=3; i++){
            try {
                Thread.sleep(2000);
                System.out.println("Download do arquivo B: Parte " + i + "/3 baixada!" );
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
