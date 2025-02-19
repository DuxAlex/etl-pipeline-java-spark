# ETL Pipeline com Apache Spark

Este é um projeto de pipeline de ETL (Extract, Transform, Load) usando Apache Spark e Java. O objetivo do projeto é realizar a limpeza de dados de um arquivo CSV e fazer transformações para um formato adequado para análise.

## Estrutura do Projeto

O projeto está estruturado da seguinte maneira:

```bash
.
├── pom.xml
├── readme.md
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── magazord
    │   │           ├── DataCleaningExample.java
    │   │           └── Main.java
    │   └── resources
    │       └── clientes_transacoes.csv
    └── test
        └── java

9 directories, 5 files
```

- **`src/main/java/com/magazord/`**: Contém os arquivos Java responsáveis pela lógica de ETL.
- **`src/main/resources`**: Contém os arquivos que serão processados pela ETL.
- **`target/`**: Diretório gerado pelo Maven contendo os artefatos de build (não versionado).
- **`pom.xml`**: Arquivo de configuração do Maven, que define as dependências do projeto.
- **`.gitignore`**: Arquivo que garante que arquivos desnecessários não sejam versionados.

## Como Rodar o Projeto

Para rodar o projeto, siga os passos abaixo:

### 1. Clone o repositório

Primeiro, clone o repositório para o seu ambiente local:

```bash
git clone https://github.com/duxalex/etl-pipeline-java-spark
```
```bash
cd etl-pipeline
```

## 2. Instale o Maven
Certifique-se de que o Maven está instalado no seu sistema. Caso não tenha o Maven instalado, siga as instruções de instalação aqui.

No Ubuntu, por exemplo, você pode instalar o Maven com o comando:

```bash
sudo apt install maven
```

## 3. Compile e instale o projeto
Execute o seguinte comando para compilar e instalar o projeto:

```bash
mvn clean install
```

## 4. Execute a aplicação
Após compilar o projeto, você pode executar a aplicação com o seguinte comando:

```bash
java -cp target/etl-pipeline-1.0-SNAPSHOT.jar com.magazord.DataCleaningExample
```

## Exemplo de Dados
Este projeto utiliza um arquivo CSV de exemplo com informações de vendas. O arquivo de entrada `clientes_transacoes.csv` tem a seguinte estrutura:

| id  | nome           | email                     | idade | cidade         | transacao_valor | transacao_data |
| --- | -------------- | ------------------------- | ----- | -------------- | --------------- | -------------- |
| 1   | Ana Silva      | ana.silva@email.com        | 28    | São Paulo     | 250.50          | 2025-01-01     |
| 2   | João Souza     | joao.souza@email.com       | 35    | Rio de Janeiro| 150.75          | 2025-01-02     |
| 3   | Maria Oliveira | maria.oliveira@email.com   | 22    | Belo Horizonte| 320.00          | 2025-01-03     |

## Contribuição

Se você quiser contribuir para este projeto, fique à vontade para abrir uma *issue* ou enviar um *pull request*. Para sugestões ou melhorias, sinta-se à vontade para abrir uma *issue*.

Projeto desenvolvido por [Alex Souza](https://github.com/DuxAlex).


### Explicações:

- **Estrutura do Projeto**: Esta seção descreve a organização dos arquivos dentro do repositório.
- **Como Rodar o Projeto**: Passos necessários para rodar o projeto localmente.
- **Exemplo de Dados**: Mostra o formato do arquivo CSV que é processado pelo código.
- **Contribuição**: Instruções básicas para contribuições futuras, como enviar *pull requests*.    