package players;
/* Плеер 2.
         Имеет final цену(задается в конструкторе) и геттер
        Имеет только 1 песню (нельзя объявить эту переменную в классе этого плеера)
        playSong Пытаясь проиграть песню выдает ошибку в консоль - “error”.
*/
public class PlayerN2 extends PlayerN1 {
    //получаем при наследовании протектед конструктор и публичный геттер с доступом к приватной переменной
    private String song;
    public PlayerN2(int cost,String name,String song){
        super(cost,name);                   // воспользовались супер конструктором
        this.song = null;                  // формально нужно для ерора и имитации попытки вызвать песню
    }
    public void playSong(){
        advertise();
        try {
            if(song == null) {
                throw (new Exception());
            }
            else{
                System.out.println(song);
            }
        }catch (Exception e){
            System.out.println("Error");
        }
    }
    private void advertise(){
        System.out.println("реклама 1");
        System.out.println("реклама 2");
        System.out.println("реклама 3");
        System.out.println("реклама 4");
    }
}
