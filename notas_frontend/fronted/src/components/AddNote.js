import React, { useState } from 'react';
import axios from 'axios';

const AddNote = () => {
  const [note, setNote] = useState({ studentId: '', activities: 0, firstPartial: 0, secondPartial: 0, finalExam: 0 });

  const handleChange = (e) => {
    setNote({ ...note, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    await axios.post('/api/notes', note);
  };

  return (
    <form onSubmit={handleSubmit}>
      {/* Inputs for each field */}
      <input type="number" name="studentId" placeholder="ID del Estudiante" onChange={handleChange} />
      <input type="number" name="activities" placeholder="Actividades" onChange={handleChange} />
      <input type="number" name="firstPartial" placeholder="Primer Parcial" onChange={handleChange} />
      <input type="number" name="secondPartial" placeholder="Segundo Parcial" onChange={handleChange} />
      <input type="number" name="finalExam" placeholder="Examen Final" onChange={handleChange} />
      <button type="submit">Agregar Nota</button>
    </form>
  );
};

export default AddNote;