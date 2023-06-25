package Scoala;

import java.util.HashMap;
import java.util.List;

public class Elev {

    private String id;
    private String name;
    private HashMap<String, List<Integer>> materieSiNote;

    public Elev(String id, String name, HashMap<String, List<Integer>> materieSiNote) {
        this.id = id;
        this.name = name;
        this.materieSiNote = materieSiNote;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, List<Integer>> getMaterieSiNote() {
        return materieSiNote;
    }

    public void setMaterieSiNote(HashMap<String, List<Integer>> materieSiNote) {
        this.materieSiNote = materieSiNote;
    }
}
