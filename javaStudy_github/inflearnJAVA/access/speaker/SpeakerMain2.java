package access;

public class SpeakerMain2 {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근 불가
        //speaker.volume = 200;
        speaker.showVolume();
    }
}
