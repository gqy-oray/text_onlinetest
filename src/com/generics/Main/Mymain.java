package com.generics.Main;

import java.util.List;
import java.util.Scanner;

import com.generics.bean.ChoiceQuestion;
import com.generics.bean.FillQuestion;
import com.generics.bean.JudgleQuestion;
import com.generics.dao.impl.BasedaoImpl;

public class Mymain {
	public static void main(String[] args) {
		System.out.println("=========欢迎来到考试系统==========");
		Scanner s=new Scanner(System.in);
		//创建Basedaoimpl类对象，用到泛型，指定泛型数据为choiceQuestion也就是选择题
		BasedaoImpl<ChoiceQuestion> bdi=new BasedaoImpl<ChoiceQuestion>();
		//通过对象bdi获取装有选择题数据的链表，并赋值给list
		List<ChoiceQuestion> list=bdi.getQuestion();
		int count=0;
		System.out.println("一、选择提，每题两分");
		for(int i=0;i<list.size();i++){
			ChoiceQuestion l=list.get(i);//获取链表中的第（i+1）个元素
			System.out.println(i+1+"、"+l.getTitle());//输出题目
			System.out.println(l.getChoiceA());
			System.out.println(l.getChoiceB());
			System.out.println(l.getChoiceC());
			System.out.println(l.getChoiceD());
			System.out.println("请输入答案");
			String answer=s.next();//获取输入的答案答案
			if(l.getAnswer().equalsIgnoreCase(answer)){
				System.out.println("正确");
				count++;
				
			}else{
				System.out.println("错误");
			}
		}
		System.out.println("选择题总成绩："+count*2);
		
		
		BasedaoImpl<JudgleQuestion> jq=new BasedaoImpl<JudgleQuestion>();
		List<JudgleQuestion> listjq=jq.getJudgle();
		int count1=0;
		System.out.println("二：判断题，每题两分");
		for(int i=0;i<listjq.size();i++){
			JudgleQuestion j=listjq.get(i);
			System.out.println(i+1+"、"+j.getTitle());
			System.out.println("请输入答案t/f");
			String answer=s.next();
			if(j.getAnswer().equalsIgnoreCase(answer)){
				System.out.println("正确");
				count1++;
			}else{
				System.out.println("错误");
			}
			
		}
		System.out.println("判断题成绩："+count1*2);
		
		BasedaoImpl<FillQuestion> fill=new BasedaoImpl<FillQuestion>();
		List<FillQuestion> listfill=fill.getFill();
		int count2=0;
		System.out.println("三、填空题，每题两分");
		for(int i=0;i<listfill.size();i++){
			FillQuestion f=listfill.get(i);
			System.out.println(i+1+"、"+f.getTitle());
			System.out.println("请输出答案");
			String answer=s.next();
			if(f.getAnswer().equalsIgnoreCase(answer)){
				System.out.println("正确");
				count2++;
			}else{
				System.out.println("错误");
			}
			
		}
		System.out.println("判断题成绩："+count2*2);
		System.out.println("总成绩："+(count+count1+count2)*2);
	}

}
