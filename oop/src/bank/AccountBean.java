/**
 * 
 */
package bank;

import java.util.Random;

import global.MyConstants;

/**
 * @date   : 2016. 6. 16. 
 * @author : 한상호
 * @file   : Account.java
 * @story  : 
*/
public class AccountBean {
	private int accountNo; // 인스턴스 변수는 초기화를 하지않는다
	private String name;
	private int money;
	private String id;
	private String pw;
	
	public AccountBean() {
		// default constructor 기본 생성자
		// 생성자 오버로딩
	}
	
	public AccountBean(String name,String id,String pw) {
		this.accountNo = (int) (Math.random() * 999999)+100000; ;
		this.name = name;
		this.id = id ;
		this.pw = pw ;
	}

	public void setMoney(int money){
		this.money = money;
	}
	public void setPw(String pw){
		this.pw = pw;
	}
	public int getAccountNo(){
		return accountNo;
	}
	public String getName(){
		return name;
	}
	public int getMoney(){
		return money;
	}
	public String getId(){
		return id;
	}
	public String getPw(){
		return pw;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() { // 메소드 오버라이딩
		return MyConstants.BANK_NAME+" [계좌번호=" + accountNo + ", 이름=" + name + ", 잔액=" + money + ", 비번=" + id + ", 비밀번호=" + pw
				+ "]";
	}
	
}
