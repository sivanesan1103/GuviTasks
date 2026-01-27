package No1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        person obj = new person();
        person obj2 = new person(40,"ram");
        person obj3 = new person();
        obj.Name="siva";
        obj.age=12;
        obj3.Name="kethar";
        obj.display();
        obj2.display();
        obj3.display();
    }
}