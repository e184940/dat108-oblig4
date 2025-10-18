package hvl.dat108.dat108oblig4.service;

import hvl.dat108.dat108oblig4.model.Deltager;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class DeltagerService {

    private final CopyOnWriteArrayList<Deltager> deltagere = new CopyOnWriteArrayList<>();

    public boolean leggTilOmNy(Deltager d){
        String mobilnr = normMobilnr(d.getMobilnr());
        boolean finnes = deltagere.stream()
                .anyMatch(a -> normMobilnr(a.getMobilnr()).equals(mobilnr));
        if(finnes){
            return false;
        }
        deltagere.add(d);
        return true;
    }

    public List<Deltager> hentAlleSortert(){
        return deltagere.stream()
                .sorted(Comparator.comparing(Deltager::getEtternavn)
                        .thenComparing(Deltager::getFornavn))
                .toList();
    }

    private String normMobilnr(String mobilnr) {
        return mobilnr == null ? "" : mobilnr.replace(" ","");
    }
}
