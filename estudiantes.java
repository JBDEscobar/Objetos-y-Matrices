public class estudiantes {
    String nombreCompleto;
    int años;
    int matricula;
    String especialidad;

    public Estudiante(String nombreCompleto, int años, int matricula, String especialidad) {
        this.nombreCompleto = nombreCompleto;
        this.años = años;
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public void presentarse() {
        System.out.println("Bienvenido(a) " + nombreCompleto +  ", estudiante de " + especialidad);
                         
    }
}