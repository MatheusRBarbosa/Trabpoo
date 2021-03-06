/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mathe
 */
public class FileR {

    private List<String> file = new ArrayList<>();

    public List<String> readFile(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));

        while (br.ready()) {
            String line = br.readLine();
            file.add(line);
        }
        br.close();
        return file;
    }

    public void writeFile(Map<Integer, ArrayList<Item>> itens, String path) {

        try {
            FileOutputStream out = new FileOutputStream(path);
            ObjectOutputStream objOut = new ObjectOutputStream(out);

            objOut.writeObject(itens);
            objOut.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileR.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileR.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Map<Integer, ArrayList<Item>> lerProdutos(String path) { // caaaaguei
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));
            Map<Integer, ArrayList<Item>> lista = (Map<Integer, ArrayList<Item>>) in.readObject();
            in.close();
            return lista;

        } catch (FileNotFoundException e) {
        } catch (IOException | ClassNotFoundException e) {
        }
        return null;

    }

    public String createNewPath(String path, String filePath) {
        String[] token = path.split("\\\\");
        token[token.length - 1] = filePath;
        String newPath = "";
        for (int i = 0; i < token.length; i++) {
            if (i < token.length - 1) {
                newPath += token[i] + "/";
            } else {
                newPath += token[i];
            }
        }
        return newPath;
    }
}
