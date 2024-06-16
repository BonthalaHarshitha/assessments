package com.samples.appexample.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class SpringBootRunnerWithInputData implements CommandLineRunner {
	
	@Value("${my.info.stud.id}")
	private int id;
	
	@Value("${my.info.stud.name}")
	private String name;
	
	@Value("${my.info.stud.percent}")
	private double percent;

	
	//instead of setter getter methods
	//let us print using toString
	@Override
	public String toString() {
		return "SpringBootRunnerWithInputData [id=" + id + ",Student name=" + name + " percenatge=" + percent  + "]";
	}
	
	//override the run method
	public void run(String...args) throws Exception {
		System.out.println(this);
	}
	
	


}
