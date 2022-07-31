public class GPAStudents {
    public static void main(String[] args) {
        Student hossein = new Student("Hossein");
        hossein.add("Machine Learning", 'A');
        hossein.add("Big Data", 'a');
        hossein.add("Data Science", 'b');
        hossein.add("Italian", 'b');
        System.out.println(hossein.getName() +
                " has a GPA of " +
                hossein.getGPA());

        System.out.println("It is obtained from these subjects: ");

        for (String str : hossein.getSubjects()) {
            System.out.println(str);
        }
    }
}
