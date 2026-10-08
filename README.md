# Sistema de Biblioteca em Java

Projeto de um sistema de biblioteca feito em Java, com menu no terminal. Esta é a **parte 1**: a base do sistema, com as classes principais e o menu de opções.

## Status

Em desenvolvimento. A parte 1 está pronta e a próxima etapa é a implementação do back-end com banco de dados.

## O que a parte 1 contém

- Classe `Livro`, com os atributos e os métodos que representam um livro.
- Classe `Usuario`, com os atributos e os métodos que representam um usuário.
- Classe `Main`, com um menu no terminal feito com `switch case`, que chama as funções do sistema.
- Classe `Biblioteca`, na camada de serviço, que concentra as regras do sistema.

## Estrutura do projeto

- `src/main`: classe `Main`, com o menu
- `src/model`: classes `Livro` e `Usuario`
- `src/service`: classe `Biblioteca`

## Próximos passos

- Implementar o back-end com **Spring Boot**
- Conectar o sistema a um **banco de dados**

## Como executar

1. Abra o projeto no IntelliJ IDEA.
2. Execute a classe `Main`.
3. Use o menu no terminal digitando o número da opção desejada.

## Autor

Fred Ferreira Castro, estudante de Sistemas de Informação na UFU.