import logo from './logo.svg';
import './App.css';
import Test, {Tt} from './myfolder/Test'
import { Container } from '@mui/material';
import Grid from '@mui/material/Grid';

function App() {
  return (
    <Container maxWidth="xl">
    <div className="App">
        <img src={logo} className="App-logo" alt="logo" />
        <div id='dummy'></div>
        <Grid container spacing={{ xs: 2, md: 3 }} columns={{ xs: 4, sm: 8, md: 12, lg: 12 }}>
          <Grid item xs={2} sm={4} md={4} lg={3} key={1}> 
            <Test myName="Nila" myAge='18' link ="https://engadget.com" linkName = 'Engadget'/>
            <Tt />
          </Grid>
          <Grid item xs={2} sm={4} md={4} lg={3} key={1}>
            <Test 
            myName="Nilan" 
            myAge='20'
            link ="https://google.com" 
            linkName = 'Google'
            />
          </Grid>
          <Grid item xs={2} sm={4} md={4} lg={3} key={1}>
            <Test myName="Venkadesh" myAge='21' link ="https://openai.com" linkName = 'Open AI' />
          </Grid>
          <Grid item xs={2} sm={4} md={4} lg={3} key={1}>
            <Test myName="Akash" myAge='20' link ="https://fb.com" linkName = 'FB'/>
          </Grid>
        </Grid>
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
    </div>
    </Container>

  );
}

export default App;
