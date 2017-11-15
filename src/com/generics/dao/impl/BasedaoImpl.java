package com.generics.dao.impl;

import java.util.LinkedList;
import java.util.List;

import com.generics.bean.ChoiceQuestion;
import com.generics.bean.FillQuestion;
import com.generics.bean.JudgleQuestion;
import com.generics.dao.Basedao;
import com.generics.data.ChoiceQusetionData;
import com.generics.data.JudgleQustiondata;
import com.generics.data.fillQuestiondata;

public class BasedaoImpl<T> implements Basedao<T> {

	@Override
	public List<T> getQuestion() {
		String[] data=ChoiceQusetionData.chioceQuestiondata;
		List choiceData=new LinkedList<T>();
		for(String d:data){
			String[] str=d.split("/");
			ChoiceQuestion cq=new ChoiceQuestion(str[0],str[1],str[2],str[3],str[4],str[5]);
			choiceData.add(cq);
		}
		return choiceData;
	}

	@Override
	public List<T> getJudgle() {
		String[] data=JudgleQustiondata.JudgleQuestiondate;
		List judgledata=new LinkedList<T>();
		for(String x:data){
			String[] str=x.split("/");
			JudgleQuestion judgle=new JudgleQuestion(str[0],str[1]);
			judgledata.add(judgle);
		}
		return judgledata;
	}

	@Override
	public List<T> getFill() {
		// TODO 自动生成的方法存根
		String[] data=fillQuestiondata.fillQuestiondata;
		List filldata=new LinkedList<T>();
		for(String x:data){
			String[] str=x.split("/");
			FillQuestion fq=new FillQuestion(str[0],str[1]);
			filldata.add(fq);
		}
		return filldata;
	}
	

}
