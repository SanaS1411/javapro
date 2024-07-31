class throwexam{
int divi(int a,int b)
{
int d;
d=a/b;
return d;
}
public static void main(String arg[])
{
throwexam th=new throwexam();
try{
int result;
result=th.divi(14,0);
System.out.println(result);
}
catch(ArithmeticException e){
System.out.println("division can not be dived zero");
}
}
}
