package dev.mrodriguezul.NotasWeb.bean;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author Lenovo
 */
@Data
public class PersonaBean implements Serializable{
    private String nombre;
    private String apellidos;
    private LocalDate fecNacimiento;
    private String email;
    private String celular;
}
