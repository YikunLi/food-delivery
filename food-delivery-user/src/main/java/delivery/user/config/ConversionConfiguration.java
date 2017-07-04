package delivery.user.config;

import delivery.user.converter.LoginDoToLoginReponse;
import delivery.user.converter.UserToUserDoConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liyikun on 2017/7/3.
 */
@Configuration
public class ConversionConfiguration {

    @Bean
    public ConversionService conversionService() {
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        bean.setConverters(this.getConverters());
        bean.afterPropertiesSet();
        return bean.getObject();
    }

    private Set<Converter> getConverters() {
        Set<Converter> converters = new HashSet<>();
        converters.add(new UserToUserDoConverter());
        converters.add(new LoginDoToLoginReponse());
        return converters;
    }
}
