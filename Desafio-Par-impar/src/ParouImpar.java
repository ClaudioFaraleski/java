public class ParouImpar {

    public static int condicao(int numero){

        int condicao = numero % 2;

        return condicao;
       
    }
    public static void main(String[] args) throws Exception {


        int numero = 5;

        String resultado = condicao(numero) == 0 ? "Par":"impar";

        System.out.println("o Numero digitado Foi : " +  numero + ", Portanto ele e  " + resultado);
 
    }
}
