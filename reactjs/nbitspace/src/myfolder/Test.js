import React, { useEffect, useState } from 'react';
import ReactDOM from 'react-dom';

function Test() {
    var myName = "Nilan"
    //var number = 4+10;
    var something = 0
    const [number, setNumber] = useState(4 + 10)

    //myName = (myName != "Nila" )? "Not Nila" : "Nila";
    // var element = <div>Oh Maria</div>;
    // var elem = ReactDOM.createRoot(document.getElementById('dummy'));
    // elem.render(<Test />);
    
    const handleChange = (event) => setNumber(parseInt(event.target.value))
    
    return (
        <div className="Test">
            HI {myName}, we are in Nbit Space #{number + 6}. Your name is {(myName !== "Nila" )? "Not Nila" : "Nila"}.
            <input type='text' name='val1' onChange={handleChange}/>
        </div>
    );
}

export function Tt() {
    return (
        <React.Fragment>
            <div>Revision Class 1</div>
            <div>Revision class 2</div>
        </React.Fragment>
    );
}

export default Test;