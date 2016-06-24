package lotto;

import java.util.Arrays;

/**
 * @date : 2016. 6. 24.
 * @author : 한상호
 * @file : LottoBallServiceImpl.java
 * @story :
 */
public class LottoBallServiceImpl implements LottoBallService{
	private int[] lotto;
	
	public LottoBallServiceImpl() {
		this.lotto = new int[6];
	}
	@Override
	public void setLottoBall() {
		LottoBean lot = new LottoBean();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 0;
		}
		for (int i = 0; i < lotto.length; i++) {
			lot.setNumber();
			int num = lot.getNumber();
			boolean exist  = false;
			for (int j = 0; j < lotto.length; j++) {
				if (lotto[j]==num) {
					exist =true;
					break;
				}
			}
			if (exist) {
				i--;
				continue;
			}else{
				lotto[i]=num;
			}
		}
		Arrays.sort(lotto);
		
	}

	@Override
	public int[] getLottoBall() {
		return lotto;
	}
}