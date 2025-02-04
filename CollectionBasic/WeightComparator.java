import java.util.Comparator;

public class WeightComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}
