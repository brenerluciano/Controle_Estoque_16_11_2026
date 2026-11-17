# Controle_Estoque_16_11_2026

**Descrição:**

Sistema simples de controle de estoque desenvolvido em Java, permitindo registrar entradas, saídas e consultar o saldo de produtos. O projeto utiliza JUnit 5 e Cucumber (BDD) para testes automatizados, além de Git e GitHub para versionamento e colaboração.

**Integrantes:**

- Brener Lucioano Alves Couto - RA 42413132
- João Vitor Aguiar Paixão - RA 42414979
- João Pedro Alencar Pereira Costa - RA 42320831

## Tecnologias

* Java 17+
* Maven
* JUnit 5
* Cucumber (Gherkin)
* Git e GitHub


## Estrutura do projeto

src/main/java/estoque/
├── Produto.java            # Regra de negócio: adicionar, retirar e consultar saldo
└── Main.java               # Demonstração no console

src/test/java/estoque/
├── ProdutoTeste.java       # 3 testes unitários (JUnit 5)
└── bdd/
    ├── EstoqueSteps.java   # Implementação dos passos do Cucumber
    └── RunCucumberTest.java# Executor dos cenários BDD

src/test/resources/features/
└── estoque.feature         # 3 cenários BDD (Gherkin)


## Testes automatizados

*BDD (Cucumber):*
1. Entrada de produtos
2. Saída com saldo suficiente
3. Saída com saldo insuficiente (retirada recusada)

*JUnit 5:*
1. deveAdicionarUnidadesAoEstoque
2. deveRetirarQuandoHaSaldoSuficiente
3. deveRecusarRetiradaMaiorQueOSaldo

## Instruções de execução
Pré-requisitos: *Java 17+* e *Maven* instalados.

Executar todos os testes (JUnit + BDD):
bash
mvn test


Executar apenas os testes JUnit:
bash
mvn test -Dtest=ProdutoTeste


Executar apenas os cenários BDD:
bash
mvn test -Dtest=RunCucumberTest


Executar a demonstração no console:
bash
mvn compile
java -cp target/classes estoque.Main


## Fluxo de trabalho no Git
* main: versão final e estável
* dev: branch de integração
* feature/junit: testes unitários, integrada à dev via Pull Request
* feature/bdd: testes BDD, integrada à dev via Pull Request
* Integração final: Pull Request dev → main
