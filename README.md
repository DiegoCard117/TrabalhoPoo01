# Trabalho de Classe e Herança

## Instituto Federal do Triângulo Mineiro - Campus Patrocínio

**Curso:** Análise e Desenvolvimento de SistemasDisciplina: Programação Orientada a ObjetosTurma: 3º PeríodoProfessora: Ligia PestiliEntrega: 28/03/2025

## Descrição do Trabalho

Este projeto tem como objetivo a implementação de conceitos de classes e herança em Java, abordando polimorfismo, encapsulamento e validações. O trabalho foi desenvolvido em parceria com uma colega de sala.

## Estrutura do Projeto

O projeto está dividido em três partes principais:

### 1) Classe Pessoa e Suas Subclasses

- **Superclasse:** Pessoa

  - Atributos: int codigo, String nome, String dataCadastro

- **Subclasses:**

  - Cliente (email, endereco, telefone)

  - Usuario (login, senha)

  - Implementação de getters e setters.

  - Classe Principal para testar com dois objetos de cada classe.

### 2) Classe ContaBancaria e Suas Subclasses

- **Superclasse:** ContaBancaria

  - Atributos: titular, saldo, rendaMensal

  - Validações para titular e rendaMensal.

  - Métodos: depositar(double), sacar(double), verificarSaldo().

- **Subclasses:**

ContaPoupanca (taxaJuros e aplicarJuros())

ContaCorrente (limiteEspecial, validado com base na rendaMensal)

Classe Principal para testar com três objetos de cada classe.

### 3) Classe Funcionario e Suas Subclasses

- **Superclasse:** Funcionario

  - Atributos: nome, salario

  - Método calcularBonus(String mesPagamento), aplicando 10% de bonus em dezembro.

- **Subclasses:**

  - Gerente (gratificacao)

  - Programador (valorPontoFuncao, método calcularValorSoftware(int linhasCodigo)).

  - Classe Principal para testar com três objetos de cada classe.

## Tecnologias Utilizadas

**Linguagem:** Java

**Paradigmas:** Programação Orientada a Objetos (POO)

## Como Executar

1. Compilar os arquivos .java.

2. Executar a classe Principal de cada parte para testar a funcionalidade.

3. Verificar as saídas para validar os resultados esperados.

## Contribuição

Desenvolvido por Diego Cardoso e Maria Clara.
