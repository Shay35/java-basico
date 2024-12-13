# Projeto ContaBanco

## Descrição
Este projeto consiste em um programa simples desenvolvido em Java que simula a criação de uma conta bancária. Ele solicita informações do usuário via terminal e exibe uma mensagem de confirmação contendo os dados inseridos.

## Funcionalidades
1. Solicitação de dados do usuário:
   - Número da conta (inteiro)
   - Agência (texto)
   - Nome do cliente (texto)
   - Saldo inicial (decimal)

2. Exibição de uma mensagem personalizada confirmando a criação da conta, com os seguintes detalhes:
   - Nome do cliente
   - Agência
   - Número da conta
   - Saldo inicial formatado com duas casas decimais

## Como Executar
### Pré-requisitos
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) instalado na máquina.
- Um editor de texto ou IDE para compilar e executar o programa, como [VSCode](https://code.visualstudio.com/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/).

### Passos
1. Clone este repositório ou copie o código do arquivo `ContaTerminal.java`.
2. Abra o arquivo em seu editor de texto ou IDE.
3. Compile o código usando o comando:
   ```bash
   javac ContaTerminal.java
   ```
4. Execute o programa com o comando:
   ```bash
   java ContaTerminal
   ```
5. Insira as informações solicitadas pelo terminal.
6. Veja a mensagem de confirmação com os dados da conta bancária.

## Estrutura do Código
- **Scanner:** Utilizado para receber entradas do usuário via terminal.
- **Formatação:** A exibição do saldo utiliza `String.format` para garantir que ele tenha duas casas decimais.
- **Mensagens Dinâmicas:** Personalização de mensagens com base nos dados fornecidos pelo usuário.

## Exemplo de Uso
### Entrada
```
Por favor, digite o número da conta:
1021
Por favor, digite o número da agência:
067-8
Por favor, digite o nome do cliente:
Mario Andrade
Por favor, digite o saldo inicial:
237.48
```

### Saída
```
Olá Mario Andrade, obrigado por criar uma conta em nosso banco. Sua agência é 067-8, conta 1021 e seu saldo de 237.48 já está disponível para saque.
```

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias.



