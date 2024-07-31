
class usethow{
void voting(int age){

if(age<18) {
throw new ArithmeticException("not eligile for voting");
}
else{
System.out.println("you are eligibbble for voting");
}
}
public static void main(String [] args){
usethow th=new usethow();
th.voting(10);
}
}

