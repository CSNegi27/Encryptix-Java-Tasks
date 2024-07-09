import java.util.Scanner;
public class Student_Grade_Calculator{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
         System.out.println("Student grade Calculator");
           System.out.println("Enter the number of subjects:");
           //Here s is number of subjects
           int s=sc.nextInt();
           int total=0;
           System.out.println("Enter the marks obtained in "+s+" subjects respectively: ");
           for(int i=0;i<s;i++){
               int marks=sc.nextInt();
               total=total+marks;
           }
            double Average_percentage=(double)total/s;
            String Grade;
            if (Average_percentage>=90){
              Grade="A+"; 
            }
            else if(Average_percentage>=80){
               Grade="A";
            }
            else if(Average_percentage>=70){
               Grade="B";
            }
            else if(Average_percentage>=60){
               Grade="C";
            }
            else if(Average_percentage>=50){
               Grade="D";
            }
            else if(Average_percentage>=40){
               Grade="E";
            }
            else{
               Grade="Fail(F)";
            }
            System.out.println("Total marks = "+total);
            System.out.println("Average Percentage= "+Average_percentage+" %");
            System.out.println("Grade is : "+Grade);
      }

    }
}



