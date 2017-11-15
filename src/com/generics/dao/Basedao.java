package com.generics.dao;

import java.util.List;

public interface Basedao<T> {
	public abstract List<T> getQuestion();
	public abstract List<T> getJudgle();
	public abstract List<T> getFill();
	

}
