class Student {
    int id;
    String name;

    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Ramya");

        // Using copy constructor
        Student s2 = new Student(s1);

        System.out.println("Original Object:");
        s1.display();

        System.out.println("\nCopied Object:");
        s2.display();
    }
}