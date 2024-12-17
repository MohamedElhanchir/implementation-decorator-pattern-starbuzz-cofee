package elhanchir.mohamed;

import elhanchir.mohamed.decorateur.Caramel;
import elhanchir.mohamed.decorateur.Chantilly;
import elhanchir.mohamed.decorateur.Chocolat;
import elhanchir.mohamed.produits.Boisson;
import elhanchir.mohamed.produits.Sumatra;

import java.io.*;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {
        Boisson b = new Chantilly(new Chocolat(new Caramel(new Chocolat(new Sumatra()))));
        System.out.println(b.getDescription());
        System.out.println(b.cout());

        /*
        //exemple de design pattern decorator
        BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(new File("data.csv"))));
        String str = br.readLine();

        OutputStream os= new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(new File("doc.zip"))));
        os.write(345);

         */
    }
}