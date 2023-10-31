package com.fincatto.documentofiscal.cte400.transformers;

import com.fincatto.documentofiscal.cte400.classes.CTTipoProprietario;
import org.simpleframework.xml.transform.Transform;

public class CTTipoProprietarioTransformer implements Transform<CTTipoProprietario> {

    @Override
    public CTTipoProprietario read(final String codigo) {
        return CTTipoProprietario.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTTipoProprietario tipo) {
        return tipo.getCodigo();
    }

}
