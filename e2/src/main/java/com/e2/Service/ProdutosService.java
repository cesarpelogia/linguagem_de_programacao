package com.e2.Service;

import java.sql.SQLException;
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

    public void atualizarGuitarra(Guitarra guitarra) throws SQLException {
        banco.conectarBanco();
        banco.atualizarGuitarraNoBanco(guitarra);
        banco.fecharConexao();
    }

    public void deletarGuitarra(Guitarra guitarra) {
        banco.conectarBanco();
        banco.deletarGuitarraNoBanco(guitarra);
        banco.fecharConexao();
    }
}
