package com.qa.transform;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;

import java.util.Locale;
import java.util.Map;

public class DataTableConfigurator implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(Numbers.class,
                        (Map<String, String> row) -> {
                            Integer number1 = Integer.parseInt(row.get("Number1"));
                            Integer number2 = Integer.parseInt(row.get("Number2"));
                            return new Numbers(number1, number2);
                        }
                )
        );
    }
}
