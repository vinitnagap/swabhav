package com.techlab.action;

import org.apache.struts2.ServletActionContext;

import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.EmailService;

public class EmailAction extends ActionSupport {
	private String to;
	private String captchaCode;
	private EmailService obj = null;
	int resp = 0;

	public String getCaptchaCode() {
		return captchaCode;
	}

	public void setCaptchaCode(String captchaCode) {
		this.captchaCode = captchaCode;
	}

	public void validate() {
		Captcha captcha = Captcha.load(ServletActionContext.getRequest(), "exampleCaptcha");
		boolean isHuman = captcha.validate(captchaCode);
		if (!isHuman) {
			addFieldError("captchaCode", "Incorrect code");
		}
		System.out.println(captcha.getCaptchaId());
		// reset captcha code textbox
		captchaCode = null;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public EmailService getObj() {
		return obj;
	}

	public void setObj(EmailService obj) {
		this.obj = obj;
	}

	@Override
	public String execute() {
		obj = new EmailService();
		resp = obj.sendMail(to);
		if (resp == 1) {
			return "success";
		} else {
			return "error";
		}
	}
}
