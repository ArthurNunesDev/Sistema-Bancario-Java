# Sistema Bancário Java

Projeto desenvolvido em Java como um sistema bancário simples executado pelo terminal.

## Sobre o projeto

Esta é a versão original do projeto, criada para praticar fundamentos da linguagem Java e orientação a objetos.

O sistema permite:

- Cadastrar contas bancárias
- Consultar o saldo de uma conta
- Realizar depósitos
- Realizar saques
- Verificar se uma conta já está cadastrada
- Localizar contas pelo número

## Estrutura atual

```text
src/
└── bancario/
    ├── ContaBancaria.java
    └── ProgramaPrincipal.java
```

### ContaBancaria

Representa uma conta bancária e mantém:

- Número da conta
- Nome do titular
- Saldo

Também possui operações para depósito e saque.

### ProgramaPrincipal

É responsável pela execução do sistema, pelo menu do terminal e pelo gerenciamento das contas em memória usando `ArrayList`.

## Tecnologias

- Java
- Programação Orientada a Objetos
- ArrayList
- Scanner

## Estado atual

> **V1 — versão original**

O objetivo deste repositório é evoluir gradualmente este projeto, mantendo a versão inicial como ponto de partida.

## Evolução planejada

A evolução será feita por etapas, começando pela melhoria do código atual e avançando posteriormente para uma arquitetura mais completa.

Possíveis etapas:

1. Melhorar validações e tratamento de entradas
2. Organizar melhor as responsabilidades das classes
3. Criar diferentes tipos de conta
4. Adicionar histórico de transações
5. Implementar transferências
6. Adicionar persistência dos dados
7. Evoluir para uma API REST com Spring Boot
8. Integrar um banco de dados
9. Criar uma interface web

As novas funcionalidades serão adicionadas gradualmente para que seja possível acompanhar a evolução do projeto.

## Objetivo

Transformar um projeto Java introdutório em um sistema bancário cada vez mais completo, utilizando práticas e tecnologias aprendidas ao longo do desenvolvimento.
