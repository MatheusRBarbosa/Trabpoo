/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class FileR {

    private List<String> produtos = new ArrayList<>();

    public List readFile(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));

        while (br.ready()) {
            String line = br.readLine();
            produtos.add(line);
        }
        
        return produtos;
    }
}
