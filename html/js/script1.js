//script1.js

function checkerClicked() {
	let a = document.getElementById("checker_id").value;
	let resultElement = document.getElementById("result");
	resultElement.innerHTML = "DUMMY";
	//setEg(a, resultElement);
	//mapEg(a, resultElement);
	//greatestOf3Numbers(a, resultElement);
	//regExpEg(a, resultElement);
	errHandlingEg(a, resultElement);
}

errHandlingEg = (val, res) => {
	try {
		let st = 7 + s;
		printVal(res, st);
		printVal(res, "No Error!");
	} catch(err) {
		try {
			5+s;
		} catch (err) {
			//5+s; not caught.
			console.log(err);
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
		printVal(res, "Inner Error Occurred!");
	}
	
	try {
		printVal(res, "isNaN =" + isNaN(val));
		isNaN()
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


