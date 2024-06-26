package com.e2.Service;

import com.e2.Database.Database;
import com.e2.Model.Guitarra;

public class CadastroGuitarraService {

    private Database banco = new Database();

    public void cadastrarGuitarra(Guitarra guitarra) {
        banco.conectarBanco();
        banco.cadastrarGuitarraNoBanco(guitarra);
        banco.fecharConexao();
    }
}
