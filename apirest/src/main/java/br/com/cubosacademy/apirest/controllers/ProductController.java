package br.com.cubosacademy.apirest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.cubosacademy.apirest.models.Product;
import br.com.cubosacademy.apirest.repositories.ProductRepository;
import br.com.cubosacademy.apirest.utils.ResponseHandler;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
    public List<Product> listaDeProdutos(){
        
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obterProduto(@PathVariable Integer id){
        
        Optional<Product> product = productRepository.findById(id);
        if(!product.isPresent()){
            return ResponseHandler.generate("Produto não encontrado", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Object>(product.get(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> create(@RequestBody @Valid Product product){
      /*   if(product.getName() == null){
            return ResponseHandler.generate("Nome do produto é obrigatório", HttpStatus.BAD_REQUEST);
        }
        if(product.getPrice() == null){
            return ResponseHandler.generate("Preço do produto é obrigatório", HttpStatus.BAD_REQUEST);
        } */
        Product newProduct = productRepository.save(product);
        return new ResponseEntity<Object>(newProduct, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable Integer id, @RequestBody Product product) {
        
        Optional<Product> oldProduct = productRepository.findById(id);
        if(!oldProduct.isPresent()){
            return ResponseHandler.generate("Produto não encontrado", HttpStatus.NOT_FOUND);
        }
        if(product.getName() == null){
            return ResponseHandler.generate("Nome do produto é obrigatório", HttpStatus.BAD_REQUEST);
        }
        if(product.getPrice() == null){
            return ResponseHandler.generate("Preço do produto é obrigatório", HttpStatus.BAD_REQUEST);
        }

        Product updateProduct = oldProduct.get();
        updateProduct.setName(product.getName());
        updateProduct.setPrice(product.getPrice());
        updateProduct.setDescription(product.getDescription());

        productRepository.save(updateProduct);

        return ResponseEntity.noContent().build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarProduto(@PathVariable Integer id){

        Optional<Product> product = productRepository.findById(id);
        if(!product.isPresent()){
            return ResponseHandler.generate("Produto não encontrado", HttpStatus.NOT_FOUND);
        }

        productRepository.delete(product.get());

        return ResponseEntity.noContent().build();

    }
}
