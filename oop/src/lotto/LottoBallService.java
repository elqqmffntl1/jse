package lotto;

/**
 * @date : 2016. 6. 24.
 * @author : 한상호
 * @file : LottoBallService.java
 * @story :
 */
public interface LottoBallService {
    public void setLottoBall(LottoBean lot);
    public int[] getLottoBall();
    public boolean inDuplication(int num , int i);
    
}
