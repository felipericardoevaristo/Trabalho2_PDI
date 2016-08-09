/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2pdi;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Arrays;

public class Pilha {
    public static BufferedImage NULL;
    
    public static int media(int[] ar){
        int media = 0;
        for( int i=0; i<ar.length; i++){
            media = media+ar[i];
        }
        media = media/ar.length;
        return 0;
    }
    public static BufferedImage pilhaMedia( BufferedImage i0,BufferedImage i1,BufferedImage i2,BufferedImage i3,
                           BufferedImage i4,BufferedImage i5,BufferedImage i6,BufferedImage i7,BufferedImage i8){
        
        int largura = i1.getWidth();
        int altura = i1.getHeight();
        BufferedImage result = new BufferedImage(largura, altura, 1);
        int[] vetor = new int[9];
        int[] vetorR = new int[9];
        int[] vetorG = new int[9];
        int[] vetorB = new int[9];
        
        for( int i=0; i<largura; i++){
            for( int j=0; j<altura; j++){
                
                vetor[0] = i0.getRGB(i, j);
                vetorR[0] = (int)((vetor[0]&0x00FF0000)>>>16);
                vetorG[0] = (int)((vetor[0]&0x0000FF00)>>>8);
                vetorB[0] = (int)( vetor[0]&0x000000FF);
                
                vetor[1] = i1.getRGB(i, j);
                vetorR[1] = (int)((vetor[1]&0x00FF0000)>>>16);
                vetorG[1] = (int)((vetor[1]&0x0000FF00)>>>8);
                vetorB[1] = (int)( vetor[1]&0x000000FF);
                
                vetor[2] = i2.getRGB(i, j);
                vetorR[2] = (int)((vetor[2]&0x00FF0000)>>>16);
                vetorG[2] = (int)((vetor[2]&0x0000FF00)>>>8);
                vetorB[2] = (int)( vetor[2]&0x000000FF);
                
                vetor[3] = i3.getRGB(i, j);
                vetorR[3] = (int)((vetor[3]&0x00FF0000)>>>16);
                vetorG[3] = (int)((vetor[3]&0x0000FF00)>>>8);
                vetorB[3] = (int)( vetor[3]&0x000000FF);
                
                vetor[4] = i4.getRGB(i, j);
                vetorR[4] = (int)((vetor[4]&0x00FF0000)>>>16);
                vetorG[4] = (int)((vetor[4]&0x0000FF00)>>>8);
                vetorB[4] = (int)( vetor[4]&0x000000FF);
                
                vetor[5] = i5.getRGB(i, j);
                vetorR[5] = (int)((vetor[5]&0x00FF0000)>>>16);
                vetorG[5] = (int)((vetor[5]&0x0000FF00)>>>8);
                vetorB[5] = (int)( vetor[5]&0x000000FF);
                
                vetor[6] = i6.getRGB(i, j);
                vetorR[6] = (int)((vetor[6]&0x00FF0000)>>>16);
                vetorG[6] = (int)((vetor[6]&0x0000FF00)>>>8);
                vetorB[6] = (int)( vetor[6]&0x000000FF);
                
                vetor[7] = i7.getRGB(i, j);
                vetorR[7] = (int)((vetor[7]&0x00FF0000)>>>16);
                vetorG[7] = (int)((vetor[7]&0x0000FF00)>>>8);
                vetorB[7] = (int)( vetor[7]&0x000000FF);
                
                vetor[8] = i8.getRGB(i, j);
                vetorR[8] = (int)((vetor[8]&0x00FF0000)>>>16);
                vetorG[8] = (int)((vetor[8]&0x0000FF00)>>>8);
                vetorB[8] = (int)( vetor[8]&0x000000FF);
                
                int medR = 0;
                int medG = 0;
                int medB = 0;
                
                for( int k=0; k<9; k++){
                    medR = medR + vetorR[k];
                    medG = medG + vetorG[k];
                    medB = medB + vetorB[k];
                }
                
                medR = medR/9;
                medG = medG/9;
                medB = medB/9;
                
                
                Color color = new Color(medR, medG, medB);
                result.setRGB(i, j, color.getRGB());
            }
        }
        return result;
    }
    
    
    
    
    public static BufferedImage pilhaMediana( BufferedImage i0,BufferedImage i1,BufferedImage i2,BufferedImage i3,
                           BufferedImage i4,BufferedImage i5,BufferedImage i6,BufferedImage i7,BufferedImage i8){
        
        int largura = i1.getWidth();
        int altura = i1.getHeight();
        BufferedImage result = new BufferedImage(largura, altura, 1);
        int[] vetor = new int[9];
        int[] vetorR = new int[9];
        int[] vetorG = new int[9];
        int[] vetorB = new int[9];
        
        for( int i=0; i<largura; i++){
            for( int j=0; j<altura; j++){
                
                vetor[0] = i0.getRGB(i, j);
                vetorR[0] = (int)((vetor[0]&0x00FF0000)>>>16);
                vetorG[0] = (int)((vetor[0]&0x0000FF00)>>>8);
                vetorB[0] = (int)( vetor[0]&0x000000FF);
                
                vetor[1] = i1.getRGB(i, j);
                vetorR[1] = (int)((vetor[1]&0x00FF0000)>>>16);
                vetorG[1] = (int)((vetor[1]&0x0000FF00)>>>8);
                vetorB[1] = (int)( vetor[1]&0x000000FF);
                
                vetor[2] = i2.getRGB(i, j);
                vetorR[2] = (int)((vetor[2]&0x00FF0000)>>>16);
                vetorG[2] = (int)((vetor[2]&0x0000FF00)>>>8);
                vetorB[2] = (int)( vetor[2]&0x000000FF);
                
                vetor[3] = i3.getRGB(i, j);
                vetorR[3] = (int)((vetor[3]&0x00FF0000)>>>16);
                vetorG[3] = (int)((vetor[3]&0x0000FF00)>>>8);
                vetorB[3] = (int)( vetor[3]&0x000000FF);
                
                vetor[4] = i4.getRGB(i, j);
                vetorR[4] = (int)((vetor[4]&0x00FF0000)>>>16);
                vetorG[4] = (int)((vetor[4]&0x0000FF00)>>>8);
                vetorB[4] = (int)( vetor[4]&0x000000FF);
                
                vetor[5] = i5.getRGB(i, j);
                vetorR[5] = (int)((vetor[5]&0x00FF0000)>>>16);
                vetorG[5] = (int)((vetor[5]&0x0000FF00)>>>8);
                vetorB[5] = (int)( vetor[5]&0x000000FF);
                
                vetor[6] = i6.getRGB(i, j);
                vetorR[6] = (int)((vetor[6]&0x00FF0000)>>>16);
                vetorG[6] = (int)((vetor[6]&0x0000FF00)>>>8);
                vetorB[6] = (int)( vetor[6]&0x000000FF);
                
                vetor[7] = i7.getRGB(i, j);
                vetorR[7] = (int)((vetor[7]&0x00FF0000)>>>16);
                vetorG[7] = (int)((vetor[7]&0x0000FF00)>>>8);
                vetorB[7] = (int)( vetor[7]&0x000000FF);
                
                vetor[8] = i8.getRGB(i, j);
                vetorR[8] = (int)((vetor[8]&0x00FF0000)>>>16);
                vetorG[8] = (int)((vetor[8]&0x0000FF00)>>>8);
                vetorB[8] = (int)( vetor[8]&0x000000FF);
                
                Arrays.sort(vetorR);
                Arrays.sort(vetorG);
                Arrays.sort(vetorB);
                
                Color color = new Color(vetorR[4], vetorG[4], vetorB[4]);
                result.setRGB(i, j, color.getRGB());
            }
        }
        return result;
    }

