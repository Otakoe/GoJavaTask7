package players;

import java.util.Random;

/*  Плеер 6.
        Имеет final цену(задается в конструкторе) и геттер
        Имеет плейлист
        playSong Может проиграть первую песню
        playAllSongs может проиграть все песни
        Имеет метод public void shuffle() - перемешивает все песни в плейлисте местами*/
public class PlayerN6 extends PlayerN3 {
    public PlayerN6(int cost,String name,String songs[]){
        super(cost,name,songs);
    }
    public void shuffle(){
        int countOfSongs = songs.length;
        String tmp;
        if(countOfSongs>1) {
            if (countOfSongs > 2) {
                Random rand = new Random();
                int r;
                for(int i=0;i<countOfSongs;i++){
                    r=Math.abs(rand.nextInt(countOfSongs-1));
                    tmp=songs[i];
                    songs[i]=songs[r];
                    songs[r]=tmp;
                }

            } else {
                tmp = songs[0];
                songs[0] = songs[1];
                songs[1] = tmp;
            }
            System.out.println("Шурх шурх, песни перемешаны");
        }
        else{
            System.out.println("Мало песен в списке, нечего перемешивать");
        }

    }
}
