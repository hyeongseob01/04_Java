package exam;

import java.awt.Toolkit;

class MovieThread1 extends Thread {  // public 제거
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 3; i++) {
            toolkit.beep();
            System.out.println("동영상을 재생합니다.");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}

class MusicRunnable1 implements Runnable {  // public 제거
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 6; i++) {
            toolkit.beep();
            System.out.println("음악을 재생합니다.");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class ThreadExample {  // 이 클래스만 public
    public static void main(String[] args) {
        Thread movieThread = new MovieThread1();
        movieThread.start();

        Thread musicThread = new Thread(new MusicRunnable1());
        musicThread.start();
    }
}
