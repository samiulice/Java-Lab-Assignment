package problem01;

import java.util.ArrayList;

public class StudentRecordManager {
    private int studentId;
    private String name;
    private ArrayList<Integer> marks = new ArrayList<>();

    public StudentRecordManager(int studentId, String name, ArrayList<Integer> marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public String getName() {
        return this.name;
    }
    public int findMaxMark(ArrayList<Integer> marks){
        int temp = marks.get(0);
        for(int i: marks){
            if(temp < i){
                temp = i;
            }
        }
        return temp;
    }
    public int findMinMark(ArrayList<Integer> marks){
       int temp = marks.get(0);
       for(int i: marks){
           if(temp > i){
               temp = i;
           }
       }
       return temp;
    }
    public int calculateTotalMarks(ArrayList<Integer> marks){
        int sum = 0;
        for (int i:marks){
            sum += i;
        }
        return sum;
    }
    public void displayStudentDetails(){
        System.out.println("Student Id: " + this.studentId);
        System.out.println("Student Name: " + this.name);
        System.out.println("Marks: " + this.marks);
        System.out.println("Maximum Mark: " + findMaxMark(marks));
        System.out.println("Minimum Mark: " + findMinMark(marks));
        System.out.println("Total Marks: " + calculateTotalMarks(marks));
        System.out.println("Average: " + ((double)(calculateTotalMarks(marks))/this.marks.size()));
        System.out.println();

    }

}
