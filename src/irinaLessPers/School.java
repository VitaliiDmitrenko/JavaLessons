package irinaLessPers;

public class School {
    public static void main(String[] args) {
//        Teacher teacher2 = new Teacher("Maria Ivanovna", "Petrova", 35);
//        Teacher teacher3 = new Teacher("Ivan Petrovich", "Ivanov", 55, true, "Math");
//        Teacher teacher4 = new Teacher(true);
//
//        System.out.println(teacher2.getFirstName());
//        teacher1.setIsTeacher(false);
//
//        teacher3.printCard(teacher3.getFirstName(),teacher3.getLastName(),teacher3.getAge(),teacher3.getSubject(),teacher3.isTeacher());
//
//        teacher2.setIsTeacher(true);
//        teacher2.setSubject("Russian Literature");
//        teacher2.printCard(teacher2.getFirstName(),teacher2.getLastName(),teacher2.getAge(),teacher2.getSubject(),teacher2.isTeacher());

//        Student student1 = new Student("Masha", "Semenova", 10, true, 5);
//        Student student2 = new Student("Vova", "Sidorov", 8, true, 1);
//        Student student3 = new Student("Bogdan", "Taraasov", 11, true, 7);
//
//        student2.printCard(student2.getFirstName(), student2.getLastName(), student2.getAge(),
//                student2.getIsStudent(), student2.getGrade());

//        Teacher teacher11 = new Teacher("Elena Sergeevna", "Tarasova",64,true, "English");
//        teacher11.printCard(teacher11.getFirstName(),teacher11.getLastName(),teacher11.getAge(),teacher11.getIsTeacher(), teacher11.getSubject());
//        teacher3.printCard(teacher3.getFirstName(),teacher3.getLastName(),teacher3.getAge(),teacher3.getIsTeacher(), teacher3.getSubject());


    Teacher teacher1 = new Teacher(false,"Ivan Petrovich",
            "Ivanov",55,"Math");
    teacher1.printTeacherCard();

    Student student1 = new Student(true, "Masha", "Gliba",
            8,2);
    student1.printStudentCard();

    }
}
