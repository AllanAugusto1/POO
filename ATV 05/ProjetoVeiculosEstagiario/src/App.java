import uniderp.poo.escola.dominio.Aviao;
import uniderp.poo.escola.dominio.Caminhao;
import uniderp.poo.escola.dominio.Carro;
import uniderp.poo.escola.dominio.Motocicleta;
import uniderp.poo.escola.dominio.Onibus;

public class App {
    public static void main(String[] args) throws Exception {
        Aviao a1 = new Aviao();
        Caminhao c1 = new Caminhao();
        Carro c2 = new Carro();
        Motocicleta m1 = new Motocicleta();
        Onibus o1 = new Onibus();

        a1.setModelo("Airbus A380");
        c1.setModelo("Volvo VNL 780");
        c2.setModelo("Audi A3");
        m1.setModelo("Triumph Thunderbird T6");
        o1.setModelo("p&d 4501 Cine Cruiser");

        System.out.println("--Modelo dos Veiculos--\n");
        System.out.printf("Aviao: %s\n ", a1.getModelo());
        System.out.printf("Caminhao: %s\n", c1.getModelo());
        System.out.printf("Carro: %s\n", c2.getModelo());
        System.out.printf("Motocicleta: %s\n", m1.getModelo());
        System.out.printf("Onibus: %s\n", o1.getModelo());
    }
}
