package com.generics.bean;

public class ChoiceQuestion {
	private String title;
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	private String answer;
	public ChoiceQuestion() {
		// TODO 自动生成的构造函数存根
	}
	public ChoiceQuestion(String title,String choiceA,String choiceB,String choiceC,String choiceD,String answer){
		this.title=title;
		this.choiceA=choiceA;
		this.choiceB=choiceB;
		this.choiceC=choiceC;
		this.choiceD=choiceD;
		this.answer=answer;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getChoiceA() {
		return choiceA;
	}
	public void setChoiceA(String choiceA) {
		this.choiceA = choiceA;
	}
	public String getChoiceB() {
		return choiceB;
	}
	public void setChoiceB(String choiceB) {
		this.choiceB = choiceB;
	}
	public String getChoiceC() {
		return choiceC;
	}
	public void setChoiceC(String choiceC) {
		this.choiceC = choiceC;
	}
	public String getChoiceD() {
		return choiceD;
	}
	public void setChoiceD(String choiceD) {
		this.choiceD = choiceD;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}


}
