package com.revisao.revisao.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revisao.revisao.domain.Post;
import com.revisao.revisao.repository.PostRepository;
import com.revisao.revisao.service.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        //na aula, o Nelio Alves usou o FindOne(id) para buscar o id do usuario, mas por motivos desconhecidos
        //ele não funcionou no meu código, por isso tô usando getReferenceById(id) pra isso, que funciona parecido
        //mas n é recomendado.
    Post post = repo.getReferenceById(id);
       if (post == null) {
         throw new ObjectNotFoundException("Objeto não encontrado");
       }
       return post; 
    }
}
