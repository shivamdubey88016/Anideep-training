public class Calculator {
    int a,b,c,d,e;
    int sum;
    Calculator(int a, int b){
        this.a=a;
        this.b=b;
    sum=a+b;
    System.out.println("Addition of two number is: "+c);
}   


Calculator(int a, int b, int c){
    this.a=a;
    this.b=b;
    this.c=c;
    sum=a+b+c;
    System.out.println("Addition of three number is: "+sum);
}

Calculator(int a, int b, int c, int d){
    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;
    sum=a+b+c+d;
    System.out.println("Addition of four number is: "+sum);
}
public static void main(String[] args) {
    Calculator obj1=new Calculator(10,20);
    Calculator obj2=new Calculator(10,20,30);
    Calculator obj3=new Calculator(10,20,30,40);
}
}