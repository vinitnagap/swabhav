var tasks = [];
var completedCount = 0;
var notCompletedCount = 0;

showTask();

function add(){
		var li = document.createElement("li");	
		var text = document.querySelector("#InputBox").value;
		var t = document.createTextNode(text);
		li.appendChild(t);
		if(text === ''){
			alert("Enter Task")
		}
		else{
			const key = text;
			const value ="notcompleted";
			localStorage.setItem(key,value);

			document.querySelector("#NotCompletedElements").appendChild(li);
			tasks.push(text)
			
			document.querySelector("#InputBox").value="";
			
			document.querySelector("#NotCompletedElements").appendChild(li);
		    var checkbtn = document.createElement("INPUT");
		    checkbtn.setAttribute("type", "checkbox");
		    checkbtn.className = "check";
			checkbtn.id = "check";
		    checkbtn.addEventListener("change",changeCompletedElement);
		    li.appendChild(checkbtn);  
		    var i = document.querySelector("#NotCompletedElementsHeader");
			
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

	var completed = document.querySelector("#CompletedElementHeader");
	var notCompleted = document.querySelector("#NotCompletedElementsHeader");
	completedCount++;
	notCompletedCount--;
	completed.textContent = "Completed " + completedCount;
    notCompleted.textContent = "Not Completed " + notCompletedCount;
    
    var key = element.firstChild.textContent;
	var value = "completed";
	localStorage.setItem(key,value);
}

function changeNotCompletedElement(){
	var element = this.parentElement;
	var check = element.lastChild;
	check.removeEventListener("change",changeNotCompletedElement);
	check.addEventListener("change",changeCompletedElement);
	document.querySelector("#NotCompletedElements").appendChild(element);

	var notCompleted = document.querySelector("#NotCompletedElementsHeader");
	var completed = document.querySelector("#CompletedElementHeader");
	notCompletedCount++;
	completedCount--;
	notCompleted.textContent = "Not Completed " +notCompletedCount;
    completed.textContent = "Completed "+completedCount;
    
    var key = element.firstChild.textContent;
	var value = "notcompleted";
	localStorage.setItem(key,value);
}

function showTask(){
	for(var i=0;i<localStorage.length;i++){
		const key = localStorage.key(i);
		const value = localStorage.getItem(key);
		var li = document.createElement("li");
		var t = document.createTextNode(key);
		li.appendChild(t);
			
		var checkbtn = document.createElement("INPUT");
		checkbtn.setAttribute("type", "checkbox");
		checkbtn.className = "check";
		checkbtn.id = "check";

		li.appendChild(checkbtn);  
		if(value === "completed"){
			checkbtn.checked = true;
			completedCount++;
			var completed = document.querySelector("#CompletedElementHeader");
			completed.textContent = "Completed "+completedCount;
			document.querySelector("#CompletedElement").appendChild(li);
			checkbtn.addEventListener("change",changeNotCompletedElement);
		}
		if(value === "notcompleted"){
			notCompletedCount ++;
			var notCompleted = document.querySelector("#NotCompletedElementsHeader");
			notCompleted.textContent = "Not Completed "+notCompletedCount;
			document.querySelector("#NotCompletedElements").appendChild(li);
			checkbtn.addEventListener("change",changeCompletedElement);
		}
		

	}
}
