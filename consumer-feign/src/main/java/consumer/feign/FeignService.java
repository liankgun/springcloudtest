package consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider-a",fallback = FeignServiceHystric.class)
public interface FeignService {

    @GetMapping("/hi")
    String hiService(@RequestParam(value = "name") String name);

}
