/**
 * 
 */
package bank;

import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.Constants;

import global.MyConstants;

/**
 * @date : 2016. 6. 15.
 * @author : 한상호
 * @file : BankController.java
 * @story :
 */
public class BankController {
	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		int ok = 0;
		while (true) {
			switch (JOptionPane.showInputDialog("1.개설" + "2.입금" + "3.조회" + "4.출금" + "5.통장내역" + "0.종료")) {
			case "1":
				String spec = JOptionPane.showInputDialog("이름,ID,PW");
				String[] specArr = spec.split(",");
				service.openAccount(specArr[0], specArr[1], specArr[2]);
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
			//	account.setMoney(Integer.parseInt(inputMoney));
				service.deposit(Integer.parseInt(inputMoney));
				break;
			case "3":
			//	JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4":
				String outputMoney = JOptionPane.showInputDialog("출금액?");
				JOptionPane.showMessageDialog(null,service.withdraw(Integer.parseInt(outputMoney)));
				break;
			case "5":
				JOptionPane.showMessageDialog(null,service.showAccount());
				break;
			case "0":
				ok = JOptionPane.showConfirmDialog(null, "close OK?");
				if (ok == 0) {
					return;
				} else {
					continue;
				}
			default:
				return;
			}
		}
	}
}
