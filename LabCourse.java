class LabCourse extends CollegeCourse {
public LabCourse(String dept, int id, double credits) {
super(dept, id, credits);
}

// display method
@Override
public void display() {
System.out.println(dept + id);
System.out.println("Lab course");
System.out.println(credits + " credits");
System.out.println("Lab fee is $50");
System.out.println("Total feee is $" + (120 * credits + 50));
}

public static void main(String[] args) {
LabCourse labCourse = new LabCourse("BIO", 201, 4);
labCourse.display();
}
}