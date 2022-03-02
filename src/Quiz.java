
public class Quiz {
	
	public static void main(String[] args) {
		
		//first question
		MultipleChoiceQuestion question = new MultipleChoiceQuestion( "What is the informal name for the black fox?",
				"red fox",
				"silver fox",
				"shadow fox",
				"wild fox",
				"none",
		     	"B");
		question.check();
		
		//second question
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion( "What is the typical lifespan of a fox?",
				"1 - 3 years",
				"4 - 6 years",
				"7 - 9 years",
				"10 - 11 years",
				"12 and more years",
		     	"A");
		question2.check();
		
		//third question
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion( "Which of these is not a sound that fox can make?",
				"Whine",
				"Growl",
				"Meow",
				"Bark",
				"Yelp",
		     	"C");
		question3.check();
		
		//4th question
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion( "Which of these does not belong to the Vulpes genus?",
				"Arctic fox",
				"Bengal fox",
				"Kit fox",
				"Gray fox",
				"Red fox",
		     	"D");
		question4.check();
		
		//5th question
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion( "Which of these does not belong to the Lycalopex genus?",
				"Darwin's fox",
				"Hoary fox",
				"Pampas fox",
				"Sechuran fox",
				"Crab-eating fox",
		     	"E");
		question5.check();
		
		MultipleChoiceQuestion.showResults();
	}
}
