package com.e2.Service;

import java.util.List;

import com.e2.Database.Database;
import com.e2.Model.Guitarra;

public class ProdutosService {

    private Database banco = new Database();

    public List<Guitarra> buscarGuitarras() {
        banco.conectarBanco();
        List<Guitarra> listaGuitarras = banco.buscarGuitarrasNoBanco();
        banco.fecharConexao();
        return listaGuitarras;
    }

    public void atualizarGuitarra(int id, String valor) {
        banco.conectarBanco();
        banco.atualizarGuitarraNoBanco(id, valor);
        banco.fecharConexao();
    }

    public void deletarGuitarra(Guitarra guitarra) {
        banco.conectarBanco();
        banco.deletarGuitarraNoBanco(guitarra);
        banco.fecharConexao();
    }
}
