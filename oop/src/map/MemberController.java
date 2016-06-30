package map;

import javax.swing.JOptionPane;

public class MemberController {
	public static void main(String[] args) {
		String spec ="";
		String[] specArr = new String[4];
		MemberService service = new MemberServiceImpl();
		
		String temp = "";
    while (true) {
		switch (JOptionPane.showInputDialog("---회원이 보는 화면---\n"
				+"1회원가입 2로그인 3내정보보기(detail) 4내정보수정(비번) 5탈퇴 0종료\n"
				+"---관리자 화면---\n"
				+"11회원목록 12검색(ID) 13검색(이름) 14인원수(성별) 15회원수")) {
		case "1":
		    temp = JOptionPane.showInputDialog("id,pw,name,gender");
			String[] arr = temp.split(",");
			MemberBean member = new MemberBean();
		    member.setId(arr[0]);
		    member.setPw(arr[1]);
		    member.setName(arr[2]);
		    member.setGender(arr[3]);
			JOptionPane.showMessageDialog(null, service.join(member)); 
			break;
		case "2":
			temp = JOptionPane.showInputDialog("id,pw");
			String[] arr2 = temp.split(",");
			MemberBean member2 = new MemberBean();
			member2.setId(arr2[0]);
			member2.setPw(arr2[1]);
			JOptionPane.showMessageDialog(null, service.login(member2));
			break;
		case "3":
			JOptionPane.showMessageDialog(null,service.detail());
			break;
		case "4":
			service.updatePw(null);
			break;
		case "5":
			JOptionPane.showMessageDialog(null,service.delete());
			break;
		case "11":
			JOptionPane.showMessageDialog(null, service.list());
			break;
		case "12":
			temp = JOptionPane.showInputDialog("ID 입력");
			JOptionPane.showMessageDialog(null, service.findById(temp));
			break;
		case "13":
			temp = JOptionPane.showInputDialog("이름 입력");
			JOptionPane.showMessageDialog(null, service.findByName(temp));
			break;
		case "14":
			JOptionPane.showMessageDialog(null, service.countByGender(temp));
			break;
		case "15":
			JOptionPane.showMessageDialog(null, service.count());
			break;
		case "0":
			return;
		default:
			break;
		}
	}
	}
}
