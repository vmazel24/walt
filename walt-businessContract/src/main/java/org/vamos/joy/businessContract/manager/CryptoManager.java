package org.vamos.joy.businessContract.manager;

import org.vamos.joy.model.Crypto;
import org.vamos.joy.model.exception.NotFoundException;

import java.util.List;

public interface CryptoManager {
    /**
     * Renvoie le projet demandé
     *
     * @param pName l'identifiant de la crypto
     * @return Le {@link Crypto}
     * @throws NotFoundException Si la crypto n'est pas trouvée
     */
    Crypto getCrypto(String pName) throws NotFoundException;

    /**
     * Renvoie la liste des {@link Crypto}
     *
     * @return List
     */
    List<Crypto> getListCrypto();
}
