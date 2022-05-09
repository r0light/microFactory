package org.niels.master.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.niels.master.model.interfaces.Interface;

import java.util.List;

@Data
@NoArgsConstructor
public class Service {
    private String name;

    private String dbms;
    private String database;


    private List<Interface> interfaces;

    public Interface getInterfaceByName(String name) {
        return interfaces.stream().filter(i -> i.getName().equals(name)).findFirst().get();
    }
}
