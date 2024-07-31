import java.io.*;
class NewFile{
public static void main(String [] args){
File f=new File("E:/DEEE.txt");

try{ 
if(f.createNewFile()){
System.out.println("file is creat");
}
else{
System.out.println("file is already exist");

}
}catch(IOException e){
System.out.println("error is="+e);
}
}
}
