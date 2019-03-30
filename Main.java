// v0.0.1 MoiRPG Gavin Newman
import java.util.Scanner;
class Main {
    int classCh;
    public static void defNums() {
        int classAtrib = 0;
        String classNam;
    }
    public static void statPrint() {
        for (int i = 0; i < classAtrib.length; i++) {
            System.out.println(classNam[i] + " - " + classAtrib[i]);
        }
    }
    public static void main(String[] args) {
        Main.defNums();
        Scanner myClass = new Scanner(System.in); // creates Scanner object
        // scanner for gender
        System.out.println("Welcom to the world of MoiRPG");
        //String[] genderls = {"Male", "Female", "Other"}
        String[] classls = {"Fighter", "Mage", "Rogue"}; // Identifies playable Classes
        System.out.println("Please select a class by inputing its associated number\n 1.Fighter\n 2.Mage\n 3.Rogue"); // usr prompt for classCh
        int classCh = myClass.nextInt(); // Reads user input
        System.out.print("Hello Mister ");
        System.out.println(classls[classCh - 1]); // out puts selected Character Classes

        if (classCh == 1){ // Atrib Str, con, dex, wis, int, cha
            String[] classNam = {"Str.", "con.", "Dex.", "Wis.", "Int.", "Cha.", "Arm."};
            int[] classAtrib1 = {4, 3, 2, 1, 1, 0, 0}; // numbered bonus in order shown above
            statPrint();
        }
        if (classCh == 2){ // Atrib Str, con, dex, wis, int, cha
            String[] classNam = {"Str.", "con.", "Dex.", "Wis.", "Int.", "Cha.", "Arm."};
            int[] classAtrib2 = {0, 1, 2, 3, 4, 1, 0}; // numbered bonus in order shown above
            statPrint();
        }
        if (classCh == 3){ // Atrib Str, con, dex, wis, int, cha
            String[] classNam = {"Str.", "con.", "Dex.", "Wis.", "Int.", "Cha.", "Arm."};
            int[] classAtrib3 = {1, 2, 4, 1, 1, 2, 0}; // numbered bonus in order shown above
            statPrint();
        }
    }
}
