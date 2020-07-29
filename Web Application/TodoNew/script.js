var tasks = [];
var completedCount = 0;
var notCompletedCount = 0;

function add(){
		var li = document.createElement("li");
		var text = document.querySelector("#InputBox").value;
		var t = document.createTextNode(text);
		li.appendChild(t);
		if(text === ''){
			alert("Enter Task")
		}
		else{
			document.querySelector("#UncompletedElements").appendChild(li);
			tasks.push(text)
			document.querySelector("#InputBox").value="";

		    var checkbtn = document.createElement("INPUT");
		    checkbtn.setAttribute("type", "checkbox");
		    checkbtn.className = "check";
		    checkbtn.id = "check";
		    checkbtn.addEventListener("change",changeCompletedElement);
		    li.appendChild(checkbtn);  
		    var i = document.querySelector("#UncompletedElementsHeader");
			
			notCompletedCount++;
			i.textContent = "Not Completed " +notCompletedCount;
				
		}
	
}

function changeCompletedElement(){
	var element = this.parentElement;
	var check = element.lastChild;
	check.removeEventListener("change",changeCompletedElement);
	check.addEventListener("change",changeNotCompletedElement);
	document.querySelector("#CompletedElement").appendChild(element);
	element.style.textDecoration = "line-through"

	var completed = document.querySelector("#CompletedElementHeader");
	var notCompleted = document.querySelector("#UncompletedElementsHeader");
	completedCount++;
	notCompletedCount--;
	completed.textContent = "Completed " + completedCount;
	notCompleted.textContent = "Not Completed " + notCompletedCount;
}

function changeNotCompletedElement(){
	var element = this.parentElement;
	var check = element.lastChild;
	check.removeEventListener("change",changeNotCompletedElement);
	check.addEventListener("change",changeCompletedElement);
	document.querySelector("#UncompletedElements").appendChild(element);
	element.style.textDecoration = "none"

	var notCompleted = document.querySelector("#UncompletedElementsHeader");
	var completed = document.querySelector("#CompletedElementHeader");
	notCompletedCount++;
	completedCount--;
	notCompleted.textContent = "Not Completed " +notCompletedCount;
	completed.textContent = "Completed "+completedCount;
}

