package br.edu.ifpi.produtos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public List<Produto> listar() {
        return List.of(
                new Produto(1L, "Arroz 5kg", "Mercearia", 28.90),
                new Produto(2L, "Feijão Preto 1kg", "Mercearia", 8.50),
                new Produto(3L, "Leite Integral 1L", "Laticínios", 5.20),
                new Produto(4L, "Detergente 500ml", "Limpeza", 2.49)
        );
    }

    @GetMapping("/{id}")
    public Produto buscar(@PathVariable("id") Long id) {
        return new Produto(id, "Produto " + id, "Mercearia", 10.00);
    }
}