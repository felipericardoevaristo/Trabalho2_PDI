package projeto2pdi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ProjetoPDI {
    private static BufferedImage NULL;
 
    public static void main(String[] args) throws IOException {

        try {
            BufferedImage im1 = ImageIO.read(new File("src/lena200.jpg"));
            BufferedImage im2 = ImageIO.read(new File("src/lena200.jpg"));
            
            
            String valor;
            int result;
        
            
            valor=JOptionPane.showInputDialog("\n1- Media de Pilha\n2- Mediana de Pilha\n3- Moda na Pilha\n");
            Filtro Filtro = new Filtro();
            result= Integer.parseInt(valor);
            BufferedImage imagem2=NULL;

            switch(result){
                
                case 1: // DCT
                        break;
                case 2: // IDCT
                        break;
                default:
                        JOptionPane.showInputDialog("Valor Inválido!");
            }
            
            ImageIO.write(imagem2,"jpg",new File("src/Resultado.jpg"));
            Exibicao.exibirImagem(im2, imagem2);
            System.out.println("Filtro aplicado com sucesso!");

        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Erro! Verifique se o arquivo especificado existe e tente novamente.");
        }
        catch(Exception e){
            System.out.println("Erro! !" + e.getMessage());
            e.printStackTrace();
        }
    }
 
}