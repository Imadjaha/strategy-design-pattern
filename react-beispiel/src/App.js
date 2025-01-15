import "./index.css";
import { useState } from "react";

const addStrategy = (a, b) => a + b;
const subtractStrategy = (a, b) => a - b;
const multiplyStrategy = (a, b) => a * b;

function App() {
  const [strategy, setStrategy] = useState(()=> addStrategy);
  const [result, setResult] = useState(0);
  const handleCalculation = (a, b) => {
    setResult(strategy(a, b));
  };

  return (
    <div className="app">
      <h1>Strategy Pattern in React</h1>
      <button onClick={() => setStrategy(() =>addStrategy)}>Add</button>
      <button onClick={() => setStrategy(() =>subtractStrategy)}>Subtract</button>
      <button onClick={() => setStrategy(() =>multiplyStrategy)}>Multiply</button>
      <div>
        <button onClick={() => handleCalculation(5, 3)}>Calculate 5 and 3</button>
      </div>
      <div>Result: {result}</div>
    </div>
  );
}

export default App;
