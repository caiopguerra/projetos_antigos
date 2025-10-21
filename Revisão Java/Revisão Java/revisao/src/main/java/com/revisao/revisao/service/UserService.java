package com.revisao.revisao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revisao.revisao.DTO.UserDTO;
import com.revisao.revisao.domain.User;
import com.revisao.revisao.repository.UserRepository;
import com.revisao.revisao.service.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        //na aula, o Nelio Alves usou o FindOne(id) para buscar o id do usuario, mas por motivos desconhecidos
        //ele não funcionou no meu código, por isso tô usando getReferenceById(id) pra isso, que funciona parecido
        //mas n é recomendado.
    User user = repo.getReferenceById(id);
       if (user == null) {
         throw new ObjectNotFoundException("Objeto não encontrado");
       }
       return user; 
    }

    public User insert(User obj) {
        return repo.save(obj);
    }

    public User update(User obj) {
      User newObj = repo.getReferenceById(obj.getId());
      upadateData(newObj, obj);
      return repo.save(newObj);
    }

    private void upadateData(User newObj, User obj) {
        newObj.setId(obj.getId());
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public void delete (String id){
        findById(id);
        if (id == null) {
            throw new ObjectNotFoundException("Objeto não encontrado");
          }
        repo.deleteById(id);
    
    }

    public User fromDTO(UserDTO objtDto) {
        return new User(objtDto.getId(),objtDto.getName(),objtDto.getEmail());
    }
}
