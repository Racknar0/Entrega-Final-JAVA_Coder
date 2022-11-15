package com.storeunisoftware.storeunisoftware.validator;

import com.storeunisoftware.storeunisoftware.model.Producto;

public class ProductValidator {
    
    public void validate(Producto product) {
        if (product.getDescripcion() == null || product.getDescripcion().isEmpty()) {
            throw new RuntimeException("La descripción es obligatoria");
        }  
     }
}
