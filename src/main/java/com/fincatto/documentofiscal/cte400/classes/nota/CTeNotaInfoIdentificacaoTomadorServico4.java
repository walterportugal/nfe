package com.fincatto.documentofiscal.cte400.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.cte.CTeConfig;
import com.fincatto.documentofiscal.cte400.classes.CTTomadorServico;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Indicador do "papel" do tomador do serviço no CT-e
 */

@Root(name = "toma4")
@Namespace(reference = CTeConfig.NAMESPACE)
public class CTeNotaInfoIdentificacaoTomadorServico4 extends DFBase {
    private static final long serialVersionUID = 7520088985277241905L;

    @Element(name = "toma")
    private CTTomadorServico tomadorServico;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "CPF", required = false)
    private String cpf;

    @Element(name = "IE", required = false)
    private String inscricaoEstadual;
    
    @Element(name = "xNome")
    private String razaoSocial;

    @Element(name = "xFant", required = false)
    private String nomeFantasia;

    @Element(name = "fone", required = false)
    private String telefone;
    
    @Element(name = "enderToma")
    private CTeNotaEndereco enderTomadorServico;

    @Element(name = "email", required = false)
    private String email;

    public CTTomadorServico getTomadorServico() {
        return this.tomadorServico;
    }

    /**
     * Tomador do Serviço<br>
     * Preencher com:<br>
     * 4 - Outros<br>
     * Obs: Informar os dados cadastrais do tomador do serviço
     */
    public void setTomadorServico(final CTTomadorServico tomadorServico) {
        if (!CTTomadorServico.TOMADOR_4.contains(tomadorServico)) {
            throw new IllegalArgumentException("O tomador do servico não é válido para este papel");
        }
        this.tomadorServico = tomadorServico;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    /**
     * Número do CNPJ<br>
     * Em caso de empresa não estabelecida no Brasil, será informado o CNPJ com zeros. Informar os zeros não significativos.
     */
    public void setCnpj(final String cnpj) {
        DFStringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return this.cpf;
    }

    /**
     * Número do CPF<br>
     * Informar os zeros não significativos.
     */
    public void setCpf(final String cpf) {
        DFStringValidador.cpf(cpf);
        this.cpf = cpf;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    /**
     * Inscrição Estadual<br>
     * Informar a IE do tomador ou ISENTO se tomador é contribuinte do ICMS isento de inscrição no cadastro de contribuintes do ICMS. Caso o tomador não seja contribuinte do ICMS não informar o conteúdo.
     */
    public void setInscricaoEstadual(final String inscricaoEstadual) {
        DFStringValidador.inscricaoEstadual(inscricaoEstadual);
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    /**
     * Razão Social ou Nome
     */
    public void setRazaoSocial(final String razaoSocial) {
        DFStringValidador.tamanho2ate60(razaoSocial, "Razão Social ou Nome");
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    /**
     * Nome Fantasia
     */
    public void setNomeFantasia(final String nomeFantasia) {
        DFStringValidador.tamanho2ate60(nomeFantasia, "Nome Fantasia");
        this.nomeFantasia = nomeFantasia;
    }

    public String getTelefone() {
        return this.telefone;
    }

    /**
     * Telefone
     */
    public void setTelefone(final String telefone) {
        DFStringValidador.telefone(telefone);
        this.telefone = telefone;
    }

    public CTeNotaEndereco getEnderTomadorServico() {
        return this.enderTomadorServico;
    }

    /**
     * Dados do endereço
     */
    public void setEnderTomadorServico(final CTeNotaEndereco enderTomadorServico) {
        this.enderTomadorServico = enderTomadorServico;
    }

    public String getEmail() {
        return this.email;
    }

    /**
     * Endereço de email
     */
    public void setEmail(final String email) {
        DFStringValidador.tamanho60(email, "Endereço de email");
        DFStringValidador.email(email);
        this.email = email;
    }
}
