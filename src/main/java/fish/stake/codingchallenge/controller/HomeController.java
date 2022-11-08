package fish.stake.codingchallenge.controller;

import fish.stake.codingchallenge.service.K8sInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {

    @Value("${coddingchallendge.version}")
    private String version;

    private final K8sInfoService k8sInfoService;

    @GetMapping(value = "/", produces = "application/json")
    public HomeDto home() {
        return new HomeDto(
                version,
                Instant.now().toEpochMilli(),
                k8sInfoService.runUnderKubernetes()
        );
    }
}
