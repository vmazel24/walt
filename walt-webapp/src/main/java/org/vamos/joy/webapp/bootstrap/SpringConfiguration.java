package org.vamos.joy.webapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.vamos.joy.businessContract.manager.ManagerFactory;
import org.vamos.joy.webapp.web.AbstractController;

/**
 * Classe de configuration de Spring
 */
@Configuration
@ComponentScan("org.vamos.joy")
@ImportResource("classpath:/applicationContext.xml")
public class SpringConfiguration {

    @Autowired
    ManagerFactory managerFactory;

    @Bean
    public MethodInvokingFactoryBean instanciateAbstractController() {

        MethodInvokingFactoryBean methodInvokingFactoryBean = new MethodInvokingFactoryBean();
        methodInvokingFactoryBean.setTargetClass(AbstractController.class);
        methodInvokingFactoryBean.setTargetMethod("setManagerFactory");
        methodInvokingFactoryBean.setArguments(managerFactory);

        return methodInvokingFactoryBean;
    }
}
