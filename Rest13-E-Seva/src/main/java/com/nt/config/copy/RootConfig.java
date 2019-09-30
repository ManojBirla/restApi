package com.nt.config.copy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.nt.controller,com.nt.dao,com.nt.service"})

public class RootConfig {

}
