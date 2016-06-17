/**
 * 
 */
package something;

import javax.swing.JOptionPane;

/**
 * @date   : 2016. 6. 17. 
 * @author : 한상호
 * @file   : SomethingC.java
 * @story  : 
*/
public class SomethingC {
public static void main(String[] args) {
	Something s = null;
	int ok = 0;
	while (true) {
		switch (JOptionPane.showInputDialog("1.등록2.조회0.종료")) {
		case "1":
			String bbb = JOptionPane.showInputDialog("bbb 문자");
			String sccc = JOptionPane.showInputDialog("ccc 숫자");
			int ccc = Integer.parseInt(sccc);
			s = new Something(bbb, ccc);
			String aaa = JOptionPane.showInputDialog("aaa");
			String sddd = JOptionPane.showInputDialog("ddd");
			s.setAaa(aaa);
			int ddd = Integer.parseInt(sddd);
			s.setDdd(ddd);
			break;
		case "2":	
            JOptionPane.showMessageDialog(null, s.getAaa()+s.getBbb()+s.getCcc()+s.getDdd());   
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
