package service;

import model.Student;

import java.util.Scanner;

public class StudentService {

    public Student createStudent(){

        Scanner scanner = new Scanner(System.in);
        Student studentObj = new Student();
        System.out.println("Please enter student's name");
        String name = scanner.next();
        studentObj.setName(name);
        System.out.println("Please enter student's surname");
        String surname = scanner.next();
        studentObj.setSurname(surname);
        System.out.println("Please enter student's age");
        int age = scanner.nextInt();
        studentObj.setAge(age);
        System.out.println("Please enter student's gender");
        String gender = scanner.next();
        studentObj.setGender(gender.charAt(0));
        System.out.println("Please enter student's mark");
        double mark = scanner.nextDouble();
        studentObj.setMark(mark);
        System.out.println("Does the student have a PhD degree?");
        boolean isPhD = scanner.nextBoolean();
        studentObj.setPhD(isPhD);

        return studentObj;
    }


    public Student [] sortByAge(Student [] students){
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length; j++) {
                if(students[j].getAge()<students[j-1].getAge()){
                    Student temp = students[j-1];
                    students[j-1]=students[j];
                    students[j]=temp;
                }
            }
        }

        return students;
    }

    public Student [] sortByMark(Student [] students){
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length; j++) {
                if(students[j].getMark()>students[j-1].getMark()){
                    Student temp = students[j-1];
                    students[j-1]=students[j];
                    students[j]=temp;
                }
            }
        }

        return students;

    }

    public Student[] sortByName(Student [] students){
        for (int i = 0; i < students.length-1; i++) {
            for (int j = i+1; j < students.length; j++) {
                if(students[i].getName().charAt(0)>students[j].getName().charAt(0)){
                    Student temp = students[j];
                    students[j]=students[i];
                    students[i]=temp;
                }
            }
        }

        return students;
    }


}
