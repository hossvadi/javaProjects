import java.util.ArrayList;

public class StudentMark implements Comparable<StudentMark> {
    private int totalMark;
    private String name;
    private ArrayList<String> subjects;
    private ArrayList<Integer> marks;
    public String getName() {
        return name;
    }
    public StudentMark(String name) {
        this.name = name;
        subjects = new ArrayList<String>();
        marks = new ArrayList<String>();
    }
    
    public void addMarks(String subjects, int mark) {
        subjects.add(subjects);
        marks.add(mark); //auto boxing done for us
        totalMark += marks; //initialization has been done during instalation
    }
    
    public int compareTo(StudentMark other) {
        if (this.totalMark > other.totalMark) return 1;
        else if (this.totalMark == other.totalMark) return 0;
        else return -1;
    } 





}