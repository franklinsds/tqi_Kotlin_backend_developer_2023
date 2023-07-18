package com.jumarket.mercado.Repositorio

import com.jumarket.mercado.Classes.Produto
import org.springframework.data.jpa.repository.JpaRepository

interface InventarioProdutos: JpaRepository<Produto, Long> {
}