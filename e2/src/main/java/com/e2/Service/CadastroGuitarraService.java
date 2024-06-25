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

    // public List<Guitarra> buscarGuitarras() {
    //     banco.conectarBanco();
    //     List<Guitarra> guitarras = banco.buscarGuitarrasNoBanco();
    //     banco.fecharConexao();
    //     return guitarras;
    // }

    // public void atualizarGuitarra(Guitarra guitarra) {
    //     banco.conectarBanco();
    //     banco.atualizarGuitarraNoBanco(guitarra);
    //     banco.fecharConexao();
    // }

    // public void deletarGuitarra(Guitarra guitarra) {
    //     banco.conectarBanco();
    //     banco.deletarGuitarraNoBanco(guitarra);
    //     banco.fecharConexao();
    // }
}
