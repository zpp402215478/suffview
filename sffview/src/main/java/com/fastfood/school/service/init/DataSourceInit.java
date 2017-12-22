package com.fastfood.school.service.init;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
//这个注解导入刚才增加的jdbc配置文件
@PropertySource("classpath:application.properties")
public class DataSourceInit {
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.name}")
	private String name;
	@Value("${jdbc.password}")
	private String password;
	@Value("${jdbc.initialSize}")
	private int initialSize;
	@Value("${jdbc.minIdle}")
	private int minIdle;
	@Value("${jdbc.maxActive}")
	private int maxActive;
	
	
	@Bean
	@Primary
	public DataSource getDataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(name);
		dataSource.setPassword(password);
		dataSource.setInitialSize(initialSize);
		dataSource.setMinIdle(minIdle);
		dataSource.setMaxActive(maxActive);
		dataSource.setMaxWait(300);
		dataSource.setMinEvictableIdleTimeMillis(300000);
		dataSource.setValidationQuery("select 'x'");
		dataSource.setTestWhileIdle(true);
		dataSource.setTestOnBorrow(false);
		dataSource.setTestOnReturn(false);
		dataSource.setPoolPreparedStatements(true);
		dataSource.setMaxPoolPreparedStatementPerConnectionSize(2);
		dataSource.setTimeBetweenLogStatsMillis(300000);
		return dataSource;
	}
	
}
