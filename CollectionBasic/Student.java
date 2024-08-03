public class Student implements Comparable<Student>{
    public int age;
    public String name;
    public int weight;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student that) {
        //this method is called for current object
        //we will defihne our sorting logic here

        //sort basis onn age
        if(this.age == that.age) {
            return this.name.compareTo(that.name);
        }
        return that.age - this.age;
    }
}
