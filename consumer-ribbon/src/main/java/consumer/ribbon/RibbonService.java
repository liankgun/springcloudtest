package consumer.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiServiceError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://provider-a/hi?name=" + name, String.class);
    }

    public String hiServiceError(String name) {
        return "hi," + name + ",断路机制启动，hiServiceError";
    }
}
