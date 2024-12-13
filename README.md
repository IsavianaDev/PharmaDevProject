# PharmaDev - Sistema de Gestão de Medicamentos e Funcionários

PharmaDev é um sistema desenvolvido em Java para gerenciar o processo de vendas de medicamentos em uma farmácia. O sistema permite que os clientes interajam com o carrinho de compras, incluindo adicionar, remover e alterar medicamentos, além de fornecer uma interface para gerenciamento de funcionários. O sistema implementa conceitos de orientação a objetos, como herança, polimorfismo e abstração.

---

## Funcionalidades

- **Cadastro e Interação com Funcionários**: O sistema permite a visualização de funcionários cadastrados e a interação com suas informações (consultar por ID ou adicionar um novo funcionário).
  
- **Carrinho de Compras**: O cliente pode adicionar, remover, alterar e listar medicamentos no carrinho de compras. O sistema simula a venda de medicamentos, considerando se o cliente está em posse de uma receita médica e o tipo de medicamento (tarja vermelha ou preta).

---

## Estrutura do Projeto

### Pacotes:
1. **`aplicacao`**: Contém a classe principal `Programa`, responsável pela interação com o usuário e o fluxo do sistema.
2. **`entidades`**: Contém as classes que representam as entidades do sistema, como `Cliente`, `Funcionario`, `Carrinho`, `Medicamento`, e `Pessoa` (classe abstrata base).
3. **`interfaces`**: Define a interface `GerenciadorMedicamento`, que contém os métodos para gerenciar os medicamentos no carrinho de compras.

### Classes e Suas Funções:

- **`Pessoa`** (classe abstrata): Representa uma pessoa (cliente ou funcionário) com atributos `nome` e `cpf`.
- **`Cliente`**: Extende `Pessoa` e representa um cliente do sistema.
- **`Funcionario`**: Extende `Pessoa` e representa um funcionário da farmácia, com atributos adicionais `idFuncionario` e `cargo`.
- **`Medicamento`**: Representa um medicamento com atributos como `nome`, `preco` e `classificacao` (tarja vermelha ou preta).
- **`Carrinho`**: Implementa a interface `GerenciadorMedicamento`, gerencia os medicamentos no carrinho de compras (adicionar, remover, alterar, listar).
- **`GerenciadorMedicamento`**: Interface que define os métodos necessários para gerenciar o carrinho de medicamentos.
- **`Programa`**: Classe principal, onde a interação com o usuário ocorre. O cliente pode adicionar medicamentos ao carrinho, consultar informações sobre funcionários, entre outras ações.

---

## Diagrama de Classes

- **Pessoa** (abstrata)
  - Cliente (herda de Pessoa)
  - Funcionario (herda de Pessoa)
  
- **Medicamento**
- **Carrinho** (implementa GerenciadorMedicamento)
- **GerenciadorMedicamento** (interface)

---

## Funcionalidade Detalhada

### Interação com o Cliente:

1. **Cadastro do Cliente**: O sistema solicita o nome e CPF do cliente.
2. **Consulta e Cadastro de Funcionários**: O cliente tem a opção de consultar informações sobre os funcionários cadastrados (consultar por ID) ou adicionar novos funcionários.
3. **Carrinho de Compras**: O cliente pode:
   - **Adicionar Medicamentos**: Somente medicamentos com receita podem ser adicionados ao carrinho. O tipo de medicamento (tarja vermelha ou preta) deve ser informado.
   - **Remover Medicamentos**: O cliente pode remover medicamentos do carrinho.
   - **Alterar Medicamentos**: Medicamentos no carrinho podem ser alterados.
   - **Listar Medicamentos**: O cliente pode visualizar todos os medicamentos no carrinho com seus preços e o total acumulado.

### Funcionários:

1. **Consultar Funcionários**: O sistema já possui alguns funcionários cadastrados (simulados). O cliente pode consultar essas informações utilizando o ID do funcionário.
2. **Adicionar Funcionário**: O cliente pode adicionar um novo funcionário ao sistema, fornecendo nome, CPF, ID e cargo.

---

## Como Executar o Sistema

1. **Pré-requisitos**:
   - Ter o **Java 8** ou superior instalado na máquina.
   
2. **Compilação e Execução**:
   - Compile o projeto utilizando um IDE (como IntelliJ IDEA ou Eclipse) ou pela linha de comando:
   
     ```
     javac -d bin src/aplicacao/Programa.java
     ```
   
   - Execute o programa:

     ```
     java -cp bin aplicacao.Programa
     ```
