/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package questionone;

/**
 *
 * @author GLORIA
 */
public class QuestionOne {

    public static void main(String[] args) {
        
    
        LectureRoom room = new LectureRoom();
        EasyReader reader = new EasyReader();
        boolean running = true;

        while (running) {
            System.out.println("Main Menu:");
            System.out.println("w: Add students");
            System.out.println("x: Remove students");
          System.out.println("y: Turn on light");
            System.out.println("z: Turn off light");
            System.out.println("q: Quit");
            System.out.print("Enter your choice: ");
            String choice = reader.readString();

            switch (choice) {
                case "w" -> {
                    System.out.print("Enter number of students to add: ");
                    int addStudents = reader.readInt();
                    room.addStudents(addStudents);
                    System.out.println(addStudents + " students added. Total students: " + room.getStudents());
                }
                case "x" -> {
                    System.out.print("Enter number of students to remove: ");
                    int removeStudents = reader.readInt();
                    room.removeStudents(removeStudents);
                    System.out.println(removeStudents + " students removed. Total students: " + room.getStudents());
                }
                case "y" -> {
                    System.out.print("Enter light number to turn on (1, 2, or 3): ");
                    int lightOn = reader.readInt();
                    room.turnOnLight(lightOn);
                    System.out.println("Light " + lightOn + " turned on.");
                }
                case "z" -> {
                    System.out.print("Enter light number to turn off (1, 2, or 3): ");
                    int lightOff = reader.readInt();
                    room.turnOffLight(lightOff);
                    System.out.println("Light " + lightOff + " turned off.");
                }
                case "q" -> {
                    running = false;
                    System.out.println("Quitting program.");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
        
    

