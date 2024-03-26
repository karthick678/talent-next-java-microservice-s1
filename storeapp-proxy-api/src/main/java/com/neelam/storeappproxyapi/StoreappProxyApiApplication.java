package com.neelam.storeappproxyapi;

import com.neelam.storeappproxyapi.filters.ErrorFilter;
import com.neelam.storeappproxyapi.filters.PostFilter;
import com.neelam.storeappproxyapi.filters.PreFilter;
import com.neelam.storeappproxyapi.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class StoreappProxyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappProxyApiApplication.class, args);
	}

	@Bean
	public PreFilter getPreFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter getPostFilter() {
		return new PostFilter();
	}

	@Bean
	public RouteFilter getRouteFilter() {
		return new RouteFilter();
	}

	@Bean
	public ErrorFilter getErrorFilter() {
		return new ErrorFilter();
	}
}
