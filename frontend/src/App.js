import './App.css';
import Home from './components/homepage/home';
import Nav from './components/navbar/nav';
import Services from './components/servicos/services';

function App() {
  return (
    <div className="App">
      <Home />
      <Nav />
      <Services />
    </div>
  );
}

export default App;
