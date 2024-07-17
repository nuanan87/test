/**
 * @author shawn
 * @version 1.0
 * @ClassName Pig
 * Description:
 * @date 2024/6/20 21:44
 */
public class Pig {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