    public static BufferedImage pilhaModa( BufferedImage i0,BufferedImage i1,BufferedImage i2,BufferedImage i3,
                           BufferedImage i4,BufferedImage i5,BufferedImage i6,BufferedImage i7,BufferedImage i8){
        
        int largura = i1.getWidth();
        int altura = i1.getHeight();
        BufferedImage result = new BufferedImage(largura, altura, 1);
        int[] vetor = new int[9];
        int[] vetorR = new int[9]; // vetor que guarda valores de R da pilha (coluna de pixels)
        int[] vetorG = new int[9]; // vetor que guarda valores de R da pilha (coluna de pixels)
        int[] vetorB = new int[9]; // vetor que guarda valores de R da pilha (coluna de pixels)
        
        for( int i=0; i<largura; i++){
            for( int j=0; j<altura; j++){
                
                
                // separação em componentes baseada em cores 32-bits e deslocamento de bytes
                vetor[0] = i0.getRGB(i, j);// pega cor da imagem
                vetorR[0] = (int)((vetor[0]&0x00FF0000)>>>16); // separa banda R
                vetorG[0] = (int)((vetor[0]&0x0000FF00)>>>8); // separa banda G
                vetorB[0] = (int)( vetor[0]&0x000000FF); // separa banda B
                
                vetor[1] = i1.getRGB(i, j);
                vetorR[1] = (int)((vetor[1]&0x00FF0000)>>>16);
                vetorG[1] = (int)((vetor[1]&0x0000FF00)>>>8);
                vetorB[1] = (int)( vetor[1]&0x000000FF);
                
                vetor[2] = i2.getRGB(i, j);
                vetorR[2] = (int)((vetor[2]&0x00FF0000)>>>16);
                vetorG[2] = (int)((vetor[2]&0x0000FF00)>>>8);
                vetorB[2] = (int)( vetor[2]&0x000000FF);
                
                vetor[3] = i3.getRGB(i, j);
                vetorR[3] = (int)((vetor[3]&0x00FF0000)>>>16);
                vetorG[3] = (int)((vetor[3]&0x0000FF00)>>>8);
                vetorB[3] = (int)( vetor[3]&0x000000FF);
                
                vetor[4] = i4.getRGB(i, j);
                vetorR[4] = (int)((vetor[4]&0x00FF0000)>>>16);
                vetorG[4] = (int)((vetor[4]&0x0000FF00)>>>8);
                vetorB[4] = (int)( vetor[4]&0x000000FF);
                
                vetor[5] = i5.getRGB(i, j);
                vetorR[5] = (int)((vetor[5]&0x00FF0000)>>>16);
                vetorG[5] = (int)((vetor[5]&0x0000FF00)>>>8);
                vetorB[5] = (int)( vetor[5]&0x000000FF);
                
                vetor[6] = i6.getRGB(i, j);
                vetorR[6] = (int)((vetor[6]&0x00FF0000)>>>16);
                vetorG[6] = (int)((vetor[6]&0x0000FF00)>>>8);
                vetorB[6] = (int)( vetor[6]&0x000000FF);
                
                vetor[7] = i7.getRGB(i, j);
                vetorR[7] = (int)((vetor[7]&0x00FF0000)>>>16);
                vetorG[7] = (int)((vetor[7]&0x0000FF00)>>>8);
                vetorB[7] = (int)( vetor[7]&0x000000FF);
                
                vetor[8] = i8.getRGB(i, j);
                vetorR[8] = (int)((vetor[8]&0x00FF0000)>>>16);
                vetorG[8] = (int)((vetor[8]&0x0000FF00)>>>8);
                vetorB[8] = (int)( vetor[8]&0x000000FF);
                

                
                int camada = Calculos.moda(vetorB); // TESTE
                
                Color color = new Color(vetorR[camada],vetorG[camada],vetorB[camada]); // TESTE
                //Color color = new Color(vetorR[Moda.calculo(vetorR)],vetorG[Moda.calculo(vetorG)],vetorB[Moda.calculo(vetorB)]);
                result.setRGB(i, j, color.getRGB());
            }
        }
        return result;
    }

}