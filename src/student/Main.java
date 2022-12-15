package student;

import student.classes.Student;
import student.enums.Gender;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Bekmurat", "Jolchuev", 19, Gender.MALE, 5000);
        Student student2 = new Student("Alisher", "Mederov", 18, Gender.MALE, 1500);
        Student student3 = new Student("Akylbek", "Nurbek uulu", 25, Gender.MALE, 200);
        Student student4 = new Student("Baatyr", "Sultanov", 12, Gender.MALE, 6500);
        Student student5 = new Student("Nurkyz", "Ashimov", 19, Gender.FEMALE, 10000);

        Student[] students = {student1, student2, student3, student4, student5};
        List<Student> students1 = Arrays.stream(students).toList();


        while (true) {
            commands();
            int command = new Scanner(System.in).nextInt();
            if (command == 1) getStudentsByLetterA(students1);
            if (command == 2) getStudentsByAgeMoney(students1);
            if (command == 3) getStudentByMoney(students1);
            if (command == 4) getGirlByMoney(students);
            if (command == 5) getAllNames(students1);
            if (command == 6) add1000AllStudents(students1);
            if (command == 7) getFirstStudent(students1);
            if (command == 8) getCounter(students1);
            if (command == 9) sortStudentByGender(students1);
            if (command == 0) break;
        }


    }

    private static void commands() {
        System.err.println("""
                Press 1 to : Аты 'A' тамгасы менен башталган Студенттерди чыгаруу
                Press 2 to : Жашы 15 тен чон жана акчасы 2000 чомдон жогору Студенттерди чыгаруу
                Press 3 to : Эн коп акчасы бар Студентти чыгаруу
                Press 4 to : Эн коп акчасы бар Кызды чыгаруу
                Press 5 to : Бардык Студенттердин атын чыгаруу
                Press 6 to : Студенттердин акчасына 1000 сомдон кошуп чыгаруу
                Press 7 to : Биринчи турган Студентти чыгаруу
                Press 8 to : Студенттердин саанын чыгаруу
                Press 9 to : Балдарды жана Кыздарды группага салып чыгаруу
                Press 0 to : Программаны жыйынтыктоо!
                """);
    }

    private static void sortStudentByGender(List<Student> students1) {
        System.out.println("Студенттерди жынысына карата сорттоо!\n");
        System.out.println("Boys:  " + students1.stream().filter(student -> student.getGender().equals(Gender.MALE)).toList());
        System.err.println("Girls:  " + students1.stream().filter(student -> student.getGender().equals(Gender.FEMALE)).toList());
    }

    private static void getStudentByMoney(List<Student> students1) {
        System.out.println("Акчасы коп Студент!\n");
        Optional<Student> maxMoney1 = students1.stream().max(Comparator.comparing(Student::getMoney));
        System.out.println(maxMoney1);
    }

    private static void getCounter(List<Student> students1) {
        System.out.println("Студенттердин жалпы саны!\n");
        System.out.println(students1.size());
    }

    private static void getFirstStudent(List<Student> students1) {
        System.out.println("Тизмеде Биринчи турган Студент!\n");
        System.out.println(students1.stream().findFirst());
    }

    private static void add1000AllStudents(List<Student> students1) {
        System.out.println("Студенттердин акчасына 1000 сомдон кошулду!\n");
        students1.stream().map(student -> student.getMoney() + 1000).forEach(System.out::println);
    }

    private static void getAllNames(List<Student> students1) {
        System.out.println("Бардык Студенттердин аттары!\n");
        students1.stream().map(Student::getName).forEach(System.out::println);
    }

    private static void getStudentsByAgeMoney(List<Student> students1) {
        System.out.println("Акчасы 2000 сомдон жогору жана жашы 15 тен чон Студент!\n");
        students1.stream().filter(student -> student.getAge() > 15 && student.getMoney() > 2000).forEach(System.out::println);
    }

    private static void getStudentsByLetterA(List<Student> students1) {
        System.out.println("Аты 'A' тамгасынан башталган Студенттер!\n");
        students1.stream().filter(student -> student.getName().startsWith("A")).forEach(System.out::println);
    }

    private static void getGirlByMoney(Student[] students) {
        System.out.println("Акчасы коп Студент Кыз!\n");
        Optional<Student> maxMoney = Arrays.stream(students).filter(student -> student.getGender().equals(Gender.FEMALE)).max(Comparator.comparing(Student::getMoney));
        System.out.println(maxMoney);
    }
}
