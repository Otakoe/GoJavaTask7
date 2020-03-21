package players;
/*       Плеер 5.
        Имеет final цену(задается в конструкторе) и геттер
        Имеет плейлист
        playSong Может проиграть первую песню
        playAllSongs может проиграть все песни с конца плейлиста в начало
*/
public class PlayerN5 extends PlayerN3 {
    public PlayerN5(int cost,String name,String songs[]){
        super(cost,name,songs);
    }
    public void playAllSongs(boolean reverse){
        if(reverse){
            for (int i=songs.length-1;i>=0;i--){
                playSong(i);
            }
            System.out.println("Проигрывание с конца списка окончено");
        }
        else{
            error();
        }
    }
    public void error(){
        System.out.println("можно проиграть только первую, последнюю или все песни подряд");
    }
}
