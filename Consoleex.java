import java.io.*;
class Consoleex{
public static void main(String[] args){

Console con=System.console();
System.out.println("enter the name=");
String name=con.readLine();
System.out.print("welcome"+name);
}
}