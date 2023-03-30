package org.example;

import java.util.List;

public class Inscripcion{

    private Alumno alumno = null;
    private Materia materia = null;

    public Inscripcion(Alumno alumno, Materia materia)
    {
        this.alumno = alumno;
        this.materia = materia;
    }
    public Boolean aprobada() {

        List<Materia> correlativas = materia.correlativas();
        List<Materia> aprobadas = alumno.aprobadas();

        return aprobadas.containsAll(correlativas);
    }
}