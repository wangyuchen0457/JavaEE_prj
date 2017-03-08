package com.dao;

public class CDate {

	public String countDate(String date_str,int days){
		
		int yy=Integer.parseInt(date_str.substring(0,4));
		int dd = Integer.parseInt(date_str.substring(8,10));
		int mm =Integer.parseInt(date_str.substring(5,7));
		int day=0;
		if (mm==2) {
			if (yy%4!=0) {
				day=28;
			}else {
				day=29;
			}
		}else if (mm==1 || mm==3 || mm==5||mm==7||mm==8||mm==10||mm==12) {
			day=31;
		}else {
			day=30;
		}
		if (2*day>=dd+days && dd+days >day) {
			mm++;
		}else if (3*day>=dd+days && dd+days>2*day) {
			mm=mm+2;
		} else if (4*day>=dd+days && dd+days>3*day){
			mm=mm+3;
		}else {
			mm=mm+4;
		}
         int d=(dd+days)%day;
         String DD = date_str.substring(0,5)+mm+"-"+d;
		return DD;	
	}
}
