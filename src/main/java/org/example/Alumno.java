package org.example;

import java.util.List;

public class Alumno {

    private List<Materia> aprobadas;

    public Alumno(List<Materia> aprobadas) {
        this.aprobadas = aprobadas;
    }

    public List<Materia> aprobadas()
    {
        return aprobadas;
    }
}
