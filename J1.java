import java.util.Scanner;

public class J1 {

public static void main(String[] args) {

	System.out.println("密碼輸入測試");
	System.out.print("請輸入密碼:");
	Scanner wrt = new Scanner(System.in);
	int setpass1=wrt.nextInt();
outsideloop:for(int j=1 ;j<=2;j++) { 
insideloop:for(int i=1;i<=2;i++) {


System.out.print("請再輸入一次密碼:");
Scanner wrti = new Scanner(System.in);
int setpass2=wrti.nextInt();

if (setpass1==setpass2){
System.out.print("密碼正確");
break outsideloop;
} 
else if (setpass1 !=setpass2){
System.out.println("與第一次輸入的不同!");


if (j==2) {
System.out.println("輸入三次錯誤！程\r\n"+ "式停止！");
break outsideloop;
}
}
}
}

}

}