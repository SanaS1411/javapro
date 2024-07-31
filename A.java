class bank{
int amount,name;
void show(){
System.out.println("enter your name");
System.out.println("enter your amount");
}
}
class saving ecccccextends bank{
void display(){
System.out.println("saru");
System.out.println("saving is 1,00,000");
System.out.println("withdraw amount is 50,000");
}
}
class joint extends saving{
void input(){
System.out.println("withdraw amount is 50,000");
}
}
class A{
public static void main(String[]args){
joint j=new joint();
j.input();
}
}