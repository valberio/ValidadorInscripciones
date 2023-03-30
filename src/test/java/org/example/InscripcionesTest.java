package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class InscripcionesTest {

    @Test
    public void inscripcionValida()
    {
        Materia discreta = new Materia("discreta", Collections.emptyList());
        Materia syo = new Materia("syo", Collections.emptyList());
        Materia ads = new Materia("ads", new ArrayList<>(Arrays.asList(discreta, syo)));

        Alumno alumno = new Alumno(new ArrayList<>(Arrays.asList(discreta, syo)));

        Inscripcion inscripcion = new Inscripcion(alumno, ads);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionInvalida()
    {
        Materia discreta = new Materia("discreta", Collections.emptyList());
        Materia syo = new Materia("syo", Collections.emptyList());
        Materia ads = new Materia("ads", new ArrayList<>(Arrays.asList(discreta, syo)));

        Alumno alumno = new Alumno(new ArrayList<>(List.of(discreta)));

        Inscripcion inscripcion = new Inscripcion(alumno, ads);

        Assertions.assertFalse(inscripcion.aprobada());
    }

    @Test
    public void inscripcionMateriaSinCorrelativas()
    {
        Materia discreta = new Materia("discreta", Collections.emptyList());
        Materia syo = new Materia("syo", Collections.emptyList());
        Materia ads = new Materia("ads", new ArrayList<>(Arrays.asList(discreta, syo)));

        Alumno alumno = new Alumno(new ArrayList<>(List.of(discreta)));

        Inscripcion inscripcion = new Inscripcion(alumno, syo);

        Assertions.assertTrue(inscripcion.aprobada());
    }
}
