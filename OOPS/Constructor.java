public class Constructor {
    public static void main(String[] args) {
        Student st1 = new Student("Yuvraj");
        System.out.println(st1.name);
    }
}

class Student{
    String name;
    String rollno;

    Student(String name){
        this.name = name;
        System.out.println("Constructor is called......");
    }
}
