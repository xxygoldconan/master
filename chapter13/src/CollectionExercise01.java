import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Xu
 * @version 1.0
 */
public class CollectionExercise01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("A",1));
        list.add(new Dog("B",2));
        list.add(new Dog("C",3));

        for (Object o :list) {
            System.out.println(o);
        }
        System.out.println("使用迭代器");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog =  iterator.next();
            System.out.println(dog);
        }
    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
