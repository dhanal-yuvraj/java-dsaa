public class CopyConstructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "yuvraj";
        s1.Rollno = "22a51a12e7";
        s1.Marks[0]=90;
        s1.Marks[1]=88;
        s1.Marks[2]=100;
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.Marks[2]=12;
        System.out.println(s2.name);
        System.out.println(s2.Rollno);
        System.out.println(s2.password);
        for(int i=0;i<s2.Marks.length;i++){
            System.out.println(s2.Marks[i]);
        }
    }
    
}

class Student{
    String name ;
    String Rollno;
    String password;
    int Marks[];
    

    //Shallow copy
    // Student(Student s1){
    //     Marks = new int[3];
    //     this.name = s1.name;
    //     this.Rollno = s1.Rollno;
    //     this.Marks = s1.Marks;
    // }

    //Deep copy
    Student(Student s1){
        Marks = new int[3];
        this.name = s1.name;
        this.Rollno = s1.Rollno;
        for(int i=0;i<Marks.length;i++){
            this.Marks[i]=s1.Marks[i];
        }
    }
    Student(){
        Marks = new int[3];
        System.out.println("Constructor is called...");
    }
}
