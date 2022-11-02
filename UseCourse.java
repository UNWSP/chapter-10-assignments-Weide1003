import java.util.Scanner;

public class UseCourse {
    public static void main(String args[]) {
        String dept;
        int id;
        double credits;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dept name");
        dept = in.nextLine();
        System.out.println("Enter the course id and credits");
        id = in.nextInt();
        credits = in.nextInt();
        if (dept.equals("BIO") || dept.equals("CHM") || dept.equals("CIS") || dept.equals("PHY")) {
            LabCourse course = new LabCourse(dept, id, credits);
            course.display();
        } else {
            CollegeCourse course = new CollegeCourse(dept, id, credits);
            course.display();
        }
        in.close();
    }
}