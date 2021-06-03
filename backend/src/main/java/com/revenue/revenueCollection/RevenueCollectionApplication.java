package com.revenue.revenueCollection;

import com.revenue.revenueCollection.config.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Properties;

@SpringBootApplication
//@EnableJpaRepositories("com.revenue.revenueCollection.*")
//@ComponentScan(basePackages = { "com.revenue.revenueCollection.*" })
//@EntityScan("my.package.base.*")
public class RevenueCollectionApplication extends SpringBootServletInitializer {

  public RevenueCollectionApplication() {
    super();
    setRegisterErrorPageFilter(false); // <- this one
  }

  static Properties getProperties() {
    Properties props = new Properties();
    props.put("spring.config.location", ResourceConfig.CATALINA_BASE + "/conf/backofficeConfigs/");
    return props;
  }

  public static void main(String[] args) {
    System.out.println("catalina base ###" + ResourceConfig.CATALINA_BASE);
    SpringApplication.run(RevenueCollectionApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(RevenueCollectionApplication.class).properties(getProperties());
  }
}
