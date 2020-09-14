package com.sinfloo.Hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImp implements PessoaService {
    @Autowired
    private PessoaRepositor repositorio;

    @Override
    public List<Pessoa> listar() {
        return (List<Pessoa>) repositorio.findAll();
    }

    @Override
    public Pessoa listarId(int id) {
        return null;
    }

    @Override
    public Pessoa add(Pessoa p) {
        return null;
    }

    @Override
    public Pessoa edit(Pessoa p) {
        return null;
    }

    @Override
    public Pessoa delete(int id) {
        return null;
    }
}
