package com.Service;

import com.DTO.GeneDTO;
import org.apache.commons.lang.ArrayUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by silvana.albert on 6/18/15.
 */
public class GenesCsvReader {
    private List<GeneDTO> geneDTOList = new ArrayList<GeneDTO>();
    private List<String> geneNames = new ArrayList<String>();
    private List<String> disordersNames = new ArrayList<String>();


    public List<GeneDTO> getGenes() {

        String csvFile = "/Users/salbu/Desktop/itshappening/GeneHive/src/main/java/com/allGenesAndDisorders.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] gene = line.split(cvsSplitBy);
                String[] disorders = gene[2].split(";");
                for(int i=0;i<disorders.length; i++){
                    if(i<=2){
                        System.out.println("\""+disorders[i].trim()+"\",");
                    }

                }
                GeneDTO geneDTO = new GeneDTO(gene[0], gene[1], disorders);
                geneNames.add(gene[0]);
                geneDTOList.add(geneDTO);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return geneDTOList;
    }

}
