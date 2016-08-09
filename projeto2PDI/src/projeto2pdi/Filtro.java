package projeto2pdi;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Arrays;


public class Filtro {
    private static BufferedImage NULL;

    public static BufferedImage equalizacao(BufferedImage i1) {
        int largura = i1.getWidth();
        int altura = i1.getHeight();
        int histo[]=new int[256];
        BufferedImage i2= new BufferedImage(largura,altura,1);
        for (int I = 0;I < largura; I++) {
            for (int J = 0; J < altura; J++) {
                int r1=0;
                
                int rgb1 = i1.getRGB(I, J);
                r1 = ((rgb1&0x00FF0000)>>>16);
                             
                 histo[r1]++;
                    }
                }
        int total=0;
        int image2[]=new int[256];        
        for(int i=0;i<255;i++){
            for(int u=0;u<=i;u++){
                total+=histo[u];
                }
                int tamanho=largura*altura;
                image2[i]=(total*255)/(tamanho);
                
                System.out.println("image "+i+"= "+image2[i]+"| Tamanho  "+tamanho+"|  total  "+total);
                total=0;
        }
        int r1=0,r2=0;
        for (int I = 0;I < largura; I++) {
            for (int J = 0; J < altura; J++) {
                
                
                int rgb1 = i1.getRGB(I, J);
                r1 = ((rgb1&0x00FF0000)>>>16);
                if(r1>=255)
                   image2[r1]=255;
                int vendo=image2[r1];
                
                 Color color = new Color(vendo, vendo,vendo);
                 i1.setRGB(I, J, color.getRGB());
                 //int rgb2 = i2.getRGB(I, J);
                 //r2 = ((rgb2&0x00FF0000)>>>16);
                 
                 //System.out.println("Linha "+I+"Coluna "+J+" Valor Antigo"+r1+" Valor nova"+r2);
          }
        }
        return i1;
  }
    
    
 public static BufferedImage expansao(BufferedImage i1) {
        int largura = i1.getWidth();
        int altura = i1.getHeight();
        int histo[]=new int[256];
        BufferedImage i2= new BufferedImage(largura,altura,1);
        for (int I = 0;I < largura; I++) {
            for (int J = 0; J < altura; J++) {
                int r1=0;
                
                int rgb1 = i1.getRGB(I, J);
                r1 = ((rgb1&0x00FF0000)>>>16);
                            
                 histo[r1]++;
                    }
                }
        int total=0;
        int maior=1;
        int menor=2000;
        double image2[]=new double[256];        
        //Capturar o maior e o menor
        for(int i=0;i<255;i++){
                
                if(histo[i]>0 && i>maior)
                    maior=i;
                if(histo[i]>0 && i<menor)
                    menor=i;
                
        }
        System.out.println("Maior "+maior+" Menor "+menor);
        
        for(int i=0;i<255;i++){
                image2[i]=((i-menor)/(double)(maior-menor))*255;
                
        }
        
        int r1=0,r2=0;
        for (int I = 0;I < largura; I++) {
            for (int J = 0; J < altura; J++) {
                
                
                int rgb1 = i1.getRGB(I, J);
                r1 = ((rgb1&0x00FF0000)>>>16);
                if(r1>=255 || image2[r1]>=255)
                    image2[r1]=255;
                if(r1<=0 || image2[r1]<=0)
                    image2[r1]=0;
                
                int vendo=(int)image2[r1];
                
                //System.out.println("Original "+r1+" Novo "+vendo);
                 Color color = new Color(vendo, vendo,vendo);
                 i1.setRGB(I, J, color.getRGB());
                 
          }
        }
        
        return i1;
  }
  
 
 
