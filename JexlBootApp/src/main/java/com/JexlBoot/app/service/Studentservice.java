package com.JexlBoot.app.service;


import java.util.List;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.MapContext;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.JexlBoot.app.Repo.UserRepo;
import com.JexlBoot.app.entity.StudentResult;

@Service
public class Studentservice implements Student_Service, Jexl_Service {
	
	@Autowired
	private UserRepo userrepo;

	/*
	 * JEXL Engine and Jexlcontext 
	 */
	
	 JexlEngine jexlengine = new JexlBuilder().create();
     JexlContext jexlcontext = new MapContext();
	
     /*
      * Get method [ retrive all data from database ]
      */
	
	@Override
	public List<StudentResult> Getstudent() {
		
		return (List<StudentResult>) userrepo.findAll();
	}



	/*
	 * JEXL Expression 
	 */
	
	@Override
	public String Getmatcheddata(StudentResult student) {

		   jexlcontext.set("marks", 35);
	        jexlcontext.set("student", student);
	        
	        /*
	         * JEXL Expression one
	         */
	        String expression="(student.Math+ student.Science + student.Physics)/3"; 
	        int percentage=(int) jexlengine.createExpression(expression).evaluate(jexlcontext);
	        student.setPercentage(percentage);
	        
	        /*
	         * JEXL Expression Two
	         */
	        String expressionone = "(student.Math >= marks && student.Science >= marks && student.Physics >= marks  )? 'pass' : 'fail'";
	        String result=(String) jexlengine.createExpression(expressionone).evaluate(jexlcontext); 
		    student.setResult(result);
		    String showresult=result;
		       
		    /*
		     * Set context   
		     */
		      
	        jexlcontext.set("percentage", percentage);
	        jexlcontext.set("result",result );
	        

	        /*
	         * JEXL Expression Three
	         */
	        String expressiontwo = "Result.equals('fail') ? true :false ";
	        Boolean resultone=(Boolean) jexlengine.createExpression(expressiontwo).evaluate(jexlcontext); 
	        
	        if(resultone==true)
	        	 student.setPercentage(0);
	       
	        	
	        
	        student.setResult(result);
	        
	        userrepo.save(student);
	       
	        return showresult;
		
	}


}
