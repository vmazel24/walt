package org.vamos.joy.businessImpl.manager;

import org.springframework.stereotype.Component;
import org.vamos.joy.businessContract.manager.CryptoManager;
import org.vamos.joy.model.Crypto;
import org.vamos.joy.model.exception.NotFoundException;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Component
public class CryptoManagerImpl implements CryptoManager {

    @Override
    public Crypto getCrypto(String pName) throws NotFoundException {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        if (pName.isEmpty()) {
            throw new NotFoundException("Crypto non trouvée");
        }
        Crypto vCrypto = new Crypto(pName);
        return vCrypto;
    }


    @Override
    public List<Crypto> getListCrypto() {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        List<Crypto> vList = new ArrayList<>();
        for (int vI = 0; vI < 3; vI++) {
            Crypto vCrypto = new Crypto(vI+" Coin");
            vList.add(vCrypto);
        }
        return vList;
    }
}
