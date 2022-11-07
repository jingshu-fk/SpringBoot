/**
 * @projectName SpringBoot
 * @package com.test1.config
 * @className com.test1.config.LocalDateTimeSerializerConfig
 */
package com.test1.config;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTimeSerializerConfig
 * @description 格式化时间
 * @author shujingping
 * @date 2022/11/3 10:11 上午
 * @version 1.0
 */

@Configuration
public class LocalDateTimeSerializerConfig {
    @Value("spring.jackson.date-format:yyyy-MM-dd HH:mm:ss")
    private String pattern;

    public LocalDateTimeSerializer localDateTimeDeserializer() {
        return new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(pattern));
    }

    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomize() {
        return builder -> builder.serializerByType(LocalDateTime.class, localDateTimeDeserializer());
    }
}
 
