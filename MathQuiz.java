package MathQuiz;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathQuiz {
    static Scanner input = new Scanner(System.in);

    public static void partA(){
        int Counter=0;
        int Score=0;
        System.out.println("MathQuiz - Part 1A");
        while(Counter<10){
            ++Counter;
            Random rnd=new Random();
            int n1=rnd.nextInt(11)+10;
            int n2=rnd.nextInt(11)+10;
            int answer=n1*n2;
            System.out.println(n2+" * "+n1+" = ?");
            int inp=input.nextInt();
            if(inp==answer){
                ++Score;
                System.out.println("Correct answer. Score: "+Score+"("+Counter+")");
            }
            else{
                System.out.println("Incorrect answer. Score: "+Score+"("+Counter+")");
            }
        }
        System.out.println("Good-bye");
    }
    public static void partB(){
        int Counter=0;
        int Score=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String sinput="";
        boolean loop=true;
        Pattern pt=Pattern.compile("[a-zA-Z]");
        Matcher matcher;
        System.out.println("MathQuiz - Part 1B");
        Random rnd=new Random();
        int num1=rnd.nextInt(11)+10;
        int num2=rnd.nextInt(11)+10;
        int ans=num1*num2;
        while(loop){
            System.out.println(num1+" * "+num2+" = ?");
            try{
                sinput=br.readLine();
            }
            catch(IOException name){}
            matcher=pt.matcher(sinput);
            if(sinput.equals("q")){
                System.out.println("Good-bye");
                break;
            }
            else if(matcher.find()){
                System.out.println("Invalid input");
            }
            else{
                ++Counter;
                int result=Integer.parseInt(sinput);
                if(result==ans) {
                    ++Score;
                    System.out.println("Correct answer. Score: " + Score + "(" + Counter + ")");
                }
                else{
                    System.out.println("Incorrect answer. Score:" + Score + "(" + Counter + ")");
                }
                num1=rnd.nextInt(11)+10;
                num2=rnd.nextInt(11)+10;
                ans=num1*num2;
            }

        }
    }
}