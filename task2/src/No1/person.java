package No1;

public class person {
    public int age ;
    public String Name ;
    person(){
        age=18;
    }
   person(int age,String name){
        this.age=age;
        this.Name=name ;
    }
    public void display() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
    }

}
