public class CollegeCourse {
String dept;
int id;
double credits;
double price;

public CollegeCourse(String dept, int id, double credits) {
this.dept = dept;
this.id = id;
this.credits = credits;
}

public void display() {
System.out.println(dept + id);
System.out.println("Non-lab course");
System.out.println(credits + " credits");
System.out.println("Total feee is $" + (120 * credits));
}

public static void main(String[] args) {
CollegeCourse collegeCourse = new CollegeCourse("SE", 225, 3);
collegeCourse.display();
}
}