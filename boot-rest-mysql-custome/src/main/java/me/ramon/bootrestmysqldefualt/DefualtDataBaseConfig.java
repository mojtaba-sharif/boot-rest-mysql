package me.ramon.bootrestmysqldefualt;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by Romon on 1/14/2017.
 */
@Configuration
public class DefualtDataBaseConfig {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource defualtDataSource() {
        ComboPooledDataSource defualtDatasource = new ComboPooledDataSource();
        try {
            defualtDatasource.setJdbcUrl(environment.getProperty("db.url"));
            defualtDatasource.setUser(environment.getProperty("db.user"));
            defualtDatasource.setPassword(environment.getProperty("db.pass"));
            defualtDatasource.setDriverClass(environment.getProperty("db.driver"));

            defualtDatasource.setInitialPoolSize(Integer.valueOf("1"));
            defualtDatasource.setMaxPoolSize(Integer.parseInt("5"));
            defualtDatasource.setMinPoolSize(Integer.parseInt("5"));
            defualtDatasource.setMaxConnectionAge(Integer.parseInt("100"));
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return defualtDatasource;
    }

}
