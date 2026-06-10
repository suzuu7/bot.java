# bot.java
# 📚 EduBot - ChatBot Escolar em Java

## 📝 Descrição do Projeto

O **EduBot** é um chatbot escolar desenvolvido em Java com o objetivo de auxiliar alunos fornecendo respostas rápidas para dúvidas frequentes sobre a escola, como horários de aula, provas, cursos e funcionamento do laboratório.

O projeto foi criado utilizando os princípios da **Programação Orientada a Objetos (POO)** e possui uma interface gráfica simples baseada em **JOptionPane**, permitindo a interação do usuário por meio de janelas.

---

## 🎯 Objetivos

* Aplicar os conceitos fundamentais da Programação Orientada a Objetos.
* Desenvolver uma interface gráfica simples e intuitiva.
* Criar um sistema capaz de responder perguntas frequentes de alunos.
* Demonstrar o uso de abstração, encapsulamento, herança e polimorfismo em um projeto prático.

---

## 🛠 Tecnologias Utilizadas

* Java
* Java Swing (JOptionPane)
* Programação Orientada a Objetos (POO)

---

## 🏗 Estrutura do Projeto

```
EduBot/
│
├── SistemaChatBot.java
│
├── Bot.java
│
├── ChatBotEscolar.java
│
└── README.md
```

### Classes

#### Bot (Classe Abstrata)

Responsável por definir a estrutura básica de qualquer chatbot.

Atributos:

* nome

Métodos:

* getNome()
* responder(String pergunta)

---

#### ChatBotEscolar (Classe Filha)

Herda da classe Bot e implementa o método responsável por processar e responder perguntas dos usuários.

Funções:

* Responder perguntas sobre:

  * Horários
  * Provas
  * Laboratório
  * Cursos
  * Saudações

---

#### SistemaChatBot (Classe Principal)

Responsável por iniciar o sistema e gerenciar a interação com o usuário através das janelas gráficas.

---

# 📖 Aplicação dos Pilares da POO

## 1️⃣ Abstração

A abstração é utilizada através da classe abstrata `Bot`, que define comportamentos comuns para qualquer chatbot.

```java
abstract class Bot {
    public abstract String responder(String pergunta);
}
```

---

## 2️⃣ Encapsulamento

O atributo `nome` é privado e acessado apenas por métodos públicos.

```java
private String nome;

public String getNome() {
    return nome;
}
```

---

## 3️⃣ Herança

A classe `ChatBotEscolar` herda características da classe `Bot`.

```java
class ChatBotEscolar extends Bot
```

---

## 4️⃣ Polimorfismo

O método `responder()` é sobrescrito na classe filha.

```java
@Override
public String responder(String pergunta)
```

---

# 💻 Funcionalidades

✅ Interface gráfica através de janelas.

✅ Reconhecimento de palavras-chave.

✅ Respostas automáticas.

✅ Encerramento da conversa ao digitar "sair".

✅ Estrutura orientada a objetos.

---

# 🚀 Como Executar

### Pré-requisitos

* JDK 8 ou superior instalado.
* IDE Java (Eclipse, NetBeans, IntelliJ IDEA ou VS Code).

---

### Passo 1

Clone ou baixe o projeto.

```bash
git clone https://github.com/seu-usuario/EduBot.git
```

---

### Passo 2

Abra o projeto em sua IDE.

---

### Passo 3

Compile e execute a classe:

```java
SistemaChatBot.java
```

---

# 📸 Exemplo de Uso

### Entrada

```
Oi
```

### Saída

```
Olá! Como posso ajudar?
```

---

### Entrada

```
Qual o horário das aulas?
```

### Saída

```
O horário das aulas é das 7h às 12h.
```

---

### Entrada

```
Quando será a prova?
```

### Saída

```
Consulte seu professor para informações sobre provas.
```

---

# 🔄 Fluxo do Sistema

```text
Início
   ↓
Tela de Boas-vindas
   ↓
Usuário digita uma pergunta
   ↓
Bot analisa a mensagem
   ↓
Resposta encontrada?
   ↓
Sim → Exibe resposta
Não → Exibe mensagem padrão
   ↓
Usuário deseja continuar?
   ↓
Sim → Nova pergunta
Não → Encerrar sistema
```

---

# 🎓 Aprendizados Obtidos

Durante o desenvolvimento deste projeto foram praticados conceitos importantes de desenvolvimento de software, tais como:

* Estruturação de classes.
* Organização de código.
* Herança.
* Polimorfismo.
* Encapsulamento.
* Abstração.
* Manipulação de interfaces gráficas.
* Interação usuário-sistema.

---

# 🔮 Melhorias Futuras

* Interface completa com JFrame.
* Histórico de conversas.
* Integração com banco de dados.
* Cadastro de usuários.
* Consulta de notas.
* Consulta de faltas.
* Calendário escolar.
* Integração com inteligência artificial.

---

# 👨‍💻 Autor

**Suzy Costa**

Projeto desenvolvido para fins educacionais e para aplicação dos conceitos de Programação Orientada a Objetos em Java.

---

## 📄 Licença

Este projeto é de uso acadêmico e pode ser utilizado livremente para estudos e aprendizado.
