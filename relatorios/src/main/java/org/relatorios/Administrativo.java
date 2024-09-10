package org.relatorios;

public class Administrativo extends Relatorio{

    public Administrativo(String relatorioSetor) {
        super(relatorioSetor);
    }

    public String relatorioInfo() {
        return this.linguas.relatorioLinguas();
    }
}
