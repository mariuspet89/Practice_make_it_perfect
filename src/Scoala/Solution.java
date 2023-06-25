package Scoala;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> noteFizica = new ArrayList<>();
        noteFizica.add(6);
        noteFizica.add(8);
        noteFizica.add(9);

        List<Integer> noteMatematica = new ArrayList<>();
        noteMatematica.add(6);
        noteMatematica.add(8);
        noteMatematica.add(10);

        HashMap<String, List<Integer>> materiiSiNote = new HashMap<>();
                materiiSiNote.put("fizica", noteFizica);
                materiiSiNote.put("matematica", noteMatematica);
        Elev Ghita = new Elev("1", "Ghita", materiiSiNote );

        System.out.println(medieMaterie(noteMatematica));
        String note = "noteMatematica";

    }

    public static float medieMaterie(List<Integer> note) {
        float medie = 0;
        int size =  note.size();
        for(int i = 0; i < note.size(); i++) {
            Integer nota = note.get(i);


            medie += nota;

        }
        medie = medie / size;
        return medie;
    }

}
