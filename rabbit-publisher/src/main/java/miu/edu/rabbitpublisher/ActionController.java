package miu.edu.rabbitpublisher;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/actions")
public class ActionController {

    private final MessagePublisher messagePublisher;

    public ActionController(MessagePublisher messagePublisher) {
        this.messagePublisher = messagePublisher;
    }
    @GetMapping
    public void publish(){
     messagePublisher.sendMessage();
    }

}
