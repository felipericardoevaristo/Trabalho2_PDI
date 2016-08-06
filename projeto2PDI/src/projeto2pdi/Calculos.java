package projeto2pdi;

import java.awt.image.BufferedImage;

public class Calculos {

//Metodo que recebe um vetor desordenado e retorna o indice
//de uma das aparições do valor mais repetido...
    public static int moda(int[] v){
        int i,j;
        
        //O vetor abaixo conta o numero de aparições de cada posição do array v[]
        //EXEMPLO: se o numero contido em v[2] se repete 5 vezes então "repete[]"
        // vai ter 5 em cada posição onde a parece o valor de v[2]....
        int[] repete = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        
        // laço for faz a contagem e guarda o numero de repetições em "repete[valor verificado]"
        for( i=0; i<9; i++){
            for(j=0; j<9; j++){
                if(v[i]==v[j]){
                    ++repete[i];
                }
            }
        }
        int nVezesAparece = repete[0]; // integer que guarda maior numero de aparições - inciado com o primeiro 
        int profundidade = 0; // integer que guarda o indice do array (profundidade na pilha) com mario repetição
        
        // laço que varre o vetor "Repete[]" em busca do maior numero de repetições
        for(j=0; j<9; j++){
            if(repete[j] > nVezesAparece){
                nVezesAparece = repete[j];
                profundidade = j;
            }
        }

        return profundidade;
    }
    
    public static int[] rebatimento(int a, int b, int largura, int altura){
        int[] result = new int[2];
        
        if(a<0 || b<0 || a>largura-1 || b>altura-1){
                            if(a<0 && b<0){
                                int m = -a;
                                int n = -b;
                                result[0] = m;
                                result[1] = n;

                            }else{
                                if(a<0){
                                    int m = -a;
                                    int n;
                                    if(b>altura-1){
                                        n = altura-2;
                                    }else{
                                        n=b;
                                    }
                                    result[0] = m;
                                    result[1] = n;
                                }
                                if(b<0){
                                    int n = -b;
                                    int m;
                                    if(a>largura-1){
                                        m = largura-2;
                                    }else{
                                        m=a;
                                    }
                                    result[0] = m;
                                    result[1] = n;
                                }
                            }
                            if(a>largura-1 && b>altura-1){
                                int m = largura-2;
                                int n = altura-2;
                                result[0] = m;
                                result[1] = n;
                            }else{
                                if(a>largura-1){
                                    int m = largura-2;
                                    int n;
                                    if(b<0){
                                        n = -b;
                                    }else{
                                        n=b;
                                    }
                                    result[0] = m;
                                    result[1] = n;
                                }
                                if(b>altura-1){
                                    int n = altura-2;
                                    int m;
                                    if(a<0){
                                        m = -a;
                                    }else{
                                        m=a;
                                    }
                                    result[0] = m;
                                    result[1] = n;
                                }
                            }
                        }else{
                                result[0] = a;
                                result[1] = b;
                        }
        
        return result;
    }
    
     private static double somatorioMatriz(double[][]m,int x,int y){
        int i,j;
        double s=0;

        for(i=0;i<x;i++){
            for(j=0;j<y;j++){
                s+=m[i][j];
            }
        }
        return s;
    }
    
    public static double[][] Gaussian(double desvioPadrao){
        int size = (int)(10*desvioPadrao) +1;

        if(size%2==0)size++;
        
        double[][] temp = new double[size][size];

        int x = (size - 1)/2;


        double raio, fator;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){

                raio = Math.sqrt(Math.pow(i-x, 2) + Math.pow(j-x, 2));
                
                if (raio > 5*desvioPadrao)
                    temp[i][j] = 0;
                else{
                    temp[i][j] = (1.0/(2.0 * Math.PI * Math.pow(desvioPadrao, 2)));
                    temp[i][j] *= Math.exp(- Math.pow(raio, 2)/(2 * Math.pow(desvioPadrao, 2)));
                }

            }
        }

        fator = 1.0/Calculos.somatorioMatriz(temp,size,size);
     
        double[][] gaussiana = new double[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                gaussiana[i][j] = fator * temp[i][j];
            }
        }

        return gaussiana;
    }


}
    
    

