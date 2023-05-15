package chapter4.services;

import org.codehaus.plexus.component.annotations.Configuration;

@Configuration
@ComponentScan(basePackages = {"proxies","services","repositories"})
public class ProjectConfiguration {
}
