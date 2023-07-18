package com.jumarket.mercado.Classes

import jakarta.persistence.*

// Classe para representar um produto
@Entity
@Table(name = "Produtos")
data class  Produto(
    @Column(nullable = false) var nome: String,
    @Column(nullable = false) var unidade: String,
    @Column(nullable = false) var preco: Double,
    @Column(nullable = false) var categoria: String,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null )