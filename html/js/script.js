//script.js

function checkerClicked() {
	let a = document.getElementById("checker_id").value;
	let resultElement = document.getElementById("value");
	resultElement.innerHTML = "DUMMY";
	//ifCheck(a);
	//switchCheck(a);
	//whileCheck(a, resultElement);
	//doWhileCheck(a, resultElement);
	//forCheck(a, resultElement);
	breakContinueCheck(a, resultElement);
}

breakContinueCheck = function(val, res) {
	let i =0;
	while(true) {
		i++;
		if(i > val) break;
		if(i%2 == 0) {continue;}
		res.innerHTML += "<br>Looping: " + i;
	}
}

function whileCheck(val, res) {
	let i = 0;
	while(i < val) {
		res.innerHTML += "<br>Looping: " + i;
		i++;
	}
}

function doWhileCheck(val, res) {
	let i = 0;
	do {
		res.innerHTML += "<br>Looping: " + i;
		i++;
	} while(i < val);
}

function forCheck(val, res) {
	if(val != "") {
		for(let i = 0; i < val; i++) {
			res.innerHTML += "<br>Looping: " + i;
		}
	}
	
	let obj = {'name': "PC", age: 22, 'sub': "iPhone", "address": 600028};
	let k = Object.keys(obj);
	for(let i =0; i < k.length; i++) {
		res.innerHTML += "<br>" + k[i] + " = " +obj[k[i]];
	}
	
	res.innerHTML += "<br> for-in object:";
	for(let i in obj) {
		res.innerHTML += "<br>" + i + " = " +obj[i];
	}
	
	res.innerHTML += "<br> for-in array:";
	for(i in k) {
		res.innerHTML += "<br>" + i + " = " +k[i] + " = " + obj[k[i]];
	}
	
	res.innerHTML += "<br> forEach array:";
	k.forEach(function (value, index, array) {
		res.innerHTML += "<br>" + index + " = " + value + " = " + array;
	});
	
	res.innerHTML += "<br> for-of array:";
	for(let i of "looping string") {
		res.innerHTML += "<br>" + i;
	}
}


function switchCheck(a) {
	let elem = document.getElementById("value");
	let result = "Result: ";
	switch(a) {
		case "1":
			result += "The value is 1";
			break;
		case "Harry":
		case "Ron":
			result += "Ron ";
		case "Hermione":
			result += "Name given";
			break;
		default:
			result += "Unknown value";
	}
	elem.innerHTML = result;
	
}

function ifCheck(a) {
	if (a =="1") {
		console.log("Name is Harry");
	} 
	else if (a == "2") {
		console.log("Name is ron");
	} 
	else {
		console.log("Else of first group");
	}
	
	if (a == "3") {
		console.log("Name is hermione");
	}
	else {
		console.log("Name is not Harry");
	}
}


function promiseEg() {
let prom = new Promise(
	function(resolve, reject) {
	
	}
);
prom.then(
	function(val) {
		console.log(val);
	},
	function(err) {
		console.log(err);
	}
);
}



function displayFile(txt) {
	document.getElementById("value").innerHTML = txt;
}

function getFile(func1) {
	let request = new XMLHttpRequest();
	request.open('GET', "para.txt");
	request.setRequestHeader( 'Access-Control-Allow-Origin', '*');
	request.onload = function() {
		if(request.status == 200) {
			func1(this.responseText);
		} else {
			func1("Can't fetch file, " + request.status);
		}
	
	}
	request.send();
}

var students = [];

var htmlData = "";
//setInterval(displayNothing, 5000);
let p = new Promise(
function(resolve, reject) {
	//
	setTimeout(function() { resolve();}, 5000);
});

//p.then(displayNothing);

function displayNothing() {
	let dateNow = new Date();
	htmlData += "Nothing Added "
	 + dateNow.getHours()
	  + ":" + dateNow.getMinutes()
	  + ":" + dateNow.getSeconds() + "<br>";
	document.getElementById("message").innerHTML = htmlData;
}

class Person {
	constructor(name1, dob1) {
		this.name = name1;
		this.dob = dob1;
		this.age = 2022 - this.dob;
		//this.address = undefined;
	}
	
	get age_() {
		this.address = 600035; console.log(this.address);
		return this.age;
	}
	
	set age_(age1) {
		this.age = age1;
		this.dob = 2022 - age1;
	}
	
	
}


class Teacher extends Person {
	constructor(name1, dob1, sub1) {
		super(name1, dob1);
		this.sub = sub1;
	}
}

class Student extends Person {
	constructor(name1, dob1, std1) {
		super(name1, dob1);
		this.std = std1;
	}
	
	static addStudent() {
		let name2 = document.getElementById("name_id").value;
		let dob2 = document.getElementById("dob_id").value;
		let sub2 = document.getElementById("sub_id").value;
		
		let studentObj = new Student(name2, dob2, sub2);
		let age2 = document.getElementById("age_id").value;
		if(age2 != undefined && age2 != null && age2.length !== 0) {
			studentObj.age_ = age2;
		}
		console.log(studentObj.address);
		console.log(studentObj.dob);
		console.log(studentObj.age);
		students.push(studentObj);
		displayStudents(clearInputs);
	}
}

function clearInputs() {
	document.getElementById("name_id").value = "";
	document.getElementById("dob_id").value = "";
	document.getElementById("age_id").value = "";
	document.getElementById("sub_id").value = "";
}
function displayStudents(funcName) {
	let html = `
	<table>
	<tr>
		<td>name</td>
		<td>age</td>
		<td>sub</td>
	</tr>
	`
	for (let i=0; i < students.length; i = i + 1) {
		html += `<tr>
			<td> ${students[i].name}</td>
			<td>  ${students[i].age_} </td>`;
		html = html + "<td>" + students[i].std + "</td>";
		html = html + "</tr>";
	}
	html += "</table>";
	document.getElementById("students").innerHTML = html;
	setTimeout(funcName, 5000);
	
	setTimeout(function () {
		htmlData = "";
		document.getElementById("message").innerHTML = "Student Got Added 10 secs back";
	}, 10000);
}

function renderLine() {
	let htmlValue = `<h4>Rendering:</h4>`
	document.getElementById("value").innerHTML = `
	<h3>test text:</h3>
	${htmlValue}
	<p>content</p>`;
}


function detailsFunc(n = "aasthika", o = "priya") {
	const details = {
		name: "Naveena",
		age: 25.5,
		'address': 625518,  
		"movie name":   "Ponniyin Selvan",
		movie: {
			hero:
				["vikram", "ravi",{"name": "karthi" }, {'other': [
					"kamal",
					"aishwarya",
					"trisha"
					]
				}
				]
		}
	
	};
	details.name = "Vaishu";
	details.name = n;
	details.name2 = o;
	return details;
}

function changeColor()
{
	d = detailsFunc("riya");
	console.log(d);
	e = detailsFunc("Aara", "Lara");
	console.log(e);
	
			//alert("Chuma");
			//window.alert("Chuma window alert.");
			document.getElementById("para").style.color="wheat";
			console.log("Hi all! I am saying hi from console!");
			
			{
				var t2=15;
				t2=16;
				console.log(t2);
			}
			console.log(t2);
			
			{
				let t=1;
				t=2;
				console.log(t);
			}
			console.log(t);
			
			
			//window.print();
}
