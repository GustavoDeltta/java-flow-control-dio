import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int firstParam = console.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int secondParam = console.nextInt();
        try{
            count(firstParam, secondParam);
        }catch(InvalidParametersException e){
            System.out.println(e.getMessage());
        }
        console.close();
    }

    static void count(int firstParam, int secondParam) throws InvalidParametersException{
        if(firstParam > secondParam){
            throw new InvalidParametersException();
        }
        int count = secondParam - firstParam;
        for(int i = 1; i <= count; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
