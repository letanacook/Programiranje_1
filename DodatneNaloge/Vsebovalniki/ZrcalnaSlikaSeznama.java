import java.util.ArrayList;
import java.util.List;

public class ZrcalnaSlikaSeznama{

    public static <T> List<T> zrcalnaSlika(List<T> seznam){
        ArrayList<T> obratniSeznam = new ArrayList<>();

        for(int i = seznam.size() - 1; i >= 0; i--){
            T temp = seznam.get(i);
            obratniSeznam.add(temp);
        }

        return obratniSeznam;
    }
}