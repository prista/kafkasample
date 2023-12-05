download kafka locally. Follow quickstart section. Each command **_run in separate shell_**:
1) #### start zookeeper `.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`
2) #### start Kafka Server (**broker** itself): `.\bin\windows\kafka-server-start.bat .\config\server.properties`
3) #### Start the app
4) #### In order to consume from 'amigoscode' Topic via terminal: `.\bin\windows\kafka-console-consumer.bat --topic amigoscode --from-beginning --bootstrap-server localhost:9092`

