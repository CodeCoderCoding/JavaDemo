package BOOP.B4Inherit;

public class InheritMain extends Object{
    public static void main(String[] args) {
        Person person=new Person("name",24);
        Student student=new Student("name", 24, 1);
        student.setAge(25);
        System.out.println(student.getAge());
        //person.setMajor();//父类不可调用子类的方法
    }
}
