package com.techlab.action;

import java.util.Date;

import com.opensymphony.xwork2.Action;

public class BrowseAction implements Action {
	private String msg;
	private Date date = new Date();
	private int hours = date.getHours();

	@Override
	public String execute() throws Exception {
		System.out.println("Inside Browse Action");
		// TODO Auto-generated method stub
		if (hours > 1 && hours < 12) {
			this.msg = "Good Morning";
		} else if (hours > 12 && hours < 16) {
			this.msg = "Good Afternoon";
		} else if (hours > 16 && hours < 20) {
			this.msg = "Good Evening";
		} else
			this.msg = "Good Night";
		return "success";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
