package com.shaun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.shaun.dao","com.shaun.bean"})
public class AppConfig {
}
