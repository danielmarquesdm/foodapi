package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmailMock implements Notificador {
    public NotificadorEmailMock() {
        System.out.println("NotificadorEmailMock");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Mock: Notificação sendo enviada para %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
