package lms;

public class Main {
	 public static void main(String[] args) {
	 // 1. Buat Faculty
	 Faculty f1 = new Faculty("F01", "Faculty of Computer Science");
	 // 2. Buat Teacher
	 Teacher t1 = new Teacher("T01", "Dr. Andi");
	 Teacher t2 = new Teacher("T02", "Dr. Budi");
	 // 3. Tambahkan teacher ke faculty
	 f1.addTeacher(t1);
	 f1.addTeacher(t2);
	 // 4. Buat Student
	 Student s1 = new Student("S01", "Alice");
	 Student s2 = new Student("S02", "Bob");
	 Student s3 = new Student("S03", "Charlie");
	 // 5. Tambahkan student ke faculty
	 f1.addStudent(s1);
	 f1.addStudent(s2);
	 f1.addStudent(s3);
	 // 6. Buat Class
	 CourseClass c1 = new CourseClass("C01", "OOP", f1);
	 CourseClass c2 = new CourseClass("C02", "Data Structures", f1);
	 // 7. Tambahkan class ke faculty
	 f1.addClass(c1);
	 f1.addClass(c2);
	 // 8. Teacher mengajar class
	 t1.teachClass(c1);
	 t2.teachClass(c2);
	 // 9. Student ambil class
	 s1.takeClass(c1);
	 s1.takeClass(c2);
	 s2.takeClass(c1);
	 s3.takeClass(c2);
	 // 10. Print semua class dalam faculty
	 f1.printAllClassesDetail();
	}
	
}

