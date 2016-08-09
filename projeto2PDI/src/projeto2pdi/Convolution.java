package projeto2pdi;

    
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Arrays;

public class Convolution {   


    public static BufferedImage convMascara(BufferedImage img, double[][] h1) {
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        //System.out.println("Dimensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);

                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }

                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
    
        
        //Gambiarra para nao mexer na imagem original
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
    }


    //relevo 1
    public static BufferedImage convRelevo1(BufferedImage img) {
        double[][] h1= new double[3][3];
        
        h1[0][0]= (double)0;
        h1[0][1]= (double)0;
        h1[0][2]= (double)0;
        
        h1[1][0]= (double)0;
        h1[1][1]= (double)1;
        h1[1][2]= (double)0;
        
        h1[2][0]= (double)0;
        h1[2][1]= (double)0;
        h1[2][2]= (double)-1;
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        System.out.println("Domensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);

                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }

                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
        
        
        //Gambiarra para nao mexer na imagem original
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
    }
    
    //relevo 2
    public static BufferedImage convRelevo2(BufferedImage img) {
        double[][] h1= new double[3][3];
        
        h1[0][0]= (double)0;
        h1[0][1]= (double)0;
        h1[0][2]= (double)-1;
        
        h1[1][0]= (double)0;
        h1[1][1]= (double)1;
        h1[1][2]= (double)0;
        
        h1[2][0]= (double)0;
        h1[2][1]= (double)0;
        h1[2][2]= (double)0;
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        System.out.println("Domensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);

                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }

                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
        
        
        //Gambiarra para nao mexer na imagem original
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
    }
    
    //relevo 3
    public static BufferedImage convRelevo3(BufferedImage img) {
        double[][] h1= new double[3][3];
        
        h1[0][0]= (double)0;
        h1[0][1]= (double)0;
        h1[0][2]= (double)2;
        
        h1[1][0]= (double)0;
        h1[1][1]= (double)-1;
        h1[1][2]= (double)0;
        
        h1[2][0]= (double)-1;
        h1[2][1]= (double)0;
        h1[2][2]= (double)0;
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        System.out.println("Domensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);

                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }

                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
        
        
        //Gambiarra para nao mexer na imagem original
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
    }
    
    //bordas 1
    public static BufferedImage convBordas1(BufferedImage img) {
        double[][] h1= new double[3][3];
        
        h1[0][0]= (double)-1/8;
        h1[0][1]= (double)-1/8;
        h1[0][2]= (double)-1/8;
        
        h1[1][0]= (double)-1/8;
        h1[1][1]= (double)1;
        h1[1][2]= (double)-1/8;
        
        h1[2][0]= (double)-1/8;
        h1[2][1]= (double)-1/8;
        h1[2][2]= (double)-1/8;
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        System.out.println("Domensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);

                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }

                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
        
        
        //Gambiarra para nao mexer na imagem original
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
    }
    
    //bordas 4
    public static BufferedImage convBordas4(BufferedImage img) {
        double[][] h1= new double[3][3];
        
        h1[0][0]= (double)-1;
        h1[0][1]= (double)-1;
        h1[0][2]= (double)0;
        
        h1[1][0]= (double)-1;
        h1[1][1]= (double)0;
        h1[1][2]= (double)1;
        
        h1[2][0]= (double)0;
        h1[2][1]= (double)1;
        h1[2][2]= (double)1;
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        System.out.println("Domensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);

                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }

                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
        
        
        //Gambiarra para nao mexer na imagem original
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
    }
    
    //gaussiano
    public static BufferedImage convGauss(BufferedImage img) {
        double[][] h1= Calculos.Gaussian(0.2);
        
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        System.out.println("Domensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);

                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }

                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
        
        
        //Gambiarra para nao mexer na imagem original
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
    }
    
    //media
    public static BufferedImage convMedia(BufferedImage img,double M,double N) {
        double[][] h1= new double[3][3];
        h1[0][0]= (double)1/(M*N);
        h1[0][1]= (double)1/(M*N);
        h1[0][2]= (double)1/(M*N);
        
        h1[1][0]= (double)1/(M*N);
        h1[1][1]= (double)1/(M*N);
        h1[1][2]= (double)1/(M*N);
        
        h1[2][0]= (double)1/(M*N);
        h1[2][1]= (double)1/(M*N);
        h1[2][2]= (double)1/(M*N);
        
        
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        System.out.println("Domensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);

                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }

                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
        
        
        //Gambiarra para nao mexer na imagem original
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
    }
    
    //borda 2
    public static BufferedImage convBordas2(BufferedImage img) {
        double[][] h1= new double[3][3];
        
        h1[0][0]= (double)-1;
        h1[0][1]= (double)-1;
        h1[0][2]= (double)-1;
        
        h1[1][0]= (double)0;
        h1[1][1]= (double)0;
        h1[1][2]= (double)0;
        
        h1[2][0]= (double)1;
        h1[2][1]= (double)1;
        h1[2][2]= (double)1;
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        System.out.println("Domensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);

                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }

                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
        
        
        //Gambiarra para nao mexer na imagem original
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
    }
   
    //borda 3
    public static BufferedImage convBordas3(BufferedImage img) {
        double[][] h1= new double[3][3];
        
        h1[0][0]= (double)-1;
        h1[0][1]= (double)0;
        h1[0][2]= (double)1;
        
        h1[1][0]= (double)-1;
        h1[1][1]= (double)0;
        h1[1][2]= (double)1;
        
        h1[2][0]= (double)-1;
        h1[2][1]= (double)0;
        h1[2][2]= (double)1;
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        System.out.println("Domensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);
                           
                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }

                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
        
        
        //Gambiarra para nao mexer na imagem original
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
    }
  

    public static BufferedImage convAgucamento1(BufferedImage img, double c, double d) {
        double[][] h1= new double[3][3];
        
        h1[0][0]= (double)0;
        h1[0][1]= (double)-c;
        h1[0][2]= (double)0;
        
        h1[1][0]= (double)-c;
        h1[1][1]= (double)4*c+d;
        h1[1][2]= (double)-c;
        
        h1[2][0]= (double)0;
        h1[2][1]= (double)-c;
        h1[2][2]= (double)0;
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        System.out.println("Domensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);

                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }
                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
      
    }
    
    
    public static BufferedImage convAgucamento2(BufferedImage img, double c, double d) {
        double[][] h1= new double[3][3];
        
        h1[0][0]= (double)-c;
        h1[0][1]= (double)-c;
        h1[0][2]= (double)-c;
        
        h1[1][0]= (double)-c;
        h1[1][1]= (double)8*c+d;
        h1[1][2]= (double)-c;
        
        h1[2][0]= (double)-c;
        h1[2][1]= (double)-c;
        h1[2][2]= (double)-c;
        
        int largura = img.getWidth();
        int altura = img.getHeight();
        System.out.println("Domensoes: "+largura+"x"+altura);     // Debugando
        BufferedImage nova  = new BufferedImage(largura, altura, 1);
        
        double somaR, somaG, somaB;
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                somaR = 0;
                somaG = 0;
                somaB = 0;
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                for(int a=i-1; a<=i+1 ;a++,p++){
                    int q=0;
                    for(int b=j-1; b<=j+1 ;b++,q++){

                        int[] rebatimento = Calculos.rebatimento(a,b,largura,altura);
                        int m = rebatimento[0];
                        int n = rebatimento[1];
                        int rgb1 = img.getRGB(m,n);

                        r1 = ((rgb1&0x00FF0000)>>>16);
                        g1 = ((rgb1&0x0000FF00)>>> 8);
                        b1 = (rgb1& 0x000000FF);
                        somaR += r1 * h1[p][q];
                        somaG += g1 * h1[p][q];
                        somaB += b1 * h1[p][q];
                    }
                }
                if(somaR>255){
                    somaR = 255;
                }
                if(somaR<0){
                    somaR = 0;
                }
                if(somaG>255){
                    somaG = 255;
                }
                if(somaG<0){
                    somaG = 0;
                }
                if(somaB>255){
                    somaB = 255;
                }
                if(somaB<0){
                    somaB = 0;
                }
                Color color = new Color( (int)somaR, (int)somaG, (int)somaB);
                nova.setRGB(i, j, color.getRGB());
            }
        }
        
        for (int i = 0;i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                
                int indice = 0, r1=0, g1=0, b1=0, p=0;
                
                            int rgb1 = nova.getRGB(i, j);
                            r1 = ((rgb1&0x00FF0000)>>>16);
                            g1 = ((rgb1&0x0000FF00)>>> 8);
                            b1 = (rgb1 & 0xFF);

                Color color = new Color(r1,g1,b1);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
      
    }
    
    
    
}
