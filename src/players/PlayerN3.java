package players;

import org.w3c.dom.ls.LSOutput;

/*
Плеер 3.
        Имеет final цену(задается в конструкторе) и геттер
        Имеет плейлист
        playSong Может проиграть первую песню
        playAllSongs может проиграть все песни
        */
public class PlayerN3 extends PlayerN1 implements playAllSongs{
    public String songs[];
    public PlayerN3(int cost,String name,String songs[]){
        super(cost,name);
        this.songs=songs;
    }
    public void playSong(){
        playSong(0);
        System.out.println("Проигрывание одной песни окончено");
    }
    public void playAllSongs() {
        for (int i=0;i<songs.length;i++) {
            playSong(i);
        }
        System.out.println("Конец плейлиста");
    }
    protected void playSong(int index){                           //Для неповторяемости кода и наследников
        System.out.println("Звучит - " + songs[index]);
    }


}
