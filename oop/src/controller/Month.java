package controller;

/**
 * @date   : 2016. 6. 14. 
 * @author : 한상호
 * @file   : Month.java
 * @story  : 
*/
public class Month {
public String execute(int year2,int month2){
	int year = year2;
	int	month= month2;
	int malil= 0;
//---------op --------
switch (month) {
case 1:case 3:case 5:case 7:case 8:case 10:case 12:
	malil = 31;
	break;
case 2:
	malil =(year%4==0&&year%100!=0||year%400==0)?29:28;
	break;
case 4:case 6:case 9:case 11:
	malil = 30;
	break;
default:System.out.println("잘못 입력 되었습니다");
	break;
}	
  return year+"년"+month+"월"+malil+"일";
	
}
}
