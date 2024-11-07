package dar.it2d;

import java.util.Scanner;


public class DARIT2D {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("DOCTOR APPOINTMENT RECORDS");
    System.out.println("ADD APPOINTMENT");
    System.out.println("EDIT APPIONTMENT");
    System.out.println("REMOVE APPOINTMENT");
    System.out.println("REOMOVE APPOINTMENT");
    System.out.println("VIEW APPOINTMENT");
    System.out.println("EXIT");
    
    System.out.println("ENTER ACTION: ");
    int action = sc.hashCode();
    
    
    switch(action){
        case 1:
         Patient cs = new Patient();
         cs.cTransaction();
         break;
    }
    }
    
}
