# Checkpoint 2 – API SOAP (FIAP - Arquitetura SOA e Web Services)

## 🧩 Descrição do Projeto

Este repositório contém a implementação do checkpoint 2 da disciplina de Arquitetura SOA e Web Services da FIAP, que consiste no desenvolvimento de uma API SOAP com Java. A aplicação contempla dois projetos separados:

- **WinerSys**: responsável pela publicação dos serviços SOAP.
- **WineOrderClient**: responsável pelo consumo dos serviços publicados.

---

## 👩‍💻 Integrantes do grupo

- Julia Palomari Silva – RM551910  
- Julia Ortiz – RM550204  
- Leticia Baptista – RM550289  

---

## ⚙️ Tecnologias utilizadas

- Java 21  
- Maven  
- JAX-WS (`jaxws-rt`, `javax.jws`, `javax.xml.ws`)  
- IntelliJ IDEA  

---

## 📁 Estrutura do repositório

```
/WinerSys             # Projeto do servidor SOAP
/WineOrderClient      # Projeto do cliente consumidor
```

---

## 🛠 Como executar

### 1. Clone o repositório
```bash
git clone https://github.com/palomari/SOACP2.git
```

### 2. Rode o projeto servidor (`WinerSys`)

- Abra a classe `Loader.java`
- Execute o método `main()`
- Verifique se os WSDLs estão acessíveis:
  - http://localhost:8085/WineStockService?wsdl
  - http://localhost:8086/WineWarningService?wsdl

### 3. Rode o projeto cliente (`WineOrderClient`)

- Execute o comando:
```bash
mvn clean install
```
- Execute a classe `ApplicationClient2.java`

---

## ✅ Resultado esperado no console

```
📋 Menu de Vinhos:
🍷 Cardápio de Vinhos:
- Cabernet Sauvignon
- Merlot
- Syrah
- Chardonnay
- Pinot Noir

✅ Resposta do Pedido:
Pedido confirmado!
Cliente: Julia
Quantidade: 3

⚠️ Alerta de Estoque:
Estoque insuficiente!
