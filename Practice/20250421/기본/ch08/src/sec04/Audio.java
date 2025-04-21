package sec04;

public class Audio implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume < MIN_VOLUME){
            volume = MIN_VOLUME;
        }
        else if(volume > MAX_VOLUME){
            volume = MAX_VOLUME;
        }
        System.out.println("현재 Audio 볼륨: " + volume);
    }
}
