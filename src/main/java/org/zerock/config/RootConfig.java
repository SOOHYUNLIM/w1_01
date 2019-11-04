package org.zerock.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class RootConfig {

    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
        hikariConfig.setJdbcUrl("jdbc:mysql://192.168.1.29:3306/bitdb?serverTimezone=Asia/Seoul&useSSL=false");
        hikariConfig.setUsername("bit04");
        hikariConfig.setPassword("1234");

        HikariDataSource dataSource = new HikariDataSource(hikariConfig);

        return dataSource;
    }
}