package com.fincatto.documentofiscal.cte400.classes.evento.gtv;

import com.fincatto.documentofiscal.cte.CTeConfig;
import com.fincatto.documentofiscal.cte400.classes.evento.CTeTipoEvento;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "evGTV")
@Namespace(reference = CTeConfig.NAMESPACE)
public class CTeEnviaEventoGtv extends CTeTipoEvento {
    private static final long serialVersionUID = -1779665170091598663L;

    @Element(name = "infGTV")
    private List<CTeInformacaoGtv> gtvs;

    public List<CTeInformacaoGtv> getGtvs() {
        return gtvs;
    }

    public void setGtvs(List<CTeInformacaoGtv> gtvs) {
        this.gtvs = gtvs;
    }
}