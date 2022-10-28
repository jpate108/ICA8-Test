import java.io.*;
import java.util.Scanner;


public class validurinals{
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
        System.out.println("Enter -1 if you have enter all the required input");
        String str=" ";
        while(str!="-1") {
            str = s.next();
            int a = -1;
            if (!str.equals("-1")){
                if(checkForValidString(str)){
                    a = countValidUrinals(str);
                }
                System.out.println(a);
            }
            else{
                System.out.println("Exiting from the input area");
            }

        }

    }

    public static void openTheFile() throws IOException {
        String pn=setNameofthePath();
        File file = new File("testing\\src\\main\\resources\\urinal.dat");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String b;
        int x;
        FileWriter w = new FileWriter(pn, true);
        while ((b = br.readLine()) != null){
            x = -1;
            if(checkForValidString(b)){
                x = countValidUrinals(b);
            }
            System.out.println(x);
            w.write(x + "\n" );

        }
        w.close();
        System.out.println("file has been created");
    }

    public static String setNameofthePath() throws IOException{
        int z=0;
        String pn="testing\\src\\main\\resources\\rule.txt";
        while(true)
        {
            File o = new File(pn);
            if(o.createNewFile()){
                System.out.println("Creating the file" + o.getName());
                z=0;
                break;
            }
            else{
                z=z+1;
                pn="testing\\src\\main\\resources\\rule"+Integer.toString(z)+".txt";
            }
        }
        return pn;
    }

    public static boolean checkForValidString( String str ) {  // checks to see if valid string
        //System.out.println ("Not yet implemented");
        char[] c = str.toCharArray();

        for(int i=0;i<c.length;i++)
        {
            if((c[i]=='1' && i+1<c.length && c[i]==c[i+1]) || (c[i]!='0' && c[i]!='1') )
            {
                return false;
            }
        }
        return true;
    }

    public static int countValidUrinals( String str ){
        //to count the number of the urinals available to use

        int l = str.length();
        int c = 0;
        char[] arr = new char[l];
        for( int j = 0; j < l ; j++ ){
            arr[j] = str.charAt(j);
        }
        for(int i = 0; i < l ; i++ ){
            if( arr[i] == '0' ){
                if( i == 0 ){
                    if ( arr [i + 1] == '0' ) {
                        c += 1;
                        arr[i] = 1;
                    }
                }
                else if( i == (l-1) ){
                    if ( arr[i - 1] == '0' ) {
                        c += 1;
                        arr[i] = 1;
                    }
                }
                else{
                    if( arr[i+1]=='0' && arr[i-1]=='0' ){
                        c += 1;
                        arr[i] = 1;
                    }
                }
            }
        }
        return c;
    }


}
