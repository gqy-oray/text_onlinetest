package com.generics.bean;

public class JudgleQuestion {
	private String title;
	private String answer;
	public JudgleQuestion() {
		// TODO 自动生成的构造函数存根
	}
	public JudgleQuestion(String title,String answer){
		this.title=title;
		this.answer=answer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
