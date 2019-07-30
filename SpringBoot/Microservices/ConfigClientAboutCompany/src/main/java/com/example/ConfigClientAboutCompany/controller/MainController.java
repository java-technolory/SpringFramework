package com.example.ConfigClientAboutCompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RefreshScope
@RestController
public class MainController {
    //https://github.com/java-technolory/spring-cloud-config-git-repo-example.git
    //See: app-about-company.properties
    @Value(value = "${text.copyright: Default Copyright}")
    private String copyright;

    @Value(value = "${spring.datasource.driver-class-name}")
    private String driverClassname;

    @Value(value = "${spring.datasource.url}")
    private String url;

    @Value(value = "${spring.datasource.username}")
    private String username;

    @Value(value = "${spring.datasource.password}")
    private String password;

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/showConfig")
//    @ResponseBody
    public String showConfig() {
        String configInfo = "Copy Right: " + copyright
                + "<br/> spring.datasource.driver-class-name=" + driverClassname
                + "<br/> spring.datasource.url=" + url
                + "<br/> spring.datasource.username=" + username
                + "<br/> spring.datasource.password=" + password;
        return configInfo;
    }

    @RequestMapping(value = "/pingDataSource")
//    @ResponseBody
    public String pingDataSource() {
        return this.dataSource.toString();
    }

}
