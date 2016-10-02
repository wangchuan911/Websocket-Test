package hello;

import java.security.Principal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingsController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greetings(Principal principal,HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        System.out.println(principal.getName()+" send a message!");
        return new Greeting("Hello, " + message.getName() + "!");
    }
    


}
