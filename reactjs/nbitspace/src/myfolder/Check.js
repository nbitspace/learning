import React, { useEffect, useState } from 'react';
import ReactDOM from 'react-dom';
import TextField from '@mui/material/TextField';
import Autocomplete from '@mui/material/Autocomplete';
import { Button } from '@mui/material';
import SendIcon from '@mui/icons-material/Send'
import AddShoppingCartIcon from '@mui/icons-material/AddShoppingCart';
import Avatar from '@mui/material/Avatar';
import Stack from '@mui/material/Stack';
import Alert from '@mui/material/Alert';

function Check(props) {
    const namesOfAttendees = [
        { label: 'Venkadesh', year: 1994 },
        { label: 'Akash', year: 1972 },
        { label: 'Sathiya Priya', year: 1974 }
    ]
    const names = [
        { label: 'Venkadesh', year: 1994 },
        { label: 'Akash', year: 1972 },
        { label: 'Sathiya Priya', year: 1974 }
    ]
    const age = 25
    return (
        <div id="check">
            <Autocomplete
            disablePortal
            id="namesofattendees"
            options={names}
            sx={{  }}
            renderInput={(params) => <TextField {...params} label="Name of attendees" />}
            />
            <br/>
            <center><Button 
            variant="outlined" 
            size="large" 
            endIcon={<AddShoppingCartIcon />}
            >My Button
            </Button>
            <Avatar alt="Remy Sharp" src="logo512.png" />
            <Alert
             onClose={() => {}}
             >This is a success alert — check it out!</Alert>
            
            </center>
        </div>
    )
}

export default Check