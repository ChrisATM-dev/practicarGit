public class OperacionesBasicas {

    // Francisca
    public static Integer suma(int a, int b){
        return a + b;
    }

    public static Integer resta(int a, int b){
        return a - b;
    }
    // aaaaaaaaaaaaaaaa
    // aaaaaaaaaaaaaaaa
    // aaaaaaaaaaaaaaaa
    // aaaaaaaaaaaaaaaa
    // aaaaaaaaaaaaaaaa
    // aaaaaaaaaaaaaaaa
    // aaaaaaaaaaaaaaaa
    // Christian
    public static Integer multiplicacion(int a, int b){
        return a * b;
    }

    public static Double division(int a, int b) throws Exception{
        if (b == 0){
            throw new Exception("No se puede dividir por 0");
        }else{
            double resultado = a/b;
            return resultado;
        }
    }
}
