import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner s = new Scanner (System.in);

  int num;

    System.out.println("Enter a number to count down or up from: ");

  num = s.nextInt();
  if (num >= 0);

  for (int i = num; i >= 0; i--)
    System.out.println("i= " +i );

  if (num <= 0);

  for (int i = num; i <= 0; i++)
    System.out.println("i= " +i);

  System.out.println("BLAST OFF!");

  // So, I didn't use the while loop. Is doing it this way wrong, or does it create more work for me in the end?
  // Now, that i am running this more i realize that the run time is slower so that could be a result?
  
  }
}