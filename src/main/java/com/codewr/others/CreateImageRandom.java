/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.others;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author NXCOMM
 */
public class CreateImageRandom {

    public static void main(String args[]) throws IOException {
        CreateImageRandom imageRandom = new CreateImageRandom();
        imageRandom.createImageCapcha();
//        try {
//
//            int width = 150;
//            int height = 40;
//
//            Color bg = new Color(0, 255, 255);
//            Color fg = new Color(0, 100, 0);
//
//            Font font = new Font("Arial", Font.BOLD, 20);
//            BufferedImage img = new BufferedImage(width, height, BufferedImage.OPAQUE);
//            String string= "codewr.com"; 
//            Graphics g = img.createGraphics();
//
//            g.setFont(font);
//            g.setColor(bg);
//            g.fillRect(0, 0, width, height);
//            g.setColor(fg);
//            g.drawString(string, 10, 30);
//            
//
//            //write image
//            File f = new File("c:\\uploadFile\\image.jpg");
//            ImageIO.write(img, "png", f);
//            System.out.println("File saved!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    }

    public void createImageCapcha() {
        String captchaStr = generateCaptchaTextMethod2(6);

        try {

            int width = 100;
            int height = 40;

            Color bg = new Color(0, 255, 255);
            Color fg = new Color(0, 100, 0);

            Font font = new Font(".VnFreeH", Font.BOLD, 20);
            BufferedImage img = new BufferedImage(width, height, BufferedImage.OPAQUE);
            Graphics g = img.createGraphics();

            g.setFont(font);
            g.setColor(bg);
            g.fillRect(0, 0, width, height);
            g.setColor(fg);
            g.drawString(captchaStr, 10, 25);
            System.out.println(captchaStr);
            //write image
            File f = new File("c:\\uploadFile\\Output.jpg");
            ImageIO.write(img, "png", f);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String generateCaptchaTextMethod2(int captchaLength) {

        String saltChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuffer captchaStrBuffer = new StringBuffer();
        java.util.Random rnd = new java.util.Random();

        // build a random captchaLength chars salt        
        while (captchaStrBuffer.length() < captchaLength) {
            int index = (int) (rnd.nextFloat() * saltChars.length());
            captchaStrBuffer.append(saltChars.substring(index, index + 1));
        }

        return captchaStrBuffer.toString();

    }
}
