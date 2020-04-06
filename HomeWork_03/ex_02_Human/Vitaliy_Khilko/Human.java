ackage HumanDemo;

public class Human {

    public String name;
    public int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void greet(){
        System.out.println("Good afternoon! I have a strange Russian name " + this.name + ". "+ "Today I turned " + this.age + " !!!");
    }
}
