# Terminal Library App 📚

Sistema de gerenciamento de livros via terminal desenvolvido em Java. O projeto simula o funcionamento de uma biblioteca, permitindo a visualização de acervo, verificação de status (disponibilidade) e navegação por menus interativos.

## 🚀 Funcionalidades

- **Menu Interativo**: Navegação intuitiva via entrada de teclado.
- **Listagem de Livros**: Exibição dinâmica dos títulos cadastrados.
- **Controle de Status**: Uso de Enums para definir se um livro está `DISPONIVEL` ou `EMPRESTADO`.
- **Configurações**: Seção de informações sobre a versão do sistema e créditos.

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java 17+
- **Paradigma**: Programação Orientada a Objetos (POO)
- **Estrutura de Dados**: `ArrayList` para armazenamento dos livros.
- **Organização**: Modularização por pacotes (`Livros`, `Livros.menu`).

## 📁 Estrutura do Projeto

O projeto está dividido de forma organizada para facilitar a manutenção:

- `Main.java`: Ponto de entrada da aplicação e lógica principal.
- `LivrosLista.java`: Gerencia o repositório de títulos.
- `SituacaoLivro.java`: Enum que define os estados dos livros.
- `MenuBt.java`: Classe responsável pela interface visual do menu principal.
- `config.java`: Classe com metadados e configurações do app.

## ⚙️ Como executar

1. Certifique-se de ter o **JDK 17** ou superior instalado.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/nome-do-repositorio.git](https://github.com/seu-usuario/nome-do-repositorio.git)
