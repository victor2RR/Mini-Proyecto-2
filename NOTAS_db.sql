CREATE DATABASE notes_db;

USE notes_db;

CREATE TABLE evaluations (
  id INT AUTO_INCREMENT PRIMARY KEY,
  student_id BIGINT NOT NULL,
  activities INT CHECK (activities <= 35),
  first_partial INT CHECK (first_partial <= 15),
  second_partial INT CHECK (second_partial <= 15),
  final_exam INT CHECK (final_exam <= 35)
);
SELECT * FROM evaluations;

/* BIGINT es un tipo de dato que se utiliza para almacenar números enteros grandes, 
estamos asegurándonos de que la columna pueda asignar un valor único a una cantidad 
muy grande de filas, esto lo pueden usar para proyectos grandes.
*/