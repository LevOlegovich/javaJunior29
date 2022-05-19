package lesson18;

public class Pevec1 extends Thread {

    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;

        while (!needStop) {
            count++;
            if (count > 3) {
                needStop = true;
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("La___----");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MICROFON) {
                Monitors.MICROFON.notify();
            }

            synchronized (Monitors.MICROFON) {
                try {
                    Monitors.MICROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
