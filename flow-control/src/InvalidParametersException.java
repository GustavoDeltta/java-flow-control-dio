public class InvalidParametersException extends Exception {

    // Construtor padrão com uma mensagem simples que descreve o erro.
    public InvalidParametersException() {
        super("Erro: o primeiro parâmetro informado é maior que o segundo.");
    }
    
    /* // Construtor que permite incluir os valores que estão sendo análisados na mensagem
    public InvalidParametersException(int firstParam, int secondParam) {
        super("Erro: o primeiro parâmetro (" + firstParam + ") é maior que o segundo (" + secondParam + ").");
    }

    // Construtor que permite encadear exceções, útil para debug, pois mostra minha mensagem personalizada e também a exception original em seguida.
    public InvalidParametersException(int firstParam, int secondParam, Throwable cause) {
        super("Erro: o primeiro parâmetro (" + firstParam + ") é maior que o segundo (" + secondParam + ").", cause);
    } */
}
