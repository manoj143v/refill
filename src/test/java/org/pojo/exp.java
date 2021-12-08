package org.pojo;


import org.test2.base;

public class exp extends base{
	public static void main(String[] args) {
		launchbro();
		launchurl("https://en-gb.facebook.com/");
		sampojo s=new sampojo();
	    sendkeys("manoj@gmail.com", s.getLogin());
	    sendkeys("vardhini weds manoj", s.getPass());
	    clickbtn(s.getClckbtns());
	}
	
}
