package condicionalifelse;

import java.util.Scanner;

public class Ex2CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Diigite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.printf("Digite o operador (+, -, *, /): ");
        String operador = sc.next();
        System.out.printf("Diigite o segundo número: ");
        double num2 = sc.nextDouble();
        int realizada = 0;
        double resultado = 0;
        if(operador.equals("/") && num2 == 0) {
            System.out.println("Erro: divisão por zero!");

        }
        else {
            if (operador.equals("+")) {
                resultado += num1 + num2;
            }
            else if (operador.equals("-")) {
                resultado += num1 - num2;
            }
            else if (operador.equals("*"))  {
                resultado += num1 * num2;
            }
             else if (operador.equals("/"))  {
                resultado += num1 / num2;
            }
            realizada +=1;
            System.out.println("resultado: " + resultado + "\nOperações realizadas: " + realizada);
        }
        
    sc.close();
        }
}
