package neuedu.Pojo;

public class stu {
    private int id ;
    private String nameStu;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nameStu;
    }

    public void setName(String name) {
        this.nameStu = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "JDBC.Pojo.stu{" +
                "id=" + id +
                ", name='" + nameStu + '\'' +
                ", age=" + age +
                '}';
    }
    public void a()
    {
        System.out.println("A方法");
    }

    public stu() {
    }
}
