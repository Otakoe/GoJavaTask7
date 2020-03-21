package players;
/*  Плеер 4.
        Имеет final цену(задается в конструкторе) и геттер
        Имеет плейлист
        playSong Может проиграть последнюю песню
        playAllSongs может проиграть все песни
*/
public class PlayerN4 extends PlayerN3 {
    public PlayerN4(int cost, String name, String songs[]){
        super(cost,name,songs);                    //супер конструктор задаёт цену и плейлист при помощи класса плеера№3, а тот для задания цены пользуется протектед конструктором класса №1
    }
    public void playSong(boolean last){
        if(last) {
            playSong(songs.length - 1);
            System.out.println("Конец последней песни");
        }
        else{
            error();
        }
    }
    public void error(){
        System.out.println("можно проиграть только первую, последнюю или все песни подряд");
    }
}
