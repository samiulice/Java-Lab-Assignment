package problem01;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        StudentRecordManager[] myStudentList = new StudentRecordManager[100];
        int index = 0;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.printf("Add Student Info(1)\tDisplay Student Info(2)\tExit(other number)\n");
            int n = input.nextInt();
            if(n == 1){
                System.out.print("Enter Student ID: ");
                int id = input.nextInt();
                System.out.print("Enter Student Name: ");
                String name = input.next().toUpperCase();
                System.out.print("Enter the number of subjects: ");
                int numberOfSubjects = input.nextInt();
                ArrayList<Integer> markList = new ArrayList<>(numberOfSubjects);
                System.out.println("Enter the marks of each subject: ");
                for(int i = 0; i < numberOfSubjects; i++){
                    markList.add(input.nextInt());
                }
                myStudentList[index++] = new StudentRecordManager(id, name, markList);
            }
            else if (n == 2) {
                System.out.println("Enter valid ID/Name to see the details: ");
                String key = input.next();
                boolean notFound = true;
                for (int i = 0; i < index; i++){
                    if( myStudentList[i].getName().equals(key.toUpperCase())){
                        notFound = false;
                        myStudentList[i].displayStudentDetails();
                    }
                    else if(key.charAt(0) >= '0' && key.charAt(0) <= '9' && (myStudentList[i].getStudentId() == Integer.valueOf(key))){
                        notFound = false;
                        myStudentList[i].displayStudentDetails();
                        break;
                    }
                }
                if(notFound){
                    System.out.println("please insert correct name or id");
                }
            }
            else{
                input.close();
                System.out.println("Program Exit Successfully");
                break;
            }
            System.out.println();
        }
    }

}
