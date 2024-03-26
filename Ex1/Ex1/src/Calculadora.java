public class Calculadora {

    public static float adicao(float num1, float num2){
        return num1 + num2;   
    }

    public static float sub(float num1, float num2){
        return num1 - num2;   
    }

    public static float mult(float num1, float num2){
        return num1 * num2;   
    }

    public static float div(float num1, float num2){
        if(num1 == 0 || num2 == 0){
            System.out.println("Impossível dividir por 0");
            return 0;
        }
        return num1 / num2;   
    }


}