//script1.js
"use strict";
globalNum1 = 4;
var globalNum2 = 5;
let globalNum3 = 6;

function checkerClicked() {
	var aElem = document.getElementById("checker_id");
	var a = aElem.value;
	let resultElement = document.getElementById("result");
	resultElement.innerHTML = "DUMMY";
	//setEg(a, resultElement);
	//mapEg(a, resultElement);
	//greatestOf3Numbers(a, resultElement);
	//regExpEg(a, resultElement);
	//errHandlingEg(a, resultElement);
	scopeEg(aElem, resultElement);
}

tempFuncScope = () => { console.log(num);};

scopeEg = (aElem, r) => {
	a = aElem.value;
	printVal(r, a);
	
	if(isNaN(a) || true) {
		var num = 10;
		var num = 10;//no error
		
		num2 = 20;
		//let num2 = 20;//error - already declared
		var num2 = 20;
		
		let num3 = 30;
		//var num3 = 30;//error - can't declare a variable already declared with let
		num3 = 30;
		
		const num4 = 40;
		//let num4 = 40;//error - redeclaration
		//num4 = 50;//error - can't change a constant
		
		//tempFuncScope();//error in function - num is out of scope
	}
	aElem.value = num;
	printVal(r, num2);
	//printVal(r, num3); // block scope - error
	//printVal(r, num4); // block scope - error
	printVal(r, globalNum1);
	printVal(r, globalNum2);
	printVal(r, globalNum3);
};

errHandlingEg = (val, res) => {
	try {
		let st = 7 + s;
		printVal(res, st);
		printVal(res, "No Error!");
	} catch(err) {
		try {
			5+s;
		} catch (e) {
			//5+s; not caught.
			console.log(e);
			printVal(res, "Inner Error Occurred!");
		}
		console.log(err);
		printVal(res, "Error Occurred!");
	} finally {
		printVal(res, "Finally of Error Occurred!");
	}
	
	
	try {
		eval("alert('This is an alert);");
	} catch (err) {
		console.log(err);
		printVal(res, "Syntax Error Occurred!");
	}
	
	try {
		if(isNaN(val)) {
			throw "This is not a number";
			let num = 10;
		} else {
			printVal(res, "You have given a number");
		}
		printVal(res, num);
	} catch (e) {
		console.log(e);
		printVal(res, "<span style='color:red'>This is not a number</span>");
	}
	
	try {
		printVal(res, "Bye All!");
	} finally {
		printVal(res, "Finally of no Error!");
	}
};

regExpEg = (val, res) => {
	let r = val.replace(/[0123456789]*[0-9](th|st|rd|nd)/ig, "[n-th]");
	printVal(res, r);
};

printVal = function(res, str) {
	res.innerHTML += "<br>" + str;
}

greatestOf3Numbers = (val, res) => {
	let [x, y, z] = val.split(",");
	x = Number(x);
	y = Number(y);
	z = Number(z);
	printVal(res, "The greatest number:");
	/*
	if (x > y) {
		if (x > z) {
			printVal(res, x);
		} else {
			printVal(res, z);
		}
	
	} else {
		if (y > z) {
			printVal(res, y);
		} else {
			printVal(res, z);
		}
	}*/
	if(x > y && x > z) {
		printVal(res, x);
	}
	else if(y > x && y > z) {
		printVal(res, y);
	}
	else {
		printVal(res, z);
	}
	
	
}

mapEg = (val, res) => {
	printVal(res, "Map Eg:");
	let m;
	if(val == "") {
		m = new Map([
			["name", "PC"],
			["age", 25],
			["sub", "iPhone"]
		]);
	} else {
		m = new Map([]);
		let x = val.split(',');
		x.forEach((v,i,y)=> {
			let mapVal = v.split(":");
			m.set(mapVal[0], mapVal[1]);
		});
	}
	m.set("dummy", "value");
	m.set("chuma", "value");
	
	for(let i of m.entries()) {
		printVal(res, i);
	}
	printVal(res, "Map Type: " + typeof m);
	printVal(res, "Map Size: " + m.size);
	printVal(res, "Map Has dummy: " + m.has("dummy"));
	m.delete("chuma");
	printVal(res, "Map Has chuma: " + m.has("chuma"));
	
};

setEg = function(val, res) {
	let s;
	if(val == "") {
		s = new Set(["apple", "orange", "banana", "orange", "Orange"]);
	} else {
		let arr = val.split(",");
		s = new Set(arr);
	}
	s.add('always present');
	console.log(s);
	printVal(res, "type: " + typeof s);
	for(let i of s.values()) {
		printVal(res, `${i}`);
	}
};