  //pegar o novo
    public static BufferedImage media(BufferedImage i1, int n) {
        int largura = i1.getWidth();
        int altura = i1.getHeight();
        int borda = (n-1)/2;
        BufferedImage i2 = new BufferedImage(largura, altura, 1);
        
                int somaR, somaG, somaB;
        int margem = borda;
        int iMin, iMax, jMin, jMax;

        for (int I = 0;I < largura; I++) {
            for (int J = 0; J < altura; J++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                //System.out.println("- Linha="+I+" Coluna="+J+"\n"); // DEBUGANDO
                iMin = I - margem;
                iMax = I + margem;
                jMin = J - margem;
                jMax = J + margem;
                
                int indice = 0;
                int r1=0, g1=0, b1=0;
                for(int i = iMin; i <= iMax; i++){
                    //System.out.println("I="+i+"\n"); // DEBUGANDO
                    for(int j = jMin; j <= jMax; j++, indice++){
                        //System.out.println("indice="+indice+" J="+j+"\n"); // DEBUGANDO
                        
                        if(i>=0 && j>=0 && i<largura && j<altura){
                            int rgb1 = i1.getRGB(i, j);
            
                          
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                            somaR = somaR + r1;
                            somaG = somaG + g1;
                            somaB = somaB + b1;
                        }else{
                            somaR = somaR + 0;
                            somaG = somaG + 0;
                            somaB = somaB + 0;
                        }
                    }
                }
                int r2 = somaR/(n*n);
                int g2 = somaG/(n*n);
                int b2 = somaB/(n*n);
                Color color = new Color(r2, g2, b2);
                i2.setRGB(I, J, color.getRGB());
            }
        }
        return i2;
    }
    
    //pegar o novo
    public static BufferedImage mediana(BufferedImage i1, int n) {
        if((n<3)||((n%2)==0)){ //se a mascara tiver lado PAR ou menor que 3 -> retorna NULL 
            System.out.println("Escolha uma mascara com lado de tamanho impar, maior ou igual 3.");
            return NULL;
        }else{
            System.out.println("<> Aplicando Filtro...");
        }
        int largura = i1.getWidth();
        int altura = i1.getHeight();
        int termoMedio;
        int borda = (n-1)/2;
        termoMedio = (((n*n)-1)/2);
        BufferedImage i2 = new BufferedImage(largura, altura, 1);
        int[] vetorR;
        int[] vetorG;
        int[] vetorB;
        vetorR = new int[n*n];
        vetorG = new int[n*n];
        vetorB = new int[n*n];
        
        int iMin, iMax, jMin, jMax;
        for (int I = 0;I < largura; I++) { // I e J são os pixels da imagem que 
                                           //estão sendo varridos nestes laços aninhados
            
            for (int J = 0; J < altura; J++) {
                //System.out.println("- Linha="+I+" Coluna="+J+"\n"); // DEBUGANDO
                iMin = I - borda;
                iMax = I + borda;
                jMin = J - borda;
                jMax = J + borda;
                
                int indice = 0; // variavel que representa o indice de para gravar valores no array
                int r1=0, g1=0, b1=0;
                for(int i = iMin; i <= iMax; i++){ // i e j minúsculos representam pixels da vizinhança
                    //System.out.println("i="+i+"\n"); // DEBUGANDO
                    for(int j = jMin; j <= jMax; j++, indice++){
                        //System.out.println("indice="+indice+" j="+j+"\n"); // DEBUGANDO
                        
                        if(i>=0 && j>=0 && i<largura && j<altura){
                            int rgb1 = i1.getRGB(i, j);
            
                            r1 = (int)((rgb1&0x00FF0000)>>>16); //R
                            g1 = (int)((rgb1&0x0000FF00)>>>8);  //G
                            b1 = (int) (rgb1&0x000000FF);       //B
                            
                            vetorR[indice] = r1;
                            vetorG[indice] = g1;
                            vetorB[indice] = b1;
                        }else{ // para não captar pixel fora do alcance da imagem atribui-se ZERO!
                            vetorR[indice] = 0;
                            vetorG[indice] = 0;
                            vetorB[indice] = 0;
                        }
                    }
                }
                Arrays.sort(vetorR);
                Arrays.sort(vetorG);
                Arrays.sort(vetorB);
                 // DEBUGANDO
/*                System.out.println("Vetor"); // DEBUGANDO
                for(int G =0; G < (n*n); G++){ // DEBUGANDO
                    System.out.print("("+G+") "+vetorR[G]+", "); // DEBUGANDO
                } // DEBUGANDO
                System.out.println("\ntermo medio = "+vetorR[termoMedio]+"\n\n"); // DEBUGANDO
                */ // DEBUGANDO
                r1 = vetorR[termoMedio];
                g1 = vetorG[termoMedio];
                b1 = vetorB[termoMedio];
                Color color = new Color(r1, g1, b1);
                i2.setRGB(I, J, color.getRGB());
            }
        }
        return i2;
    }
    
  
}    