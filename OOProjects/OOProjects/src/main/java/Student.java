import java.util.ArrayList;

public class Student {
    private final String name;
    private final ArrayList<String> subject;
    private final ArrayList<Character> grade;


    public Student(String n) {
        this.name = n;
        this.subject = new ArrayList<>();
        this.grade = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(String s, Character g) {
       subject.add(s);
       grade.add(g);
    }

    public ArrayList<String> getSubjects() {
        return subject;
    }

    public double getGPA() {
        double totalPoint = 0.0;
        for (char g : grade) {
            switch (g){
                case 'A':
                case 'a':
                    totalPoint += 4.0;
                    break;
                case 'B':
                case 'b':
                    totalPoint += 3.0;
                    break;
                case 'C':
                case 'c':
                    totalPoint += 2.0;
                    break;
                case 'D':
                case 'd':
                    totalPoint += 1.0;
                    break;
                case 'E':
                case 'e':
                    totalPoint += 0.0;
                    break;
            }
        }
        return totalPoint / grade.size();
    }
}
