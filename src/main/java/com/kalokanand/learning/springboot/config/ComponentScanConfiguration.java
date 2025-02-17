package com.kalokanand.learning.springboot.config;


import com.kalokanand.learning.componentscan.ComponentScanExcludeFilters;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = {"com.kalokanand.learning.componentscan", "com.kalokanand.learning.spring.scope"},
excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {ComponentScanExcludeFilters.class}))
public class ComponentScanConfiguration {
}
