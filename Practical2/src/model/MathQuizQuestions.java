package model;

import controller.Practical2Validation;
public class MathQuizQuestions {
	private int questionNo;
	private String question;
	private String ans;
	
	public int getQuestionNo() {
		return questionNo;//get question number
	}


	public void setQuestionNo(int questionNo) {
		this.questionNo = Practical2Validation.isValidQNum(questionNo)?questionNo:null;//store as question number if valid and leave empty if invalid
	}
	
	public String getQuestion() {
		return question;//get question stored
	}


	public void setQuestion(String question) {
		this.question = Practical2Validation.isValidQ(question)?question:null;//store it as question if valid and leave empty if not
	}

	public String getAns() {//get answer stored
		return ans;
	}

	public void setAns(String ans) {
		this.ans = Practical2Validation.isValidAns(ans)?ans:"false";//store it as answer if valid and set false if invalid	
	}

	@Override
	public String toString() {
		return "MathQuizQuestions [questionNo=" + questionNo + ", question=" + question + ", ans=" + ans + "]";
	}

}
