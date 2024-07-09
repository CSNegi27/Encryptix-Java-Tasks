import java.util.Scanner;
class range{
    public int generate(int max, int min){
        return (int) (Math.random()*(max-min+1)+min);
    }
}

public class Number_Game{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        range rg=new range();
        int TA=0;   //TA = Total Attempts
        int win=0;

        while(true){
            System.out.println("Enter the minimum number:");
            int min=sc.nextInt();
            System.out.println("Enter the maximum number:");
            int max=sc.nextInt();
            sc.nextLine();
            int correct=rg.generate(max,min);
            int Attempt=0;

            while(true){
                System.out.println("Guesss a number between "+min+" and "+max);
                int guess=sc.nextInt();
                Attempt++;

                if(guess>correct){
                    System.out.println("Too High");
                }
                else if(guess<correct){
                    System.out.println("Too Low");
                          
                }
                else{
                    System.out.println("Correct guess");
                    win++;
                    break;
                }
            }
            TA=TA+Attempt;
            System.out.println("Attempt="+Attempt);
            System.out.println("Wins="+win);

            double winrate=(double) win/TA*100;
            System.out.printf("your winrate is %.2f%%\n",winrate);
            System.out.println("Do you want to play again ? (yes / no)");
            String PA=sc.next();    //PA = Play Again
            if(!PA.equalsIgnoreCase("yes")){
                sc.close();
                System.exit(0);

            }
          sc.nextLine();
        }
    }
}




