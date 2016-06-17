/**
 * 
 */
package school;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 16.
 * @author : 한상호
 * @file : SchoolController.java
 * @story :
 */
public class SchoolController {
	public static void main(String[] args) { // String[] params

		Student stu = null;
		int ok = 0;
		while (true) {
			switch (JOptionPane.showInputDialog("1.등록2.조회0.종료")) {
			case "1":
				stu = new Student(JOptionPane.showInputDialog("ID"), JOptionPane.showInputDialog("PW"),
						JOptionPane.showInputDialog("이름"), JOptionPane.showInputDialog("주민번호"));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, stu.toString());
				break;
			case "0":
				ok = JOptionPane.showConfirmDialog(null, "Close OK?");
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
