package com.fincatto.documentofiscal.cte400.classes.evento.comprovanteentrega;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.cte.CTeConfig;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "infEntrega")
@Namespace(reference = CTeConfig.NAMESPACE)
public class CTeInformacaoComprovanteEntrega extends DFBase {
    private static final long serialVersionUID = -1932963884481526638L;

    @Element(name = "chNFe")
    private String chaveNFe;

    public String getChaveNFe() {
        return chaveNFe;
    }

    public void setChaveNFe(String chaveNFe) {
        DFStringValidador.exatamente44N(chaveNFe, "Chave de Acesso");
        this.chaveNFe = chaveNFe;
    }
}
