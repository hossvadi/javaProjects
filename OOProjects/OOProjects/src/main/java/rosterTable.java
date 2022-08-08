import java.util.ArrayList;

public class rosterTable {
    public static void main(String[] args) {
        int days = 3;

        // Arraylist of  ArrayLists

        ArrayList<ArrayList<String>> roster = new ArrayList<ArrayList<String>>(days);

        //each sub-ArrayList
        ArrayList<String> day1 = new ArrayList<String>();
        ArrayList<String> day2 = new ArrayList<String>();
        ArrayList<String> day3 = new ArrayList<String>();
        day1.add("Hossein");
        day1.add("Javadi");
        roster.add(day1);
        day2.add("Reza");
        day2.add("Mohammad");
        day2.add("Javad");
        roster.add(day2);
        day3.add("Ali");
        day3.add("Taghi");
        roster.add(day3);

        System.out.println(roster);
    }

    public static void getDays(ArrayList<ArrayList<String>> rosterTable, String name) {
        for (ArrayList<String> arrList : )
    }
}
