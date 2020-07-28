package miu.edu.rabbitpublisher;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisher {

    private final AmqpTemplate amqpTemplate;
    private static int id=1;

    public MessagePublisher(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    @Value("${jsa.rabbitmq.exchange}")
    private String exchange;

    @Scheduled(fixedRate = 2000)
    public void sendMessage(){
        amqpTemplate.convertAndSend(exchange, "","umur " + id);
        id++;
    }
}
