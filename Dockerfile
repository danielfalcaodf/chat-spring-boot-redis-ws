# Imagem base que inclui o Java JDK e o Gradle
FROM gradle:latest AS build

# Defina o diretório de trabalho para o diretório do projeto dentro do contêiner
WORKDIR /app

# Copie o arquivo build.gradle e settings.gradle para o contêiner
COPY build.gradle /app

COPY settings.gradle /app

# Copie todos os arquivos de origem do projeto para o contêiner
COPY src/ /app/src/

# Execute o comando de construção do Gradle no contêiner
RUN gradle build

FROM openjdk:17-alpine as dev
WORKDIR /app

COPY --from=build app/build/libs/ws-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080


ENTRYPOINT ["java", "-jar", "/app/app.jar"]

