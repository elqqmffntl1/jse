/**
 * 
 */
package bank;

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
		Account account = null;
		int ok = 0;
		while (true) {
			switch (JOptionPane.showInputDialog("1.개설" + "2.입금" + "3.조회" + "4.출금" + "5.통장내역" + "0.종료")) {
			case "1":
				ok = JOptionPane.showConfirmDialog(null, "계좌개설 YES?");
				if (ok == 0) {
					account = new Account(JOptionPane.showInputDialog("이름"));
				} else {
					continue;
				}
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				account.setMoney(Integer.parseInt(inputMoney));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, account.getMoney());
				break;
			case "5":
				JOptionPane.showMessageDialog(null, MyConstants.BANK_NAME+"이름 : " + account.getName() + ",계좌번호 :" + account.getAccountNo());
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
