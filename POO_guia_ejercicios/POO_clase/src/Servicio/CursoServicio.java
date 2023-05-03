package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class CursoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso curso = new Curso();

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        leer.nextLine();
        System.out.println("Procediendo a cargar los nombres de los alumnos del curso");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre de alumno numero " + (i + 1));
            alumnos[i] = leer.nextLine();
        }
        return alumnos;
    }

    public Curso crearCurso(Curso curso) {
        System.out.println("Ingrese nombre de curso");
        curso.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese cantidad de horas por dia");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese cantidad de dias por semana donde se hace un encuentro");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        leer.nextLine();
        System.out.println("Inserte turno (m para MAÑANA - t para TARDE)");
        curso.setTurno(leer.nextLine());
        while (!curso.getTurno().equalsIgnoreCase("m") && !curso.getTurno().equalsIgnoreCase("t")) {
            System.out.println("Ingreso invalido, recuerde que los turnos son (m para MAÑANA - t para TARDE) ");
            System.out.println("Inserte turno (m para MAÑANA - t para TARDE)");
            curso.setTurno(leer.nextLine());
        }
        if (curso.getTurno().equalsIgnoreCase("m")) {
            curso.setTurno("Mañana");
        } else {
            curso.setTurno("Tarde");
        }
        System.out.println("Inserte precio por hora");
        curso.setPrecioPorHora(leer.nextDouble());
        curso.setAlumnos(cargarAlumnos());
        return curso;
    }

    public double calcularGananciaSemanal(Curso curso) {

        return ((curso.getPrecioPorHora() * curso.getCantidadHorasPorDia()) * curso.getCantidadDiasPorSemana()) * 5;
    }
}
