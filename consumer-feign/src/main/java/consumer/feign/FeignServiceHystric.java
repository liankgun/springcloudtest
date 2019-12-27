package consumer.feign;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystric implements FeignService {
    @Override
    public String hiService(String name) {
        return "hi," + name + ",断路机制启动，hiServiceError";
    }
}
