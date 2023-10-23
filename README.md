# kafka-listener-springboot-demo


* A Kafka Consumer is a client application that reads data from a Kafka cluster. It subscribes to one or more topics, and consumes published messages. 
* Producers send messages to a topic, which is a category name where records are stored and published. Topics are divided into several partitions to allow them to scale horizontally. 
* Partitions - Topics are divided into several partitions to allow them to scale horizontally. Each partition is an immutable sequence of messages.

* Offset - Consumers can read messages from a specific partition by specifying an offset, which is the position of the message within the partition. An ack (acknowledgment) is a message sent by a consumer to a Kafka broker to indicate that it has successfully processed a record. The consumer offset will be updated once the ack is sent. This ensures the message is consumed, and won’t be delivered to the current listener again.
