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
    
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public int getRollNo(){
        return this.rollNo;
    }
    
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    void display(){
        System.out.println(id + name + rollNo);
    }
}
