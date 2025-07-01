package com.gabi.usuario.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConsumer {

    @RabbitListener(queues = "fila.usuario")
    public void receberMensagem(String mensagem) {
        System.out.println("📩 Mensagem recebida da fila.usuario: " + mensagem);
    }
}
