## kafkaservice
this is a sample project using kafka and spring boot

## first
`cd ~docker`
`docker-compose up -d`

## not first 
d`ocker start kafka`

`docker start zookeeper-1`

## put message
`curl -X POST -F 'message=test' http://localhost:9000/kafka/publish`

 
