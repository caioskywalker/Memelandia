# Memelandia
Projeto final da Escola Britânica de Artes Criativas

Cadastro de catálogo de memes

Requisitos:
1. Cadastro de usuários para envio de memes. 
2. Cadastro de categorias de memes. 
3. Cadastro de memes. Memes precisam necessariamente ter uma categoria.

  O projeto possui tecnologias de métricas, logs e descobertas de microserviços 

  1. Spring Boot
O Spring Boot é a espinha dorsal do projeto, proporcionando uma estrutura sólida e fácil de configurar para aplicações Java. Utilizamos o spring-boot-starter-parent como parent POM, que oferece uma configuração padrão e otimizada para o Spring Boot. O spring-boot-starter-web é utilizado para simplificar o desenvolvimento de serviços web, enquanto o spring-boot-starter-data-jpa e spring-boot-starter-jdbc facilitam o acesso e manipulação de dados no banco de dados.

2. PostgreSQL
Para a persistência de dados, o projeto utiliza o PostgreSQL como sistema de gerenciamento de banco de dados relacional. A dependência postgresql garante a integração com o banco de dados, aproveitando suas características avançadas de performance e confiabilidade.

3. Spring Cloud
O Spring Cloud é utilizado para construir e gerenciar a arquitetura de microserviços. Com o spring-cloud-starter-openfeign, o projeto faz uso do Feign para simplificar chamadas HTTP entre serviços. O spring-cloud-starter-zookeeper-discovery é empregado para o registro e descoberta de serviços, utilizando o Apache Zookeeper como mecanismo de descoberta de serviços.

4. Micrometer e Observabilidade
Para monitoramento e rastreamento, o projeto incorpora o Micrometer com micrometer-tracing-bridge-brave e zipkin-reporter-brave. Estas bibliotecas são essenciais para a coleta de métricas e rastreamento distribuído, integrando-se com o Zipkin para análise e visualização de traces.

5. Testes
Para garantir a qualidade do código, o projeto utiliza o spring-boot-starter-test, que fornece suporte para testes unitários e de integração, promovendo uma abordagem abrangente para a validação das funcionalidades.

6. Ferramentas e Plugins
O Spring Boot Maven Plugin (spring-boot-maven-plugin) é empregado para a construção e execução da aplicação, simplificando o processo de embalagem e execução do projeto.
