package controller;

/**
 * @date : 2016. 6. 14.
 * @author : 한상호
 * @file : Kapu.java
 * @story :
 */
public class Kaup {
	public String execute(String n,String h,String w) {
		//-----init------
		String name =n,result="";
		double height = Double.parseDouble(String.format("%.1f", h)),
				weight = Double.parseDouble(String.format("%.1f", w)),
				kaup = 0.0;
		//------op-------
		
		kaup = weight / (height/100) / (height/100);
		if (kaup < 18.5) {
			result = "저체중";
		} else if(kaup >= 18.5 && kaup <= 22.9){
			result = "정상체중";
		} else if(kaup >= 23.0 && kaup <= 24.9){
			result = "위험체중";
		} else if(kaup >= 25.0 && kaup <= 29.9){
			result = "비만 1단계";
		} else if(kaup > 30 && kaup < 40){
			result = "비만 2단계";
		} else if(kaup >= 40.0){
			result = "비만 3단계";
		}
		return "%s은 BMI지수는 "+Double.parseDouble(String.format("%.2f", kaup))+"이고%s이다";
		// 위 문장을 printf 로 변경하시오
	}

}

