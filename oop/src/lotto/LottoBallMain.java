package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 24.
 * @author : 한상호
 * @file : SBSMain.java
 * @story :
 */
public class LottoBallMain {
	public static void main(String[] args) {
    LottoBean lot = new LottoBean();
    LottoBallService service = new LottoBallServiceImpl();
    StringBuffer buf = new StringBuffer();
    JOptionPane.showMessageDialog(null, "추첨시작?");
    service.setLottoBall(lot);
    int[] lottoBall = service.getLottoBall();
    for (int i = 0; i < lottoBall.length; i++) {
    	Arrays.sort(lottoBall);
		buf.append(lottoBall[i]+"\t");
	}
	System.out.println("로또\n"+buf);
	File output = new File("C:\\eclipse\\lotto\\lottoball.txt");
	BufferedWriter bw = null;
	String[] myLotto = buf.toString().split("/");

	try {
		bw = new BufferedWriter(new FileWriter(output,true));
		
		for(String lots : myLotto){
			lots += System.getProperty("line.separator");
			bw.write(lots);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try{
			bw.flush(); 
			bw.close(); 
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	}
}
