package com.jumarket.mercado.Classes

import jakarta.persistence.Embedded
import org.springframework.beans.factory.annotation.Autowired



// Classe para representar a mercearia

class Mercearia {
    private val produtos = mutableListOf<Produto>()
    private val carrinho = mutableListOf<ItemCarrinho>()

    // Método para cadastrar um produto

     fun cadastrarProduto(nome: String, unidade: String, preco: Double, categoria: String, id: Long) {
        val produto = Produto(nome, unidade, preco,categoria, id)
        produtos.add(produto)
    }

    // Método para adicionar um produto ao carrinho

    fun adicionarAoCarrinho(produto: Produto, quantidade: Int) {
        val item = ItemCarrinho(produto, quantidade)
        carrinho.add(item)
    }
    // Método para calcular o total da compra

    fun calcularTotal(): Double {
        var total = 0.0
        for (item in carrinho) {
            total += item.produto.preco * item.quantidade
        }
        return total
    }
    // Método para realizar o pagamento com cartão de crédito/débito
    fun pagarComCartao(valor: Double) {
        // Lógica para processar o pagamento com cartão
        println("Pagamento de R$ $valor realizado com sucesso via cartão.")
    }

    // Método para realizar o pagamento em dinheiro

    fun pagarEmDinheiro(valor: Double, dinheiroRecebido: Double) {
        val troco = dinheiroRecebido - valor
        if (troco >= 0) {
            // Lógica para processar o pagamento em dinheiro
            println("Pagamento de R$ $valor realizado com sucesso. Troco: R$ $troco")
        } else {
            println("Valor insuficiente. Pagamento não realizado.")
        }
    }

    // Método para realizar o pagamento com PIX

    fun pagarComPix(valor: Double) {

        // Lógica para processar o pagamento com PIX

        println("Pagamento de R$ $valor realizado com sucesso via PIX.")
    }
}