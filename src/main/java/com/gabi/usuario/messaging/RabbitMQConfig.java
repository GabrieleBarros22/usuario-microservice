package com.gabi.usuario.messaging;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;

@Configuration
@EnableRabbit
public class RabbitMQConfig {

    @Bean
    public Queue filaUsuario() {
        return new Queue("fila.usuario", true);
    }
}
