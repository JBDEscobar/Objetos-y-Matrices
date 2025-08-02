
public class Main {
    public static void main(String[] args) {
         
        // Datos de estudiantes
        String estudiantes[][] = {
            {"Carlos", "20", "2001", "Inteligencia Artificial"},
            {"Lucía", "19", "2002", "Bioinformática"},
            {"Diego", "21", "2003", "Ciberseguridad"},
            {"Elena", "22", "2004", "Blockchain"},
            {"Mateo", "18", "2005", "Realidad Virtual"},
            {"Valentina", "23", "2006", "Nanotecnología"},
            {"Andrés", "17", "2007", "Data Science"},
            {"Renata", "24", "2008", "Cloud Computing"},
            {"Jorge", "16", "2009", "IoT"},
            {"Mariana", "25", "2010", "Machine Learning"}
        };
        
       
        for (int indice = 0; indice < estudiantes.length; indice++) {
            int edadEstudiante = Integer.parseInt(estudiantes[indice][1]);
            int codigoEstudiante = Integer.parseInt(estudiantes[indice][2]);

            Estudiante nuevoEstudiante = new Estudiante(
                estudiantes[indice][0], 
                edadEstudiante,
                codigoEstudiante,
                estudiantes[indice][3]
            );
            
            nuevoEstudiante.presentarse();
        }
    }
}