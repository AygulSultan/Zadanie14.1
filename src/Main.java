public class Main {
    public static void main(String[] args) {
       Programmer programmer=new Programmer("Lesha","ochkarik","IBM");
        System.out.println(programmer.toString());
       // Person person=new Person("chelovek","drevniy");
      //  System.out.println(person.toString());
        Dancer dancer=new Dancer("Ivan","baleron","bolshoy teatr");
        System.out.println(dancer.toString());
        Singer singer=new Singer("Vasya","ryjyi","dedMazay");
        System.out.println(singer.toString());
    }
}