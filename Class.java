class student {
    int rollno;
    String name;
    String dept;
    String section;
    int year;
student(int rollno,String name,String dept,String section,int year){
    this.rollno = rollno;
    this.name = name;
    this.dept = dept;
    this.section = section;
    this.year = year;
}
void display(){
    System.out.println("rollno:"+rollno);
    System.out.println("name:"+name);
    System.out.println("dept:"+dept);
    System.out.println("section:"+section);
    System.out.println("year:"+year);
}
}
public class Main{
    public static void main(String[]args){
        student[]students=new student[3];
        student s1= new student(101,"Alice","CSE","A",3);
        students[0] = s1;
        student s2 = new student(102,"Bob","ECE","B",3);
        students[1] = s2;
        students[2] = new student(103,"Charlie","IT","A",3);
        for(int i=0;i<students.length;i++){
            students[i].display();
        }
    }
}
