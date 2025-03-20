import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static List<String> notes = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Console Todo List!");
        while(true) {
            System.out.println("What do you want to do?");
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1:
                    addNote();
                    break;
                case 2:
                    removeNote();
                    break;
                case 3:
                    showNote();
                    break;
                case 4:
                    showNotesIds();
                    break;
                default:
                    return;
            }
        }
    }

    public static void addNote() {
        System.out.println("Please write a note");
        String note = scanner.nextLine();
        notes.add(note);
        int id = notes.lastIndexOf(note);
        System.out.println("Note #" + id + " has been successfully added!");
    }

    public static void removeNote() {
        System.out.println("Please write a note id which you want to remove");
        int id = scanner.nextInt();
        try {
            notes.remove(id);
            System.out.println("Note #" + id + " has been successfully removed!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Note #" + id + " does not exist!");
        }
    }

    public static void showNote() {
        System.out.println("Please write a note id which you want to view");
        int id = scanner.nextInt();
        try {
            String note = notes.get(id);
            System.out.println(note);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Note #" + id + " does not exist!");
        }
    }

    public static void showNotesIds() {
        System.out.println("All notes:");
        for(String note : notes) {
            System.out.println(notes.indexOf(note));
            System.out.println(note.substring(0, Math.min(note.length(), 5)));
            System.out.println();
        }
    }
}
