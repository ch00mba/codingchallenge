package fish.stake.codingchallenge.controller;

import fish.stake.codingchallenge.utills.IPAddress;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/v1/tools")
public class ToolsController {

    @GetMapping(value = "/lookup", produces = "application/json")
    public String lookup(HttpServletRequest request) {
        return request.getServerName();
    }

    @GetMapping(value = "/validate", produces = "application/json")
    public ValidateDto validate(HttpServletRequest request) {
        return new ValidateDto(IPAddress.isIPv4(request.getRemoteAddr()));
    }

}
