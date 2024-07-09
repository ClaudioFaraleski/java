public class OperadorTernario {

    public static void main(String[] args) {


        int numero = 99;
        int condicao = numero % 2;

        String resultado = condicao == 0 ? "Par" :"Impar";

        System.out.println(numero + " foi o  numero digitado então ele é " + resultado);
    }
    
}
