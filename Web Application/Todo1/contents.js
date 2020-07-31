var lists = [];
var buttons = [];
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
		var button = document.createElement("BUTTON");
		var close = document.createTextNode("X");
		button.appendChild(close);
		button.onmousedown = function(){
			remove(i)
		};
		buttons.push(button);
		cell.innerHTML = lists[i];
		cell.appendChild(buttons[i]);
	}
}
		  	
function remove(item){
	var check = confirm("Confirm Delete?");
	if(check == true){
		lists.splice(item-1,1);
		buttons.splice(item,1);
		display();
	}
}

function removeAll(){
	document.querySelector("#table").innerHTML="";
}