package org.vamos.joy.businessImpl.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.vamos.joy.businessContract.manager.CryptoManager;
import org.vamos.joy.businessContract.manager.ManagerFactory;


@Component
public class ManagerFactoryImpl implements ManagerFactory {

    @Autowired
    private CryptoManager cryptoManager;

    @Override
    public CryptoManager getCryptoManager(){
        return this.cryptoManager;
    }
    @Override
    public void setCryptoManager(CryptoManager pCryptoManager){
        this.cryptoManager = pCryptoManager;
    }

}
