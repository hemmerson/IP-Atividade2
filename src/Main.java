import java.util.Scanner;

/**
 * @author Hemmerson Luis Barros da Rosa
 * on date 22/02/2023
 */
public class Main {
    public static void main(String[] args) {

        byte vByte;
        short vShort;
        int vInt;
        long vLong;
        float vFloat;
        double vDouble;
        char vChar;

        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um valor do tipo byte: ");
        vByte = valor.nextByte();
        System.out.println("Digite um valor do tipo short: ");
        vShort = valor.nextShort();
        System.out.println("Digite um valor do tipo int: ");
        vInt = valor.nextInt();
        System.out.println("Digite um valor do tipo long: ");
        vLong = valor.nextLong();
        /**
         * o Locale está padrão pt-br então o valor float e double devem ser separados por ,(virgula)
         * senão deve ser separado por .(ponto)
         */
        System.out.println("Digite um valor do tipo float: ");
        vFloat = valor.nextFloat();
        System.out.println("Digite um valor do tipo double: ");
        vDouble = valor.nextDouble();
        System.out.println("Digite um valor do tipo char: ");
        vChar = valor.next().charAt(0);
        System.out.println("byte: "+vByte+"\n" +
                "short: "+vShort+"\n" +
                "int: "+vInt+"\n" +
                "long: "+vLong+"\n" +
                "float: "+vFloat+"\n" +
                "double: "+vDouble+"\n" +
                "char: '"+vChar+"'");

    }
}