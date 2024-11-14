<h2>
  Intensivão JAVA SPRING - Gerenciador de Games
</h2>

## Tecnologias 

Este projeto foi desenvolvido com as seguintes tecnologias : 

- Java (21)
- Spring Boot
- JPA / Hibernate
- Maven
- Docker 

## Projeto

  Projeto foi desenvolvido durante o curso *__Intensivão Java Spring__* oferecida pela [DevSuperior](https://devsuperior.com.br). O projeto consiste em uma API Rest de Gerenciamento de Entregas de Jogos

## Diagrama de Classes
![dslist-model](https://github.com/user-attachments/assets/b6820bc0-4acb-41e2-93f9-4a17c2ab4352)

## :bookmark_tabs: Documentação da API

#### URL base

```https
  http://localhost:8080/dslist/
```


#### Obter Listagem dos Games Cadastrados

```https
  GET /games
```


#### Buscar Listagem dos Games Cadastrados Pelo Id

```https
  GET /games/{id}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id do Game |


#### Obter Listagem das Listas de Games Cadastrados

```https
  GET /lists
```


#### Buscar Listagem das Listas de Games Cadastrados Pelo Id da Lista

```https
  GET /lists/{id}/games
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |


#### Mudar a posição do Game dentro de uma Lista de Game

```https
  POST /lists/{id}/replacement
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |
| `body` | `ReplacementDTO` | **Obrigatório**. Informações da posição de origem e posição destino |
