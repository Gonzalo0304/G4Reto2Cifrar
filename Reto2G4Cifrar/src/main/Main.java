/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import asimetrico.KeyGenerator;
import java.io.File;
import simetrico.CredentialCifrator;

/**
 *
 * @author David
 */
public class Main {

    public final static String MARKETMAKER_PATH = System.getProperty("user.home") + File.separator + "Documents\\MarketMaker";

    public static void main(String[] args) {

        File carpeta = new File(MARKETMAKER_PATH);
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        KeyGenerator.generarAsimetricKey();
        CredentialCifrator.cifrarTexto("Clave", "g4reto2@zohomail.eu&&5t80H73np8Nw");
    }
}
