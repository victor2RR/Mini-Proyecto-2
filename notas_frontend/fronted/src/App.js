import React from 'react';
import AddNote from './components/AddNote';
import DisplayNotes from './components/DisplayNotes';

function App() {
  return (
    <div className="App">
      <h1>Gestión de Notas</h1>
      <AddNote />
      <DisplayNotes />
    </div>
  );
}

export default App;