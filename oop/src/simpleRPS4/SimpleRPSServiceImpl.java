package simpleRPS4;

import java.util.Random;

public class SimpleRPSServiceImpl implements SimpleRPSService {
    SimpleRPSBean rps = new SimpleRPSBean();
	@Override
	public String playGame(int player) {
		String result = "";
		rps.setPlay(player);
		rps.setComp();
		int com = rps.getComp();
		int ply = rps.getPlay();
		System.out.println("디버깅 컴"+com+"나"+ply);
		if (com==ply) {
			return "TIE";
		}else{
		switch (Math.abs(ply-com)) {
		case 1:
			result = (ply>com)? "WIN" : "LOSE";
			break;
		case 2:
			result = (ply>com)? "LOSE" : "WIN";
			break;
		default:
			break;
		}
	}
		return result;
}
	@Override
	public String getResult(String result) {
		
		return "플레이어는 : "+rps.getValue(rps.getPlay())+"\n"
		+"컴퓨터 : "+rps.getValue(rps.getComp())+"\n"
		+"결과 : "+this.playGame(rps.getPlay());
	}

}
