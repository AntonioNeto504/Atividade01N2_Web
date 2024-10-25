package com.example.TestePesistencia.persistence;

import java.util.Optional;

import com.example.TestePesistencia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findByNome(String nome);
}
