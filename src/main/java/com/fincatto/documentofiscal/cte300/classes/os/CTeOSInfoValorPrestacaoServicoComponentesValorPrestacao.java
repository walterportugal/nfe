package com.fincatto.documentofiscal.cte300.classes.os;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.cte.CTeConfig;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "Comp")
@Namespace(reference = CTeConfig.NAMESPACE)
public class CTeOSInfoValorPrestacaoServicoComponentesValorPrestacao extends DFBase {
    private static final long serialVersionUID = 8206239265618792602L;

    @Element(name = "xNome")
    private String nomeComponente;

    @Element(name = "vComp")
    private String valorComponente;

    public String getNomeComponente() {
        return this.nomeComponente;
    }

    /**
     * Nome do componente<br>
     * Exemplos: FRETE PESO, FRETE VALOR, SEC/CAT, ADEME, AGENDAMENTO, etc
     */
    public void setNomeComponente(final String nomeComponente) {
        DFStringValidador.tamanho15(nomeComponente, "Nome do componente");
        this.nomeComponente = nomeComponente;
    }

    public String getValorComponente() {
        return this.valorComponente;
    }

    /**
     * Valor do componente
     */
    public void setValorComponente(final BigDecimal valorComponente) {
        this.valorComponente = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorComponente, "Valor do componente");
    }
}
