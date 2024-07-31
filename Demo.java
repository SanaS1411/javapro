import java.io.*;
class Demo{
public static void main(String[] arg){
file fin=new file("Input.dat");
file fout=new file("output.data");
try{
fileReader fr=new FileReader("fin");
fileWrite fw=new FileWrite("fout");
int ch;
while((ch=fr.read())!=-1)
{
fw=write=ch;

}

}catch(IoExeption e ){
System.out.println(e);
}
fin.close();
fout.close();
}
}
