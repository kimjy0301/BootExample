package com.BootExample.Bean;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration
public class ThymeleafDialectBean {
	@Bean
	public LayoutDialect layoutDialect() {
		return new LayoutDialect();
	}

	@Bean
	public ServletWebServerFactory servletContainer() {
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
			@Override
			protected void postProcessContext(Context context) {
				SecurityConstraint securityConstraint = new SecurityConstraint();
				securityConstraint.setUserConstraint("CONFIDENTIAL");
				SecurityCollection collection = new SecurityCollection();
				collection.addPattern("/*");
				securityConstraint.addCollection(collection);
				context.addConstraint(securityConstraint);
			}
		};
		tomcat.addAdditionalTomcatConnectors(redirectConnector());
		return tomcat;
	}

	private Connector redirectConnector() {
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setScheme("http");
		connector.setPort(8080);
		connector.setSecure(false);
		connector.setRedirectPort(8443);
		return connector;
	}

	/*
	 * @Bean public SpringResourceTemplateResolver templateResolver() {
	 * SpringResourceTemplateResolver templateResolver = new
	 * SpringResourceTemplateResolver(); templateResolver.setPrefix("/templates/");
	 * templateResolver.setSuffix(".html");
	 * templateResolver.setTemplateMode("HTML5");
	 * templateResolver.setCharacterEncoding("UTF-8");
	 * templateResolver.setCacheable(false); return templateResolver; }
	 * 
	 * @Bean public SpringTemplateEngine templateEngine() { SpringTemplateEngine
	 * templateEngine = new SpringTemplateEngine();
	 * 
	 * templateEngine.setTemplateResolver(templateResolver());
	 * templateEngine.addDialect(new LayoutDialect());
	 * 
	 * return templateEngine; }
	 * 
	 * 
	 * @Bean public ThymeleafViewResolver thymeleafViewResolver() {
	 * ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
	 * 
	 * thymeleafViewResolver.setTemplateEngine(templateEngine());
	 * thymeleafViewResolver.setCharacterEncoding("UTF-8");
	 * thymeleafViewResolver.setOrder(1);
	 * 
	 * return thymeleafViewResolver; }
	 */

	/*
	 * @Bean(name = "templateViewResolver") public ViewResolver viewResolver() {
	 * ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	 * resolver.setTemplateEngine(templateEngine());
	 * resolver.setCharacterEncoding("UTF-8");
	 * resolver.setContentType("text/html; charset=UTF-8"); return resolver; }
	 * 
	 * @Bean(name = "templateEngine") public TemplateEngine templateEngine() {
	 * TemplateEngine engine = new TemplateEngine();
	 * engine.setTemplateResolver(templateResolver());
	 * 
	 * engine.addDialect(new LayoutDialect()); // On this line I get Exception
	 * return engine; }
	 * 
	 * @Bean(name = "templateResolver") public ITemplateResolver templateResolver()
	 * { SpringResourceTemplateResolver resolver = new
	 * SpringResourceTemplateResolver();
	 * resolver.setApplicationContext(applicationContext);
	 * resolver.setPrefix("/views/"); resolver.setSuffix(".html");
	 * resolver.setTemplateMode("HTML5"); resolver.setCharacterEncoding("UTF-8");
	 * resolver.setCacheable(false); return resolver; }
	 * 
	 * @Bean(name = "thymeleafViewResolver") public AjaxThymeleafViewResolver
	 * thymeleafViewResolver() { AjaxThymeleafViewResolver thymeleafViewResolver =
	 * new AjaxThymeleafViewResolver(); // web flow ajax
	 * thymeleafViewResolver.setViewClass(FlowAjaxThymeleafView.class); // web flow
	 * + thymeleaf ajax thymeleafViewResolver.setTemplateEngine(templateEngine());
	 * thymeleafViewResolver.setCharacterEncoding("UTF-8"); return
	 * thymeleafViewResolver; }
	 */

}
