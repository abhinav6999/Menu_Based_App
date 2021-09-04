import java.util.Scanner;
public class Menu{
    public static void main(String[] args){
        System.out.println("Enter the number through menu list:");
        Scanner input=new Scanner(System.in);
        int numeric=input.nextInt();
        if(numeric==1){
            notepad();
        }
        else if(numeric==2){
            calc();
        }
        else if(numeric==3){
            chrome();
        }
    }
    static void notepad(){
        Runtime app = Runtime.getRuntime();
        try{
            app.exec("notepad");
           
        }
        catch (Exception Ex){
            System.out.println("Error: " + Ex.toString());
        }
    }
    static void calc(){
        Runtime app = Runtime.getRuntime();
        try{
            app.exec("calc");
           
        }
        catch (Exception Ex){
            System.out.println("Error: " + Ex.toString());
        }
    }

}