import React, { useEffect, useState } from 'react';
import axios from 'axios';

const DisplayNotes = () => {
  const [notes, setNotes] = useState([]);

  useEffect(() => {
    const fetchNotes = async () => {
      const result = await axios.get('/api/notes/1'); // Cambiar el ID según sea necesario.
      setNotes(result.data);
    };
    
    fetchNotes();
  }, []);

  return (
    <div>
      {notes.map(note => (
        <div key={note.id}>
          <p>ID Estudiante: {note.studentId}</p>
          <p>Actividades: {note.activities}</p>
          {/* Mostrar otros campos */}
        </div>
      ))}
    </div>
  );
};

export default DisplayNotes;