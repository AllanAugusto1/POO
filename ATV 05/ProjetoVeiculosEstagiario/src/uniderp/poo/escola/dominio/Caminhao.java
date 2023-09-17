package uniderp.poo.escola.dominio;

public class Caminhao extends Veiculo{
    public int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    public Caminhao(){

    }
    public Caminhao(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
    int anoFabricacao, int eixos, double pesoLiquido, double pesoTotal, int assentos, int rodas,
    String fabricante, double potencia, String tipoCombustivel, String nomeProprietario, String estadoUF,
    String cidadeUF, String tipoVeiculo, int qtdeMorotes, int qtdeOcupantes, String codigoRenavam, int portas){
       
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, eixos, pesoLiquido, pesoTotal,
                assentos, rodas, fabricante, potencia, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF,
                tipoVeiculo, qtdeMorotes, qtdeOcupantes);

                this.portas = portas;
    }
}
