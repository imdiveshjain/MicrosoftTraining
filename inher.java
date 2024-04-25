public class inher {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        Student s1 = new Student();

        s1.name="DJ";
        s1.toEat();
        s1.age=21;
        s1.rollNo=89;
    }
    
}

class Person{
    String name;
    int age;

    void toEat(){
        System.out.println(this.name + " is eating");
    }
}

class Student extends Person
{
    int rollNo;

    void toStudy(){
        System.out.println("Student is studying");
    }
}
