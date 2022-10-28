import java.io.*;
import java.util.Scanner;


public class validurinals {
    static Scanner s = new Scanner(System.in);
    public static void pickTheChoice() throws IOException {
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
        if(checkForValidString(str)){

            System.out.println("djancjks");
            countValidUrinals(str);

        }
        else {
            System.out.println("-1");
        }


    }

    public static void openTheFile() throws IOException {
        File file = new File("testing\\src\\main\\resources\\urinal.dat");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String b;
        while ((b = br.readLine()) != null){
            if(checkForValidString(b)){
                System.out.println("sasasasa");
                countValidUrinals(b);
            }
            else {

                System.out.println("-1");
            }
        }
    }

    public static boolean checkForValidString( String str ) {  // checks to see if valid string
        //System.out.println ("Not yet implemented");
        char[] c = str.toCharArray();
        int i=0,j=0;
        for(i=0;i<c.length;i++)
        {
            if((c[i]=='1' && i+1<c.length && c[i]==c[i+1]) || (c[i]!='1' && c[i]!='0') )
            {
                return false;
            }
        }
        return true;
    }

    public static int countValidUrinals(String str){
        //to count the number of the urinals available to use

        return 0;
    }


}
