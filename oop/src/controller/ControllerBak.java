/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;



/**
 * @date : 2016. 6. 14.
 * @author : 한상호
 * @file : Controller.java
 * @story :
 */
public class ControllerBak {
	public static void main(String[] args) {
	String menu="";
    Scanner s = new Scanner(System.in);
    Calc calc = new Calc();
    Kaup kaup = new Kaup();
    Month month = new Month();
    while (true) {
		menu = JOptionPane.showInputDialog(
				  "1.계산기 "
				+ "2.Kapu구하기 "
				+ "3.년월말구하기 "
				+ "4.1등구하기"
				+ "5.학번/나이 "
				+ "6.최고최저점수 "
				+ "7.세금액 "
				+ "8.성별판별 "
				+ "9.시분초구하기"
				+ "0.종료");
		switch (menu) {
		case "1":
			System.out.println("첫번째 숫자 :");
			System.out.println("연산자 :");
			System.out.println("두번째 숫자 :");
			System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
		break;
		case "2":
	
		    break;
		case "3":
			System.out.println("년도");
			System.out.println("월");
			System.out.println(month.execute(s.nextInt(),s.nextInt()));
		    break;
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":	
		case "0" :
			JOptionPane.showConfirmDialog(null,"종료하시겠습니까?");
			return;
		default:
			System.out.println("목록 중에 선택하세요");
			break;
		}
		System.out.println();
	}
  }
}