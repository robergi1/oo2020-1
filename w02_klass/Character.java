public class Character {

    private int x;
    private int y;

    String slogan = "";
    int height;

    private String name;
    private CharacterType characterType;
    private Direction direction;

    public Character(String name, CharacterType characterType){
        this.name = name;
        this.characterType = characterType;

        this.x = 30;
        this.y = 30;
    }

    @Override
    public String toString(){
        return "My name is " + name + " and i am at x:" + x + " y:" + y + " and my slogan is:" + slogan;

    }
}