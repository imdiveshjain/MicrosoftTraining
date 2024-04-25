public class Encap {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("DJ");
        s1.setRollNo(89);
        s1.setAge(21);

        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
        if(s1.getAge() > 18) {
            System.out.println(s1.getAge());
        }
        else{
            System.out.println("Age is below 18");
        }
    }
}

class Student{
    private int id;
    private String name;
    private int rollNo;
    private int age;
    
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

    public int getAge(){
        return this.age;
    }
        
    public void setAge(int age){
        this.age = age;
    }

    void display(){
        System.out.println(id + name + rollNo);
    }
}
