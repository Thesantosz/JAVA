public class relacaoAluno {

    public static String calcularDescanso(Aluno aluno ){

        if(aluno.getCansaco() <= 20){
            return "Descanso diario suficiente: O aluno esta bem;";
        } else if(aluno.getCansaco() <= 50){
            return "Descaso nos fins de semana é suficiente: O aluno esta moderado";
        } else if(aluno.getCansaco() <= 80){
            return "Férias são necessarias!O aluno esta cansado";
        } else{
            return "ALERTA DE EXAUSTAO";
        }  }

}
