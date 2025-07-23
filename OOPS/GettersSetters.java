public class GettersSetters {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.SetName("Yuvraj");
        st1.SetRollno("22A51A12E7");
        System.out.println(st1.GetName());
        System.out.println(st1.GetRollno());
    }
}

class Student{
    private String name;
    private String rollno;

    void SetName(String nam){
        this.name = nam;
    }

    String GetName(){
        return this.name;
    }

    void SetRollno(String roll){
        this.rollno=roll;
    }

    String GetRollno(){
        return this.rollno;
    }
}
