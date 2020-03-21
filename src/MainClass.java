import players.*;

import java.util.ArrayList;

/*   @@@@@ Каждый плеер имеет метод public void playSong @@@@@
     @@@@@ Проигрывает первую имеющуюся песню на плеере. @@@@@

        Некоторые плееры имеют метод public void playAllSongs()
        Проигрывает все песни на плеере

      */
public class MainClass {
    public static void main(String[] args) {
        String myPlayList[] = new String[]{"Hibikase","Mein herz hrent","I`m so hot","And when he falleth"};
//Демонстрация первого плеера
        PlayerN1 p1=new PlayerN1(5,"ChinaPod №1",myPlayList[0]);
        costOfPlayer(p1);
        p1.playSong();
        System.out.println();
//Демонстрация второго плеера
        PlayerN2 p2 = new PlayerN2(10,"中国のゴミ №2",myPlayList[0]);
        costOfPlayer((PlayerN1)p2);
        p2.playSong();
        System.out.println();
//Демонстрация третего плеера
        PlayerN3 p3=new PlayerN3(15,"iPud №3",myPlayList);
        costOfPlayer((PlayerN1)p3);
        p3.playSong();
        p3.playAllSongs();
        System.out.println();
//Демонстрация четвёртого плеера
        PlayerN4 p4 = new PlayerN4(20,"iPod №4",myPlayList);
        costOfPlayer((PlayerN1)p4);
        p4.playSong();
        p4.playSong(true);
        p4.playSong(false);
        p4.playAllSongs();
        System.out.println();
//Демонстрация пятого плеера
        PlayerN5 p5 = new PlayerN5(25,"Philips №5",myPlayList);
        costOfPlayer((PlayerN1)p5);
        p4.playSong();
        p5.playAllSongs(false);
        p5.playAllSongs(true);
        System.out.println();
//Демонстрация шестого плеера
        PlayerN6 p6 = new PlayerN6(50,"UaPod N",myPlayList);
        costOfPlayer((PlayerN1)p6);
        p6.playSong();
        p6.playAllSongs();
        p6.shuffle();
        p6.playAllSongs();
        System.out.println();
    }
    public static void costOfPlayer(PlayerN1 player) {
        System.out.println("плеер " +player.getName()+" стоит " + player.getCost());
    }
}
