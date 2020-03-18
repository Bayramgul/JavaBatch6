package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		/*if student completed a quiz we will check for a score
		 * if score is more than90---> great job
		 * if score >80 --->well done
		 * of score>70 --> you could have done better
		 * 
		 * if student didnt complete the quiz--->not good
		 * please do hw on time
		 */
	boolean quizCompleted=true;
	int score=30;
	if (quizCompleted) {
		System.out.println("Awesome! Let's check your score");
		if (score>90) {
			System.out.println("Great job, you study a lot");
		}else if (score>80) {
			System.out.println("Well done!");
		}else if (score>70 ) {
			System.out.println("you could have done better!");
		}else {
				System.out.println("You failed");
			
			
		}
		
	}else {
		System.out.println("Please do HW on time");
	}
	
	
	}

}
