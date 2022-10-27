import java.util.Scanner;

public class validurinals {
    static Scanner s = new Scanner(System.in);
    public static void pickTheChoice(){
        System.out.println("Enter how you want to give the strings");
        System.out.println("1 for input from the keyboard");
        System.out.println("2 for input from the file");

        int a = s.nextInt();

        if(a==1){
            getTheString();
        }
        else{
            openTheFile();
        }
    }
    public static void getTheString(){
        //to get the string from the user
        System.out.println("Enter the string for urinals");

        String str= s.next();
        if(!checkForValidString(str)){
            System.out.println("You have entered the wrong string for validation please try again");
        }
        else {
            countValidUrinals(str);
        }


    }

    public static void openTheFile(){
        //to read the input from the file that is given by the user
    }

    public static boolean checkForValidString( String str ) {  // checks to see if valid string
        System.out.println ("Not yet implemented");
        return true;
    }

    public static int countValidUrinals(String str){
        //to count the number of the urinals available to use
        return 0;
    }


}
