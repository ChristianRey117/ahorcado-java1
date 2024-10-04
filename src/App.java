import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String palabra_secreta = "inteligencia";
        int intentos_maximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        char[] letrasAdivinadas = new char[palabra_secreta.length()];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentos_maximos) {
            
            System.out.println("Palabra a adivinar " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra, porfavor");

            char letra = scanner.next().charAt(0);

            boolean letraCorrecta = false;
            boolean letrasCompletas = false;

            for(int i = 0; i < palabra_secreta.length(); i++){
                if(letra == palabra_secreta.charAt(i)){
                    letraCorrecta = true;
                    letrasAdivinadas[i] = letra;
                }

                if(letrasAdivinadas[i] != '_'){
                    letrasCompletas = true;
                }else{
                    letrasCompletas = false;
                }
            }

           palabraAdivinada = letrasCompletas;

            if(letraCorrecta){
                System.out.println("Letra correcta");
                System.out.println(letrasAdivinadas);
                
            }else{
                System.out.println("Letra incorrecta");
                intentos++;
            }

        }

        if(palabraAdivinada){
            System.out.println("Felicidades adivinaste la palabra");
        }else{
            System.out.println("No pudiste adivinar la palabra");
        }


    }
}
