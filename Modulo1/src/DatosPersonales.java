public class DatosPersonales {
    public static void main(String[] args) {
        String[][] compañeros = {
            {"Carlos", "Vásquez", "Ingeniería Civil", "Secretaría de Obras Públicas"},
            {"Ana", "Martínez", "Computación", "Desarrollos IT"},
            {"José", "Mejía", "Medicina", "Hospital Escuela"},
            {"Sofía", "Rivera", "Derecho", "Bufete Legal Rivera"},
            {"Luis", "García", "Administración de Empresas", "Banco Atlántida"}
        };

        for (int i = 0; i < compañeros.length; i++) {
            System.out.println("Nombre: " + compañeros[i][0]);
            System.out.println("Apellido: " + compañeros[i][1]);
            System.out.println("Carrera: " + compañeros[i][2]);
            System.out.println("Lugar de trabajo: " + compañeros[i][3]);
            System.out.println();
        }
    }
}
