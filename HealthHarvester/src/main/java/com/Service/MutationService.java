package com.Service;

import com.Model.Disease;
import com.Model.Gene;
import com.Model.Locus;
import com.Model.MutationEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silvana.albert on 4/10/15.
 */
public class MutationService {

    public List<MutationEntry> convertToMutation(String mutation) {
        List<MutationEntry> mutationEntryList = new ArrayList<MutationEntry>();
        String[] mutationArray = mutation.split(",");
        for (int i = 0; i < mutationArray.length; i++) {
//            A2M_12p13.31_Alzheimers Disease,AACS_12q24.31_Traheal Cancer
            String[] pieces = mutationArray[i].split("_");
            String gene = pieces[0];
            String locus = pieces[1];
            String disorder = pieces[2];
            MutationEntry mutationEntry = new MutationEntry(new Gene(gene), new Locus(locus), new Disease(disorder));
            mutationEntryList.add(mutationEntry);
        }
        return mutationEntryList;
    }
}
