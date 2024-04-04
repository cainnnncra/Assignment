package Program;

import java.util.Scanner;

public class MainTeachersRBCA22117 {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the type of teacher: ");
    String type = scanner.nextLine();

    System.out.print("Enter the name of teacher: ");
    String name = scanner.nextLine();

    System.out.print("Enter the subject: ");
    String subject = scanner.nextLine();


TeacherTeaches teacher = new TeacherTeaches(subject, name);

    teacher.teaches();
    teacher.subjects();
    
    scanner.close();
}
}
