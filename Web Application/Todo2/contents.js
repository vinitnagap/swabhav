var lists = [];
//var buttons = [];
var checkboxes = [];
var i;
		
function add() {
	var inputValue = document.querySelector("#myInput").value;
	if(inputValue == ""){
		alert("Enter Task");
	}
	else{
		lists.push(inputValue);
		document.querySelector("#myInput").value = "";
		display();
		}
	}

function display(){
	var table = document.querySelector("#table");
	removeAll();
	for(i=0; i<lists.length ;i++){
		var row = table.insertRow();
		var cell = row.insertCell();
		var checkboxElement = document.createElement("INPUT");
		checkboxElement.type = "checkbox";
		//cell.appendChild(checkbox);
		//var button = document.createElement("BUTTON");
		//var close = document.createTextNode("X");
		//button.appendChild(close);
		//button.onmousedown = function(){
		//	remove(item)
		//};
		//buttons.push(button);
		checkboxes.push(checkboxElement);
		checkboxes.forEach(checkbox => checkbox.addEventListener("click",handleCheck));
		function handleCheck(e){
			console.log(e);
		}
		cell.innerHTML = lists[i];
		//cell.appendChild(buttons[i]);
		cell.appendChild(checkboxes[i]);
	}
}
		  	
/*function remove(item){
	var check = confirm("Confirm Delete?");
	if(check == true){
		lists.splice(item-1,1);
		buttons.splice(item,1);
		display();
	}
}*/

function removeAll(){
	document.querySelector("#table").innerHTML="";
}