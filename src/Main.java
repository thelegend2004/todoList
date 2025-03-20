import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static List<String> notes = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Console Todo List!");
        Scanner scanner = new Scanner(System.in);
    }

    public static void addNote(String note) {
        notes.add(note);
        int id = notes.indexOf(note);
        System.out.println("Note #" + id + " has been successfully added!");
    }

    public static void removeNote(int id) {
        notes.remove(id);
        System.out.println("Note #" + id + " has been successfully removed!");
    }

    public static void showNote(int id) {
        String note = notes.get(id);
        System.out.println(note);
    }

    public static void showNotesIds() {
        for(String note : notes) {
            System.out.println(notes.indexOf(note));
            System.out.println(note.substring(0, 10));
            System.out.println();
        }
    }
}
