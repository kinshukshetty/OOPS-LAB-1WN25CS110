class Student {
    String usn;
    String name;

    Student(String usn, String name) {
        this.usn = usn;
        this.name = name;
    }

    void display() {
        System.out.println("USN  : " + usn);
        System.out.println("Name : " + name);
    }
}

public class studentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("1BM24CS1", "Asha");
        Student s2 = new Student("1BM24CS2", "Ravi");
        Student s3 = new Student("1BM24CS3", "Meena");
    
        System.out.println("----- Student Details -----");

        System.out.println("\nStudent 1:");
        s1.display();

        System.out.println("\nStudent 2:");
        s2.display();

        System.out.println("\nStudent 3:");
        s3.display();
    }
}