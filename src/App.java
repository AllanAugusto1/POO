import java.time.LocalDate;

import uniderp.poo.escola.dominio.*;

public class App {
   
    public static void main(String[] args) throws Exception {

        Aluno c1 = new Aluno();
        c1.setCodigo(1);
        c1.setNome("Luiz");
        c1.setEndereco("rua tal, 10");
        c1.setTelefone("97873211");
        c1.setDataNascimento(LocalDate.of(2018, 07, 22));
        c1.setRg("123456789");
        c1.setCpf("98765432132");
        c1.setDataInsercao(LocalDate.now());
        c1.setMatricula("34562");
        c1.setDataMatricula(LocalDate.now());

        Aluno c2 = new Aluno(2, "Jesus", "Rua Galileia, 15", "321", LocalDate.of(0, 0, 0), "123", "321", LocalDate.now(),"78905", LocalDate.now());


        Professor c3 = new Professor();
        c3.setCodigo(1);
        c3.setNome("Luiza");
        c3.setEndereco("rua tale, 11");
        c3.setTelefone("97873221");
        c3.setDataNascimento(LocalDate.of(2018, 07, 22));
        c3.setRg("123456780");
        c3.setCpf("98765432133");
        c3.setDataInsercao(LocalDate.now());
        c3.setRegistro("34563");
        c3.setDataContratacao(LocalDate.now());

        Professor c4 = new Professor(2, "Maria", "Rua Galileiae, 16", "324", LocalDate.of(0, 0, 0), "124", "421", LocalDate.now(),"78906", LocalDate.now());

    }
}
