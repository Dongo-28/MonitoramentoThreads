# 🧵 Sistema de Monitoramento de Threads para Processamento de Relatórios

Este projeto simula o processamento concorrente de relatórios na Universidade do Mindelo (UM), utilizando threads, ThreadLocal, e agendamento periódico com TimerTask.

## 🗂️ Estrutura do Projeto

MonitoramentoThreads/

│
├── src/

│   ├── Relatorio.java

│   ├── ProcessadorDeRelatorios.java

│   ├── RelatorioTimer.java

│   └── Principal.java

├── bin/

└── README.md

📄 Descrição das Classes

📘 Relatorio.java

=======
└── README.


## 📄 Descrição das Classes

### 📘 Relatorio.java
>>>>>>> f2be966 (:ok_hand: adicionando novo(s) arquivos/atualizações)
Representa um relatório com:
- ID do usuário
- Timestamp de geração
- Conteúdo descritivo

### ⚙️ ProcessadorDeRelatorios.java
Implementa a lógica de processamento:
- Usa ThreadLocal para configurações por thread
- Implementa Runnable para execução paralela
- Gera exceção se o UserID não estiver configurado

### ⏱️ RelatorioTimer.java
Controla a geração periódica dos relatórios:
- Usa TimerTask para executar tarefas a cada 5 segundos
- Cancela automaticamente após 20 segundos

### 🚀 Principal.java
Ponto de entrada do sistema:
- Configura handler global de exceções
- Inicializa processadores e agenda tarefas

## 💻 Pré-requisitos
- ☕ Java JDK 8 ou superior
- 🧰 IDE (ex: IntelliJ, Eclipse, VSCode) ou terminal com suporte a Java

## ⚙️ Como Compilar e Executar

# 1. Clone o repositório
```
git clone https://github.com/Dongo-28/MonitoramentoThreads

cd MonitoramentoThreads
```
# 2. Compile os arquivos
javac -d bin src/*.java
```
# 3. Execute o programa
java -cp bin Principal
```
## 📤 Saída Esperada
O console exibirá algo como:
Relatório processado: Relatório [UserID: 1, Timestamp: ..., Conteúdo: Conteúdo do relatório das propinas]
Relatório processado: Relatório [UserID: 2, Timestamp: ..., Conteúdo: Conteúdo do relatório das matrículas]
Exceção capturada no thread Thread-3: UserID não configurado para o thread atual.
Agendamento de relatórios encerrado

## ✅ Funcionalidades Implementadas
1. Execução concorrente com múltiplas threads
2. Configurações isoladas por thread com ThreadLocal
3. Agendamento com TimerTask a cada 5 segundos
4. Encerramento automático após 20 segundos
5. Tratamento centralizado de exceções
6. Monitoramento do ciclo de vida das threads

## 📦 Download e Execução Direta
Se preferires usar um JAR pronto:

1. Baixe: MonitoramentoThreads.jar
2. Execute via terminal:
```
java -jar MonitoramentoThreads.jar
<<<<<<< HEAD

ℹ️ Observações
O programa termina automaticamente após 20 segundos

Threads simulam usuários diferentes com comportamentos próprios

Exceções não tratadas são capturadas globalmente e mostradas no console
=======
```
## ℹ️ Observações
- O programa termina automaticamente após 20 segundos
- Threads simulam usuários diferentes com comportamentos próprios
- Exceções não tratadas são capturadas globalmente e mostradas no console