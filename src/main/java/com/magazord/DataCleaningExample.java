package com.magazord;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions;

public class DataCleaningExample {
    public static void main(String[] args) {
        // Cria a sessão Spark
        SparkSession spark = SparkSession.builder()
            .appName("Data Cleaning Example")
            .master("local[*]")  // Usar todos os núcleos do processador local
            .getOrCreate();

        // Carrega os dados em um DataFrame
        Dataset<Row> df = spark.read().option("header", "true")
            .csv("etl-pipeline/src/main/resources/clientes_transacoes.csv"); // Altere o caminho para o seu arquivo

        // Exibe as primeiras linhas do DataFrame
        df.show();

        // Limpeza de Dados: Remover linhas com valores nulos
        Dataset<Row> dfNoNulls = df.na().drop();

        // Limpeza de Dados: Remover duplicatas
        Dataset<Row> dfNoDuplicates = dfNoNulls.dropDuplicates();

        // Exemplo de transformação: Alterar valores de uma coluna (por exemplo, converter uma string para minúscula)
        Dataset<Row> dfTransformed = dfNoDuplicates.withColumn("column_name", functions.lower(dfNoDuplicates.col("column_name")));

        // Exibe o DataFrame após limpeza e transformação
        dfTransformed.show();

        // Salvar o DataFrame limpo em um novo arquivo CSV
        dfTransformed.write().option("header", "true").csv("caminho/para/salvar/arquivo_limpo.csv");

        // Encerra a sessão do Spark
        spark.stop();
    }
}
