package com.hexa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="iqvia_score")
public class Score extends Student{

	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
