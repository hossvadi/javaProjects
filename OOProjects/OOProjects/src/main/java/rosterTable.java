import java.util.ArrayList;

public class rosterTable {
    public static void main(String[] args) {
        int days = 3;

        // Arraylist of  ArrayLists

        ArrayList<ArrayList<String>> roster = new ArrayList<>(days);

        //each sub-ArrayList
        ArrayList<String> day1 = new ArrayList<>();
        ArrayList<String> day2 = new ArrayList<>();
        ArrayList<String> day3 = new ArrayList<>();
        day1.add("Hossein");
        day1.add("Javad");
        roster.add(day1);
        day2.add("Reza");
        day2.add("Mohammad");
        day2.add("Javad");
        roster.add(day2);
        day3.add("Ali");
        day3.add("Taghi");
        roster.add(day3);

        getDays(roster, "Hossein");
        getDays(roster, "Javad");

    }

    public static void getDays(ArrayList<ArrayList<String>> rosterTable, String name) {
        for (ArrayList<String> arrList : rosterTable) {
            for (String str : arrList) {
                if (str.contentEquals(name)) {
                    System.out.println(rosterTable.indexOf(arrList) + 1);
                }
            }
        }
    }
}
