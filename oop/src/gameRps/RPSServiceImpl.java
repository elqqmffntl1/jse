package gameRps;

import java.util.Random;

public class RPSServiceImpl implements RPSService{

	RPSBean res = new RPSBean();
	
	@Override
	public void batPlayerValue(int playerValue) {
	    res.getPlay();
	}
	@Override
	public void setComputerValue() {
		//랜덤수
		Random random = new Random();
		int num=0;
		num = random.nextInt(3)+1;
		res.setComp(String.valueOf(num));
		
	}

	@Override
	public void whoWin() {
	}

	@Override
	public String showResult() {
		return null;
	
	}
	@Override
	public boolean checkValidation(String rps) {
		return false;
	
	}

}
