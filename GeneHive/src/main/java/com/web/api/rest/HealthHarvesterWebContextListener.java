package com.web.api.rest;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by silvana.albert on 5/5/15.
 */
public class HealthHarvesterWebContextListener  extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new ServletModule() {

            @Override
            protected void configureServlets() {
//                install(new AgreementsServiceModule());
//                install(new WebServicesModule());
//                install(new ProcessControlerModule());

                //filter("/*").through(PersistFilter.class);

                Map<String, String> params = new HashMap<String, String>();
                params.put(PackagesResourceConfig.PROPERTY_PACKAGES,
                        "com.web.api.rest");
                params.put("com.sun.jersey.api.json.POJOMappingFeature", "true");

                serve("/API/v1/*").with(GuiceContainer.class, params);
            }
        });
    }
}
