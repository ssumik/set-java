import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class  Exercicio2{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String abc = "ABC";
        Set<Student> set = new HashSet<>();

        for(int i = 0; i<3; i++){
            System.out.print("How many students for course " + abc.charAt(i) + "?");
            int quantity = sc.nextInt();
            for(int y = 0; y<quantity; y++){
                int studentNumber = sc.nextInt();
                set.add(new Student(studentNumber));
            }
        }
        sc.close();

        System.out.println("total students: " + set.size());
    }
}