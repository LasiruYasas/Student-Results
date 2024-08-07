import java.util.*;
class Results{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Subject Mark : ");
        int marks = input.nextInt();

        String grade = "F";

        if(marks >= 75){
                grade = "A";
        }else if(marks >= 65){
                grade = "B";
        }else if(marks >= 55){
                grade = "C";
        }else if(marks >= 35){
                grade = "S";
        }
        System.out.println("Grade : "+ grade);
    }
}