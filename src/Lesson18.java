import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Lesson18 {
    public static void main(String args[]){
        //FIRST NAME,LAST NAME,PHONE NUMBER (DIGITS ONLY),EMAIL ADDRESS
        //Damien,Beginner,7819999999,beginner@noob.com
        File f = new File("names.csv");
        String line = "";
        ArrayList<Person> people = new ArrayList<>();
        try{
            Scanner scan = new Scanner(f);
            while(scan.hasNext()){
                line = scan.nextLine();
                String[] parts = line.split(",");
                if(checkDigits(parts[2])) {
                    people.add(new Person(parts[0], parts[1], parts[2], parts[3]));
                }
            }
        }catch (FileNotFoundException fnf){
            System.err.println("An error occurred while trying to open the file, it wasn't found at.... ");
            fnf.printStackTrace();
        }

        for(Person p:people){
            p.output();
        }
    }

    public static boolean checkDigits(String phoneNumber){
        boolean isAllNumbers = true;
        for(int i=0; i<phoneNumber.length(); i++){
            if(!Character.isDigit(phoneNumber.charAt(i) )){
                isAllNumbers = false;
                break;
            }
        }
        return isAllNumbers;
    }
}
