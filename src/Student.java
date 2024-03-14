public class Student {
    private String name;
    private String happybrithay;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHappybrithay() {
        return happybrithay;
    }

    public void setHappybrithay(String happybrithay) {
        this.happybrithay = happybrithay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0)
        this.age = age;
    }
}
