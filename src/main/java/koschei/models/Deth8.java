package koschei.models;

import koschei.KoscheiTheDeathless;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Deth8 {

    @Autowired
    private KoscheiTheDeathless koscheiTheDeathless;

    @Autowired
    public void setKoscheiTheDeathless(KoscheiTheDeathless koscheiTheDeathless) {
        this.koscheiTheDeathless = koscheiTheDeathless;
    }
}
