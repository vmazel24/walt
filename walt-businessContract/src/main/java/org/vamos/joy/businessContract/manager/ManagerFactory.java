package org.vamos.joy.businessContract.manager;

public interface ManagerFactory {

    CryptoManager getCryptoManager();

    void setCryptoManager(CryptoManager pCryptoManager);

}
