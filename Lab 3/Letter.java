import java.util.Scanner; //imports Scanner class
/** 
 * Lab 3, COMP160, 2018
 */

public class Letter{
   
   //scanner data field
   private static Scanner scanner = new Scanner( System.in );
   
   
   public static void main(String [] args){
      //asking for user input
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the applicant's name: ");
      String name = scanner.nextLine();
      
      int junior = 25000;     // standard pay rate for Junior employee
      int intermediate = 35000;  // standard pay rate for Intermediate employee
      int senior = 50000;    // standard pay rate for Senior employee
      
      //calling job offer method
      jobOffer("Chief Cook", senior);
      jobOffer("Benjamin Selby", "Hat Salesman", junior);
      jobOffer(name, "Hat Salesman", junior);
      
   } // end method
   
   
   /** displays a job offer for Bottle Washer at $25K */
   public static void jobOffer(){
      System.out.println("Dear applicant\nI wish to offer you the position of Bottle Washer.\nThe pay rate will be $25000 per annum.");
      signature(); //run signature method
   } // end method
   
   /** displays a job offer for the job title, with $25000 per annum */
   public static void jobOffer(String jobTitle){ 
      System.out.println("Dear applicant,\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be $25000 per annum."); 
      signature();
   } // end method
   
   /** displays a job offer for 'applicants', with a job title and the payrate */
   public static void jobOffer(String jobTitle, int payRate){ 
      System.out.println("Dear applicant,\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be $" + payRate + " per annum."); 
      signature();
   } // end method 

   
   //displays a job offer with inputted name, job title, and the payrate
   public static void jobOffer(String name, String jobTitle, int payRate){ 
      System.out.println("Dear " + name + ",\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be $" + payRate + " per annum."); 
      signature(); 
   } // end method
   
   //displays the signature of Mr Albert Agnew
   public static void signature() {
      String yours = "Yours sincerely";
      String sign = "Mr Albert Agnew Esq.\nHuman Resources Manager\nButtery Baps Unlimited\nwww.bb.co.nz";
      System.out.println(yours + "\n" + sign + "\n");
   }
   
} // end class