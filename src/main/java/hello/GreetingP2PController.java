package hello;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
@Controller
public class GreetingP2PController {
	private SimpMessagingTemplate messaging;
	
	@Autowired 
	public GreetingP2PController(SimpMessagingTemplate messaging){
		this.messaging=messaging;
	}
    @MessageMapping("/say")
    public void greeting(Principal principal,HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        System.out.println(principal.getName()+" send a message!");
        messaging.convertAndSendToUser(principal.getName(), "/topic/greetings", message.getName()+" send a message to you!");
    }
}


