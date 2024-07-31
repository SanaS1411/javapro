class Student{
int rollnumber;
void getnumber(int n){
rollnumber=n;
}
void putnumber()
{
System.out.println("roll number:"+rollnumber);
}
}
class test extends Student{
float part1,part2;
void getmarks(float m1,float m2)
{
part1=m1;
part2=m2;
}
void putmarks(){
System.out.println("marks obtained");
system.out.println("part1="+part1);
System.out.println("part2="+part2);
}
}
interface Sports
{
float sports=6.0F;
void putwt();
}
class Results extends Test implements Sports
{
float total;
public void putwt(){
System.out.println("Sports wt="+Sportswt);
}
void display(){
total=part1+part2+sportswt;
putnumber();
putmarks();
putwt();
System.out.println("total score="+total);
}
}
class Hybrid{
public static void main(String[]args){
Results Student1=new Students();
Student1.getnumber(123);
student1.getmarks(24.5f,33.5f);
Students1.display();
}
}