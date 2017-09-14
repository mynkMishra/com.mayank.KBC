package view;

import DTO.QuestionDTO;
import model.QuestionOperation;

public class QuestionView {
	
	public void printQuestion(){
		
		QuestionOperation questionOperation = new QuestionOperation();
		
		//System.out.println(questionOperation.fetchQuestion());
		QuestionDTO questionDTO = new QuestionDTO();
		questionDTO	= questionOperation.fetchQuestion(0);
		System.out.println(questionDTO);
		//System.out.println("Q."+questionDTO.getQuesId()+questionDTO.getQuestion()+questionDTO.getRightAnswer()+questionDTO.getScore());
	}

}
