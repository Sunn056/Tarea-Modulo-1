public class ResultadosEstudiantes {
    public static void main(String[] args) {
        String[] nombres = {"Daniel", "Monica", "Edwin", "Laura", "Carlos"};
        int[] notas = {65, 89, 74, 55, 91};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Nota: " + notas[i]);
            
            if (notas[i] >= 70) {
                System.out.println("Resultado: Aprobado");
            } else {
                System.out.println("Resultado: Reprobado");
            }
            System.out.println(); 
        }
    }
}
