package com.aqua.springboottodo.config;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log4j2
@MapperScan(basePackages = {"com.aqua.**.mapper"})
public class RootConfig {


}
