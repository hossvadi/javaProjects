public class compareStudentMark {
    public static void main(String[] arrgs) {
        StudentMark hossein = new StudentMark("Hossein");
        hossein.addMarks("English", 63);
        hossein.addMarks("Math", 93);
        hossein.addMarks("History", 73);
        
        StudentMark hadi = new StudentMark("Hadi");
        hadi.addMarks("English", 89);
        hadi.addMarks("Math", 71);
        hadi.addMarks("History", 91);
        
        if (hadi.compareTo(hossein) > 0) {
            System.out.println(hadi.getName() + "gets a higher total mark");
        }
        
        else if (hadi.compareTo(hossein) < 0) {
            System.out.println(hossein.getName() + "gets a higher total mark");
        }
        else {
            System.out.println("Both student get the same total mark");
        }
    }
}