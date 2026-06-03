package com.itb.inf2gm.anteikupizzaria.model.entity;

import com.itb.inf2gm.anteikupizzaria.model.enums.StatusPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedido {

    private Long id;
    private BigDecimal valorPedido;
    private LocalDateTime dataHoraPedido;
    private LocalDateTime dataHoraEntrega;
    private StatusPedido statusPedido;
    private boolean codStatus;


}
