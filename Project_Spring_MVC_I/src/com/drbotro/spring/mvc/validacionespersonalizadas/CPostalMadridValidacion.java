package com.drbotro.spring.mvc.validacionespersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String>{

    private String prefijoCodigoMadrid;

    @Override
    public void initialize(CPostalMadrid codigoPostalNumber){
        prefijoCodigoMadrid = codigoPostalNumber.value();
    }

    @Override
    public boolean isValid(String codigoPostalField, ConstraintValidatorContext ctx){

        boolean valCodigo;

        if(codigoPostalField != null){
            valCodigo = codigoPostalField.startsWith(prefijoCodigoMadrid);
        }else{
            valCodigo = true;
        }

        return valCodigo;
    }

}
