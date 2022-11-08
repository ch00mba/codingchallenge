package fish.stake.codingchallenge.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class K8sInfoService {

    @Value("${coddingchallendge.kubernetes}")
    private boolean kubernetes;

    public boolean runUnderKubernetes() {
        return kubernetes;
    }
}
