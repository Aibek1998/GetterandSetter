public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Azamat Muradov");
        course.setNumber("+996555804101");
        course.setCourse("Java Backend");
        course.setFristlesson("01.02.2024");
        System.out.println(" Course : " + course.getCourse() + "\n" +
                " Name teacher : " + course.getName() + "\n" +
                " phone number : " + course.getNumber() + "\n" +
                " fristlesson : " + course.getFristlesson());
        System.out.println();
        System.out.println("     STUDENT    ");
        System.out.println();
        Student student = new Student();
        student.setName("Aibek");
        student.setHappybrithay("24.06.1998");
        student.setAge(-25);
        System.out.println(" Stundent name : "+student.getName()+"\n"+
                " happy brithay : "+student.getHappybrithay()+"\n"+
                " Age : "+student.getAge());

    }
}