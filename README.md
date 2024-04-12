# microsservicos-padrao-saga
Projeto de microserviços com kafka, redpanda, spring, mongo, postgres que utiliza o padrão saga orquestrado



## Ferramentas necessárias para rodar o projeto
- Docker
- Docker-compose
- Intellij
- Java 17 (Instalado na maquina)

Obs: Antes de executar os comandos que utilizar java ou gradle no terminal verificar se a versão é a 17 com `java --version`

## Rodar o projeto

### Utilizando Intellij
- Importar o projeto
- Como o projeto já tem um .ideia configurado, após o build inicial do gradle tudo deveria estar certo

    **ou**
- Você pode rodar um por um e depois verificar todos de uma vez na aba de **services**(Alt + 8)

### Utilizando Docker
 - Rodar `./gradlew build` na raiz do projeto, com isso será gerado o build de todos os submodulos (Serviços)
 - Rodar `docker-compose up` na raiz do projeto, com isso será criado todos os containers
   
    **ou**
- Também existe um arquivo **build.py** na raiz para fazer esse build pulando os testes, para executa-lo, basta instalar o python3 e executar `python3 build.py` na raiz do projeto
