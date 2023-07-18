package com.jumarket.mercado.Repositorio

import com.jumarket.mercado.Classes.ItemCarrinho
import org.springframework.data.jpa.repository.JpaRepository

interface CarrinhoInterface: JpaRepository<ItemCarrinho, Long> {
}