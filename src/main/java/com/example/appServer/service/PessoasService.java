package com.example.appServer.service;

import com.example.appServer.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PessoasService {

    private final ArrayList<Pessoa> pessoas;

    public PessoasService() {
        pessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa();
        p1.setCpf("12312312311");
        p1.setIdade(15);
        p1.setName("Nome1");
        p1.setSobrenome("Sobrenome1");
        pessoas.add(p1);

        Pessoa p2 = new Pessoa();
        p2.setCpf("12312312312");
        p2.setIdade(14);
        p2.setName("Nome2");
        p2.setSobrenome("Sobrenome2");
        pessoas.add(p2);

        Pessoa p3 = new Pessoa();
        p3.setCpf("12312312313");
        p3.setIdade(13);
        p3.setName("Nome3");
        p3.setSobrenome("Sobrenome3");
        pessoas.add(p3);
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public Pessoa getPessoa(String cpf) {
        for(Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    public boolean removePessoa(String cpf) {
        Pessoa pessoa = null;
        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                pessoa = p;
            }
        }

        if (pessoa != null) {
            pessoas.remove(pessoa);
            return true;
        }

        return false;
    }
}
