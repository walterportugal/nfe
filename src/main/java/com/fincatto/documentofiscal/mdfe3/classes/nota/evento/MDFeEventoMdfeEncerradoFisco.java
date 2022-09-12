package com.fincatto.documentofiscal.mdfe3.classes.nota.evento;

import com.fincatto.documentofiscal.DFBase;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Class: MDFeEventoMdfeEncerradoFisco.
 *
 * <p>
 * History:<br><br>
 * - Wellington Carlos da Paixão - 31/08/2022: Criação do Arquivo<br>
 * <p>
 *
 * @author Wellington Carlos da Paixão
 * @since 3.1.34
 *
 */           
@Root(name = "evMDFeEncFisco")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeEventoMdfeEncerradoFisco extends DFBase {

    @Element(name = "descEvento")
    private String descricaoEvento;

    @Element(name = "tpEnc")
    private String tipoEncerramento;

    @Element(name = "xJust")
    private String justificativaEncerramento;

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public String getTipoEncerramento() {
        return tipoEncerramento;
    }

    public void setTipoEncerramento(String tipoEncerramento) {
        this.tipoEncerramento = tipoEncerramento;
    }

    public String getJustificativaEncerramento() {
        return justificativaEncerramento;
    }

    public void setJustificativaEncerramento(String justificativaEncerramento) {
        this.justificativaEncerramento = justificativaEncerramento;
    }

}
