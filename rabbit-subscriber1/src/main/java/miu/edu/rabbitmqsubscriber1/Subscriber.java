package miu.edu.rabbitmqsubscriber1;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Subscriber {

    @RabbitListener(queues="${jsa.rabbitmq.queue}")
    public void recievedMessage(String msg) {
        System.out.println(msg);
    }
}
