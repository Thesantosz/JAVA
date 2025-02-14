import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class relacaoAlunoTest {
    private Aluno aluno1, aluno2, aluno3, aluno4;

    @BeforeEach
    public void setup() {
//Este metodo é executado antes de cada teste. Ele prepara os objetos necessarios
// para o teste

        System.out.printf("CRIANDO NOVOS ALUNOS...");

        aluno1 = new Aluno("Neymar", 80.0);
        aluno2 = new Aluno("Crstovao",10.0);
        aluno3 = new Aluno("ney",20.0);
        aluno4 = new Aluno("Leleo", 90.0);
    }

    @Test
    public void  testDescansoSuficiente(){
        System.out.printf("Testando descanso suficiente...");
        String descanso = relacaoAluno.calcularDescanso(aluno1);
        assertEquals("Férias sao necessarias!", descanso, "Esperando descanso de ferias é suficiente";
    }

}
