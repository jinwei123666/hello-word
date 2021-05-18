import java.util.Scanner;

public class C4 {

public static void main(String[] args) {

Scanner x=new Scanner(System.in);

System.out.println("请输入这个数：");

int d=x.nextInt();

int a=d/100;

int b=d/10%10;

int c=d%10;

if(a*100+b*10+c==a*a*a+b*b*b+c*c*c) {

System.out.println( +d+"此数为水仙花数");

 

}

else {

System.out.println(+d+"此数不是水仙花数" );

}

}

}
