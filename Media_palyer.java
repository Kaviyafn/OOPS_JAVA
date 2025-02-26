public class Media_palyer {
    public static void main(String[] args) {
        Media_palyerr obj=new Media_palyerr();
        obj.testing();
        AudioPlayer.play();
        VideoPlayer.pause();
        StreamingPlayer.stop();

    }
}
interface AudioPlayer{
    static void play() {
        System.out.println("it is a Audiaplayer class and play method");
    }
    static void pause() {
        System.out.println("it is a Audiaplayer class and pause method");
    }
        static void stop() {
            System.out.println("it is a Audiaplayer class and stop method");
        }

    }



interface VideoPlayer{
    static void play() {
        System.out.println("it is a videoplayer class and play method");
    }
    static void pause() {
        System.out.println("it is a videoplayer class and pause method");
    }
    static void stop() {
        System.out.println("it is a videoplayer class and stop method");
    }

}
interface StreamingPlayer{
    static void play() {
        System.out.println("it is a Streamingplayer class and play method");
    }
    static void pause() {
        System.out.println("it is a Streamingplayer class and pause method");
    }
    static void stop() {
        System.out.println("it is a Streamingplayer class and stop method");
    }

}
class Media_palyerr implements AudioPlayer,VideoPlayer,StreamingPlayer {
    public void testing(){
        System.out.println("this company question");


    }


}
