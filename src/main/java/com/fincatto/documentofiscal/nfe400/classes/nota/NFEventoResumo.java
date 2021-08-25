package com.fincatto.documentofiscal.nfe400.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import java.time.ZonedDateTime;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "resEvento")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFEventoResumo extends DFBase {
    
    private static final long serialVersionUID = 6979476565566114622L;
    
    @Attribute(name = "versao")
    private String versao;
    
    @Element(name = "cOrgao")
    private String orgao;
    
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "CPF", required = false)
    private String CPF;
    
    @Element(name = "chNFe")
    private String chave;
    
    @Element(name = "dhEvento")
    private ZonedDateTime dataHoraEvento;
    
    @Element(name = "tpEvento")
    private String tipoEvento;
    
    @Element(name = "nSeqEvento")
    private String numeroSeqEvento;
    
    @Element(name = "xEvento")
    private String evento;
    
    @Element(name = "dhRecbto")
    private ZonedDateTime dataHoraRecebimento;

    @Element(name = "nProt")
    private String numeroProtocolo;

    public String getVersao() {
        return versao;
    }

    public NFEventoResumo setVersao(String versao) {
        this.versao = versao;
        return this;       
    }

    public String getOrgao() {
        return orgao;
    }

    public NFEventoResumo setOrgao(String orgao) {
        this.orgao = orgao;
        return this;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public NFEventoResumo setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
        return this;
    }

    public String getCPF() {
        return CPF;
    }

    public NFEventoResumo setCPF(String CPF) {
        this.CPF = CPF;
        return this;
    }

    public String getChave() {
        return chave;
    }

    public NFEventoResumo setChave(String chave) {
        this.chave = chave;
        return this;
    }

    public ZonedDateTime getDataHoraEvento() {
        return dataHoraEvento;
    }

    public NFEventoResumo setDataHoraEvento(ZonedDateTime dataHoraEvento) {
        this.dataHoraEvento = dataHoraEvento;
        return this;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public NFEventoResumo setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
        return this;
    }

    public String getNumeroSeqEvento() {
        return numeroSeqEvento;
    }

    public NFEventoResumo setNumeroSeqEvento(String numeroSeqEvento) {
        this.numeroSeqEvento = numeroSeqEvento;
        return this;
    }

    public String getEvento() {
        return evento;
    }

    public NFEventoResumo setEvento(String evento) {
        this.evento = evento;
        return this;
    }

    public ZonedDateTime getDataHoraRecebimento() {
        return dataHoraRecebimento;
    }

    public NFEventoResumo setDataHoraRecebimento(ZonedDateTime dataHoraRecebimento) {
        this.dataHoraRecebimento = dataHoraRecebimento;
        return this;
    }

    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public NFEventoResumo setNumeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
        return this;
    }

}
