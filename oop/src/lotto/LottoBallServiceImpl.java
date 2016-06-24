package lotto;

/**
 * @date : 2016. 6. 24.
 * @author : 한상호
 * @file : LottoBallServiceImpl.java
 * @story :
 */
public class LottoBallServiceImpl implements LottoBallService {

	private int[] lottoBall;

	@Override
	public void setLottoBall(LottoBean lot) {
		this.lottoBall = new int[6];
		int i = 0;
		while (true) {
			lot.setNumber();
			int num = lot.getNumber();
			this.lottoBall[i] = num;
			if (inDuplication(num, i)) {
				continue;
			}
			i++;
			if (i == lottoBall.length) {
				i = 0;
				break;
			}
		}

	}

	@Override
	public int[] getLottoBall() {
		return lottoBall;
	}

	@Override
	public boolean inDuplication(int num, int i) {
		for (int j = 0; j < i; j++) {
			if (lottoBall[j] == num) {
				return true;
			}
		}
		return false;
	}

}
