package com.liuguoquan.ssm.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConf {

    /**
     * 注入datasource
     * @return
     */
    @Bean(name = "dataSource")
    @Qualifier(value = "dataSource")//限定描述，能根据名字进行注入，能更细腻度的进行控制
    @Primary//用@Primary区分主数据源
    @ConfigurationProperties(prefix = "spring.datasource")//指定配置文件中的前缀
    public DataSource getDataSource() {
        return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
    }

    /**
     * 注入mybatis的核心工厂类
     * @return
     */
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(getDataSource());
        return sqlSessionFactoryBean;
    }
}
