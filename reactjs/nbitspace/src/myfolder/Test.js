import React, { useEffect, useState } from 'react';
import ReactDOM from 'react-dom';
import Check from './Check';
import { experimentalStyled as styled } from '@mui/material/styles';
import Box from '@mui/material/Box';
import Paper from '@mui/material/Paper';
import Grid from '@mui/material/Grid';
import { Button } from '@mui/material';

function Test(props) {
    //var myName = "Nilan"
    //var number = 4+10;
    const [num, setNumber] = useState(4 + 10)

    //myName = (myName != "Nila" )? "Not Nila" : "Nila";
    // var element = <div>Oh Maria</div>;
    // var elem = ReactDOM.createRoot(document.getElementById('dummy'));
    // elem.render(<Test />);
    
    const handleChange = event => setNumber(parseInt(event.target.value))


    const handleChange4 = (event) => setNumber(parseInt(event.target.value))

    const handleChange1 = (event) => {
        setNumber(parseInt(event.target.value))
    }

    const handleChange2 = function (event) {
        setNumber(parseInt(event.target.value))
    }

    function handleChange3 (event) {
        setNumber(parseInt(event.target.value))
    }

    
    return (
        <div className="Test">
           
            
            HI {props.myName}, we are in Nbit Space #{num + 6}. 
            Your name is {(props.myName !== "Nila" )? "Not Nila" : "Nila"}.
            
            <input type='text' name='name1' onChange={handleChange}/>
            
            Hi my age is {props.myAge}.
            <div>
                <a href={props.link}>{props.linkName}</a> 
            <br/><br/>
            <center><Check /> </center>
            <br/>
            </div>
     
        </div>
    );
}

export function Tt() {
    const [x, setX] = useState('Revision Class 2');
    const [y, setY] = useState(0);

    function showTimestamp(event) {
        let d = Date.now();
        setX(d);
        setY(parseInt(d/1000));
        console.log("func");
    }

    return (
        <React.Fragment>
            <div className="tt">{y}</div>
            <div >{x}</div>
            <Button onClick={showTimestamp}>Current Timestamp</Button>
            <br/>
        </React.Fragment>
    );
}

export default Test;