public class Encap {
    public static void main(String[] args) {
        
        Student s1 = new Student();

    }
}

class Student{
    private int id;
    private String name;
    private int rollNo;
    
    public int getId(){
        return this.id;
    }
    
    public  setId(){

    }

    void display(){
        System.out.println(id + name + rollNo);
    }
}