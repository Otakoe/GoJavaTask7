/* Плеер 1.
        Имеет final цену(задается в конструкторе) и геттер
        Имеет только 1 песню (нельзя объявить эту переменную в классе этого плеера)
        playSong Может проиграть песню.
*/

package players;

public class PlayerN1 implements playSong {
    private final int cost;
    private final String name;
    private final String song = "China Hymn";;    //содержит свою незаменимую песню
    public PlayerN1(int cost,String name,String song){
        this.cost = cost;
        this.name = name;
    }
    protected PlayerN1(int cost,String name){                //этот конструктор пригодится для классов наследников, для инициализации константной переменной cost
        this.cost=cost;
        this.name = name;
    }
    public int getCost() {                       //наследуется но без переопределения пользуется только здешней переменной
        return cost;
    }
    public String getName(){
        return name;
    }
    public void playSong(){
        System.out.println("Звучит - "+song);
    }

}
