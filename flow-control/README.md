# Desafio: Flow Control 
Este desafio foi realizado com o objetivo de praticar o uso de controle de fluxo e exceções personalizadas em Java.

## 📌 Descrição do Desafio
O programa solicita ao usuário que insira dois parâmetros inteiros. Se o primeiro parâmetro for maior que o segundo, o sistema lança uma exceção personalizada. Caso contrário, o programa realiza uma contagem a partir do segundo parâmetro até o primeiro e imprime os números no console.

## 📋 Funcionalidades
- Solicita dois parâmetros inteiros ao usuário
- Lança uma exceção personalizada (InvalidParametersException) se o primeiro parâmetro for maior que o segundo
- Realiza uma contagem entre os parâmetros e imprime os números caso a exceção não seja lançada
- Exibe a mensagem de erro caso a exceção seja lançada, incluindo a causa do erro

## 📌 Exemplo de Saída

### Exemplo 1: Parâmetros válidos
```sh
Digite o primeiro parâmetro: 5
Digite o segundo parâmetro: 10

Imprimindo o número: 1
Imprimindo o número: 2
Imprimindo o número: 3
Imprimindo o número: 4
Imprimindo o número: 5
```
### Exemplo 2: Exceção lançada
```sh
Digite o primeiro parâmetro: 10
Digite o segundo parâmetro: 5

Erro: o primeiro parâmetro é maior que o segundo.
```

## 📜 Licença

Este projeto é de livre utilização para fins educacionais.

---

Feito por Gustavo Sousa.