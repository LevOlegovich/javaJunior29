package lesson18;

public class Pevec2 extends Thread {
    @Override
    public void run() {
        while (true) {

            try {
                Monitors.MICROFON.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 2; i++) {
                System.out.println("__----FAAAA");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MICROFON) {
                Monitors.MICROFON.notify();
            }

            synchronized (Monitors.MICROFON) {


            }
        }
    }
}
