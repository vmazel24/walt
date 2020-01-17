package org.vamos.joy.webapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.vamos.joy.businessContract.manager.ManagerFactory;


public abstract class AbstractController {

    //@Autowired
    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
            return managerFactory;
        }
    public static void setManagerFactory(ManagerFactory pManagerFactory) {
            managerFactory = pManagerFactory;
        }
}



