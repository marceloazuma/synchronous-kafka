Kafka

`docker-compose up -d --build`

`docker-compose down`

Topics

`docker-compose exec broker kafka-topics --zookeeper zookeeper:2181 --create --replication-factor 1 --partitions 3 --topic car.reply`

`docker-compose exec broker kafka-topics --zookeeper zookeeper:2181 --create --replication-factor 1 --partitions 3 --topic car.request`

`docker-compose exec broker kafka-topics --zookeeper zookeeper:2181 --list`

`docker-compose exec broker kafka-topics --zookeeper zookeeper:2181 --describe --topic car.request`

`docker-compose exec broker kafka-topics --zookeeper zookeeper:2181 --alter --topic car.request --partitions 3`

`docker-compose exec broker kafka-topics --zookeeper zookeeper:2181 --alter --topic car.reply --partitions 3`

Build libs

`mvn install`

Run car

`mvn -pl car spring-boot:run -Dspring-boot.run.arguments="--server.port=8189"`

`mvn -pl car spring-boot:run -Dspring-boot.run.arguments="--server.port=8190"`

`mvn -pl car spring-boot:run -Dspring-boot.run.arguments="--server.port=8191"`

Run car-client

`mvn -pl car-client spring-boot:run -Dspring-boot.run.arguments="--server.port=8089"`

`mvn -pl car-client spring-boot:run -Dspring-boot.run.arguments="--server.port=8090"`

`mvn -pl car-client spring-boot:run -Dspring-boot.run.arguments="--server.port=8091"`

Tests

`curl http://localhost:8089/car/12345678901234567`

`curl http://localhost:8089/car/76543210987654321`

`curl http://localhost:8089/car/45678901234567890`

`curl http://localhost:8089/car/78901234567890123`

