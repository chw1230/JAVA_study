package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 켜기
        player.on();
        //불륨 증가
        player.volumeUp();
        //불륨 증가
        player.volumeUp();
        //불륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //플레이어 끄기
        player.off();
    }
}
