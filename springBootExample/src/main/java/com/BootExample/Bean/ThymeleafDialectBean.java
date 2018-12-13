package com.BootExample.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration
public class ThymeleafDialectBean {
	@Bean
	public LayoutDialect layoutDialect() {
	    return new LayoutDialect();
	}
	/*@Bean
	public SpringResourceTemplateResolver templateResolver() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setPrefix("/templates/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML5");
		templateResolver.setCharacterEncoding("UTF-8");
		templateResolver.setCacheable(false);
		return templateResolver;
	}

	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();

		templateEngine.setTemplateResolver(templateResolver());
		templateEngine.addDialect(new LayoutDialect());

		return templateEngine;
	}


	@Bean
	public ThymeleafViewResolver thymeleafViewResolver() {
		ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();

		thymeleafViewResolver.setTemplateEngine(templateEngine());
		thymeleafViewResolver.setCharacterEncoding("UTF-8");
		thymeleafViewResolver.setOrder(1);

		return thymeleafViewResolver;
	}
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
