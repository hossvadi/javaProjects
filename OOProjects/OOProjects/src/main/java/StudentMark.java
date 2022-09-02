import java.util.ArrayList;

public class StudentMark implements  Comparable<StudentMark> {
     private int totalMark;
    private final String name;
    private final ArrayList<String> subjects;
    private final ArrayList<Integer> marks;


    public StudentMark(String name) {
        this.name = name;
        this.subjects = new ArrayList<String>();
        this.marks = new ArrayList<Integer>();
    }

    public void addMarks(String subject, int mark) {
        subjects.add(subject);
        marks.add(mark); //autoboxing
        totalMark += mark; // initialization has been done suring instantiation
    }

    public int compareTo(StudentMark other) {
        if (this.totalMark > other.totalMark) return 1;
        else if (this.totalMark == other.totalMark) return 0;
        else return -1;
    }

    public String getName() {
        return name;
    }
}
