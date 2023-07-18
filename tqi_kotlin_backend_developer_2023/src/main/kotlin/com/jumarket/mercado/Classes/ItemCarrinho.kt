package com.jumarket.mercado.Classes

import jakarta.persistence.*

// Classe para representar o carrinho de compras
@Entity
@Table(name = "Carrinho")
data class ItemCarrinho(
    @OneToMany @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
    @Embedded val produto: Produto,
    var quantidade: Int )