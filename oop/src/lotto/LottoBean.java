package lotto;


/**
 * @date : 2016. 6. 23.
 * @author : 한상호
 * @file : LottoBean.java
 * @story :
 */
public class LottoBean {
	private int money,number;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber() {
		this.number = (int) (Math.random()*45+1); //랜덤수
	}
	@Override
	public String toString() {
		return "LottoBean [money=" + money + ", number=" + number + "]";
}
}