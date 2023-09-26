/*
Descrição

Neste desafio, você deve criar um programa em Java para realizar o monitoramento e análise de logs gerados na infraestrutura da AWS (Amazon Web Services). O programa receberá informações de eventos de diferentes serviços da AWS e realizará uma análise simples desses logs.
Entrada

    Linha 1: A quantidade de logs a serem analisados;
    Linhas Seguintes: Cada linha terá as informações de log de um determinado serviço AWS, no seguinte:
    yyyy-MM-dd HH:mm:ss,{Nome do Serviço AWS},{Log do Evento Registrado Neste Serviço AWS}

Saída

O programa exibirá os resultados da análise, apresentando:

    A quantidade de eventos específicos para cada log de serviço AWS lido na Entrada (em ordem de leitura):
    Eventos por servico:
    {Nome do 1º Serviço AWS}:{Quantidade de Logs do 1º Serviço AWS}
    {Nome do 2º Serviço AWS}:{Quantidade de Logs do 2º Serviço AWS}
    {Nome do Nº Serviço AWS}:{Quantidade de Logs do Nº Serviço AWS}
    O serviço AWS que teve a maior* quantidade de eventos registrados:
    Maior:{Nome do Serviço AWS}
    O serviço AWS que teve a menor* quantidade de eventos registrados:
    Menor:{Nome do Serviço AWS}

* Tenha como verdade que sempre teremos um serviço com maior incidência e outro com menor, ou seja, nunca teríamos um empate. Veja exemplos abaixo.
Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada 	                                                                      Saída
1
2023-07-24 10:15:32,RDS,Database instance db-01a failed to start 	              Eventos por servico:
                                                                                  RDS:1
                                                                                  Maior:RDS
                                                                                  Menor:RDS


3                                                                                 Eventos por servico:
2023-07-24 10:15:32,EC2,Instance i-12345 startedS                                 3:1
2023-07-24 10:17:45,EC2,Instance i-67890 stopped                                  EC2:2
2023-07-24 10:20:11,S3,Bucket example-bucket created 	                          Maior:EC2
                                                                                  Menor:S3


6                                                                                 Eventos por servico:
2023-07-24 10:15:32,EC2,Instance i-12345 started                                  S3:2
2023-07-24 10:17:45,S3,Bucket example-bucket created                              EC2:3
2023-07-24 10:20:11,EC2,Instance i-67890 stopped                                  Lambda:1
2023-07-24 10:23:05,Lambda,Function example-function executed successfully        Maior:EC2
2023-07-24 10:25:39,S3,Object example.txt deleted from bucket example-bucket      Menor:Lambda
2023-07-24 10:28:02,EC2,Instance i-98765 started

 */

package Projetos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonitoramentoEAnáliseDeLogsNaAWS {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ler a quantidade de logs a serem analisados

        int numLogs = Integer.parseInt(scanner.nextLine());

        // Criar um mapa para armazenar a contagem de eventos por serviço AWS

        Map<String, Integer> eventosPorServico = new HashMap<>();

        // Ler os logs e contar os eventos por serviço AWS

        for (int i = 0; i < numLogs; i++) {

            String[] logParts = scanner.nextLine().split(",");

            String nomeServico = logParts[1];

            eventosPorServico.put(nomeServico, eventosPorServico.getOrDefault(nomeServico, 0) + 1);

        }

        // Encontrar o serviço AWS com a maior e a menor quantidade de eventos

        String maiorServico = eventosPorServico.entrySet().stream()

                .max(Map.Entry.comparingByValue())

                .get()

                .getKey();

        String menorServico = eventosPorServico.entrySet().stream()

                .min(Map.Entry.comparingByValue())

                .get()

                .getKey();

        // Exibir os resultados da análise

        System.out.println("Eventos por servico:");

        eventosPorServico.forEach((servico, quantidade) -> {

            System.out.println(servico + ":" + quantidade);

        });

        System.out.println("Maior:" + maiorServico);

        System.out.println("Menor:" + menorServico);

        scanner.close();

    }

}