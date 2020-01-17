package org.vamos.joy.webapp.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.vamos.joy.model.Crypto;
import org.vamos.joy.model.exception.NotFoundException;


@RestController
public class CryptoController extends AbstractController {


    private static final String template = "Hello, %s!";

    @GetMapping("/crypto")
    public Crypto crypto(@RequestParam(value = "name", defaultValue = "World") String pName) {
        Crypto vCrypto = null;
        try {
            vCrypto = getManagerFactory().getCryptoManager().getCrypto(pName);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return vCrypto;
    }
}
