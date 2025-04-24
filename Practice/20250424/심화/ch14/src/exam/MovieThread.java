package exam;

import java.awt.Toolkit;

public class MovieThread {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i =0; i<3;i++){
                    toolkit.beep();
                    try{Thread.sleep(1000);}catch(InterruptedException e){}
                }
            }
        };
        thread.start();
        for(int i =0; i<3;i++){
            System.out.println("동영상을 재생합니다.");
            try{Thread.sleep(1000);}catch(InterruptedException e){}
        }
    }
}
