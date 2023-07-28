# Projeto de Chat em Java - Spring Boot

<div style="text-align: center;">
<img src="https://4.bp.blogspot.com/-ou-a_Aa1t7A/W6IhNc3Q0gI/AAAAAAAAD6Y/pwh44arKiuM_NBqB1H7Pz4-7QhUxAgZkACLcBGAs/s1600/spring-boot-logo.png" width="200">
<img src="https://www.jittagornp.me/blog/what-is-websocket/websocket-icon.jpeg" width="200">
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Logo-redis.svg/2560px-Logo-redis.svg.png" width="200">
<img src="https://upload.wikimedia.org/wikipedia/commons/c/cb/Gradle_logo.png" width="300">
</div>

## Descrição do Projeto

Este é um projeto de chat em tempo real desenvolvido utilizando Java com Spring Boot. O objetivo é criar uma aplicação de chat que utiliza WebSocket para comunicação em tempo real entre o backend e o frontend. Além disso, o projeto faz uso do Redis para implementar o padrão Pub/Sub e garantir escalabilidade e alta disponibilidade.

## Funcionalidades

- Backend Spring Boot que recebe e emite eventos WebSocket em tempo real.
- Frontend web que emite e recebe eventos WebSocket em tempo real.
- Proteção do backend utilizando JWT (JSON Web Token) e Tickets.
- Utilização do padrão Pub/Sub com Redis para comunicação assíncrona.
- Implantação da aplicação com arquitetura escalável e altamente disponível.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- WebSocket
- Redis
- Gradle

## Arquitetura do Projeto

O projeto segue uma arquitetura cliente-servidor, onde o backend é responsável por receber e emitir eventos WebSocket, enquanto o frontend é responsável por exibir a interface de chat e enviar/receber mensagens em tempo real.

O uso do Redis como mecanismo de mensageria permite a implementação do padrão Pub/Sub, onde os clientes se inscrevem em canais específicos e recebem mensagens publicadas por outros clientes.

## Instruções de Execução

1. Certifique-se de ter o Java 17 instalado em sua máquina.
2. Instale o Redis e certifique-se de que esteja em execução na porta padrão.
3. Clone este repositório para o seu ambiente local.
4. Acesse a pasta do projeto e execute o comando `./gradlew bootRun` para iniciar o backend.
5. Acesse a pasta do frontend e execute o comando `npm install` para instalar as dependências do projeto.
6. Após a instalação, execute o comando `npm start` para iniciar o servidor de desenvolvimento do frontend.
7. Abra o navegador e acesse a URL `http://localhost:3000` para acessar o chat.

<!-- ## Capturas de Tela

![Captura de Tela 1](https://exemplo.com/captura1.png)

![Captura de Tela 2](https://exemplo.com/captura2.png) -->

<!-- ## Estatísticas do Projeto

- Total de linhas de código: XX
- Número de commits: XX
- Número de issues abertas: XX
- Número de pull requests aceitas: XX -->

## Contribuindo

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver uma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Autores

- Daniel Falcão
