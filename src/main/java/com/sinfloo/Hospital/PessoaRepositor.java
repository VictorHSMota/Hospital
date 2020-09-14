package com.sinfloo.Hospital;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import java.util.List;





import java.util.List;

public interface PessoaRepositor extends CrudRepository<Pessoa, Long> {
    List<Pessoa> findByAge(int id);
}
