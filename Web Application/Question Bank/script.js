var optionMark = false;
var currentQuestion = 1;
var correctAnswers = 0;
var count = 0;


var startButton = document.querySelector("#startButton");
startButton.addEventListener("click",start,false);

var questions = [
                {
                    id: 1,
                    text: "Capital of India is ________?",
                    option: ["Mumbai", "Delhi", "Goa", "Assam"],
                    answer: "Delhi"
                },
                {
                    id: 2,
                    text: "Chief minister of Maharashtra is _________?",
                    option: ["Narendra Modi", "Yogi Adityanath", "Devendra Fadnavis", "Uddhav Thackeray"],
                    answer: "Uddhav Thackeray"
                },
                {
                    id: 3,
                    text: "The first-ever Floating Basketball Court of India is installed in ________?",
                    option: ["Kochi", "Puducherry", "Diu", "Mumbai"],
                    answer: "Mumbai"
                },
                {
                    id: 4,
                    text: "Financial Capital of India is ________?",
                    option: ["Mumbai", "Delhi", "Goa", "Assam"],
                    answer: "Mumbai"
                },
                {
                    id: 5,
                    text: "Which one is the first search engine in internet?",
                    option: ["Google", "Internet Explorer", "Archie", "Altavista"],
                    answer: "Archie"
                }
            ]

function start(e){
	this.remove();
	getQuestions();    
}

 

 function getQuestions(e){
 	var questionElement = document.createElement("question");
 	questionElement.id = "question";
	var question = questions[count];
	count++;
	var questionIndex = document.createElement("h2");
	questionIndex.textContent = "Question "+currentQuestion+"/"+questions.length;
	questionElement.appendChild(questionIndex);
	var questionText = document.createElement("h2");
	questionText.textContent = question.id+"."+question.text;
    questionElement.appendChild(questionText);
   
    
    for(var i=0; i<question.option.length; i++){
	     var options = document.createElement("li");
	     var text = document.createTextNode(question.option[i]);
	     inputElement = document.createElement("input");
	     inputElement.setAttribute("type","radio");
	     inputElement.setAttribute("name",question.id);
	     inputElement.onclick = function(){
	     	checkAnswer(this.parentElement.textContent,question.answer);
	     }
	     var btn = document.createElement("Button");
	     btn.innerHTML = "Next";
	     btn.addEventListener("click",getStatus,false);


	     
	     options.appendChild(inputElement);
	     options.appendChild(text);
	     questionElement.appendChild(options);

     
     
  	}
  questionElement.appendChild(btn);  
  document.body.appendChild(questionElement);
 }




function checkAnswer(markOption,correctOption){
	if(markOption === correctOption)
		correctAnswers++;

	optionMark = true;	
}

function getStatus(){
 	
 	
 	if(optionMark == true){ 
	 	var questionElement = document.querySelector("#question");
	 	questionElement.remove();
	 	currentQuestion++
	 	if(currentQuestion <= questions.length){
	 		
	 		getQuestions();
	 	}
	 	else 
	 		getResult();
		}
	else{
		alert("Please mark the option");
	}

 	}

function getResult(e){
	var score = document.createElement("h2");
	score.textContent = "Score = " + correctAnswers;
	document.body.appendChild(score);
	var result = document.createElement("h2");
	

	if(correctAnswers<3){
		result.textContent = "Result = Failed";
	}
	else
		result.textContent="Result = Passed";

	document.body.appendChild(result);
}