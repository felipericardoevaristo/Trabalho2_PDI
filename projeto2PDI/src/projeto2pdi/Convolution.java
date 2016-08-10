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
    
    //mediana
    public static void convMediana(BufferedImage image, int M, int N){
        int width = image.getWidth(); //Largura da imagem
        int height = image.getHeight(); //Altura da imagem
        int r[] = new int[M*N], g[] = new int[M*N], b[] = new int[M*N], //Vetores com tamanho nxn que guardarão as componentes r, g e b a cada iteração
            i2=0, j2=0, cont; //Variáveis auxiliares, servem para varrer o pixel central e seus vizinhos
        Color rgb; //Cor a ser setada na imagem

        //Varre a imagem inteira
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                //A cada pixel visitado, zera o contador para poder visitá-lo, visitar seus vizinhos e em seguida calcular a mediana
                cont = 0;                 
                //Varre o elemento do meio e seus vizinhos
                for(i2=i-(M/2); i2 <= i+(M/2); i2++){
                    for(j2=j-(N/2); j2 <= j+(N/2); j2++){
                        //Se algum dos vizinhos estiver fora dos limites da imagem, seu pixel receberá 0 para r, g e b
                        try{
                            r[cont] = new Color(image.getRGB(i2, j2)).getRed();
                            g[cont] = new Color(image.getRGB(i2, j2)).getGreen();
                            b[cont] = new Color(image.getRGB(i2, j2)).getBlue();
                            cont++;
                        }
                        catch(ArrayIndexOutOfBoundsException e){
                            r[cont] = g[cont] = b[cont] = 0;
                        }
                    }
                }           
                Arrays.sort(r); Arrays.sort(g); Arrays.sort(b); //Ordena o vetor com o pixel e seus vizinhos
                rgb = new Color(r[r.length/2], g[g.length/2], b[b.length/2]); //Calcula a mediana para cada componente e atribui a cor
                image.setRGB(i, j, rgb.getRGB()); //Insere a cor no pixel do meio
            }
        }
    
    }

    //media
    public static void convMedia(BufferedImage img, int M, int N) {
        int width = img.getWidth(); //Largura da imagem
        int height = img.getHeight(); //Altura da imagem
        int r, g, b, //Componentes de cor
            i2=0, j2=0; //Variáveis auxiliares, servem para varrer o pixel central e seus vizinhos
        Color rgb; //Cor a ser setada na imagem

        //Varre a imagem inteira
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                //A cada pixel visitado, zera os elementos de cor para não usar lixo da iteração anterior
                r = g = b = 0;
                //Varre o elemento do meio e seus vizinhos
                for(i2=i-(M/2); i2 <= i+(M/2); i2++){
                    for(j2=j-(N/2); j2 <= j+(N/2); j2++){
                        //Se algum dos vizinhos estiver fora dos limites da imagem, suas componentes adicionarão 0, ou simplemente não haverá processamento
                        try{
                            r += new Color(img.getRGB(i2, j2)).getRed();
                            g += new Color(img.getRGB(i2, j2)).getGreen();
                            b += new Color(img.getRGB(i2, j2)).getBlue();
                        }
                        catch(ArrayIndexOutOfBoundsException e){
                            //r += 0; g += 0; b += 0; // Processamento desnecessário
                        }
                    }
                }           
                r /= (M*N); g /= (M*N); b /= (M*N); //Após a soma, calcula-se a média
                rgb = new Color(r, g, b);
                img.setRGB(i, j, rgb.getRGB()); //Insere a cor no pixel do meio
            }
        }
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
