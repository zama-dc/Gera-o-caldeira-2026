package exerc_4_screenmatch2.calculos;

public class FiltroRecomendacao {//se tem amis de 4 estrelas, ele está entre os preferidos
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >=4){//pego a média
            System.out.println("Está entre os preferidos o momento");
        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("Muito bem avaliado");
        }else{
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
