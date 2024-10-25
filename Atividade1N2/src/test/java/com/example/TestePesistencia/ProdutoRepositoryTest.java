package com.example.TestePesistencia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.TestePesistencia.model.Produto;
import com.example.TestePesistencia.persistence.ProdutoRepository;

@DataJpaTest
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    public void quandoSalvarProduto_entaoEncontrarPorNome() {
        Produto produto = new Produto();
        produto.setNome("Fone de Ouvido JBL");
        produto.setPreco(99.90);
        produtoRepository.save(produto);

        Optional<Produto> encontradoPorId = produtoRepository.findById(produto.getCodigo());
        assertTrue(encontradoPorId.isPresent());
        assertEquals(produto.getNome(), encontradoPorId.get().getNome());

        Optional<Produto> encontradoPorNome = produtoRepository.findByNome("Fone de Ouvido JBL");
        assertTrue(encontradoPorNome.isPresent());
        //assertEquals(99.90, encontradoPorNome.get().getPreco());
    }
}
