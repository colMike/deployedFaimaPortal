//package com.revenue.revenueCollection;
//
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.Database;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories(basePackages = {"com.revenue.revenueCollection._repositories", "com.revenue.revenueCollection.*"})
//public class JoinConfig {
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    public EntityManagerFactory entityManagerFactory(DataSource dataSource) {
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setDatabase(Database.SQL_SERVER);
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//
//        factory.setJpaVendorAdapter(vendorAdapter);
//        factory.setPackagesToScan(new String[]{"com.revenue.revenueCollection._repositories", "com.revenue.revenueCollection.*"});
//        factory.setDataSource(dataSource);
//        factory.afterPropertiesSet();
//        return factory.getObject();
//    }
//}
