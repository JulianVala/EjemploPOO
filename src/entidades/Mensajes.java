package entidades;

public enum Mensajes {
    MENSAJE_PETICION_HORAS("Ingresa Horas Trabjadas."),
    MENSAJE_PETICION_VALOR_HORA("Ingrese Vaor Hora"),
    MENSAJE_SALARIO_PAGAR ("El salario a pagar es ");

    private String mensaje;
    Mensajes(String s) {
        this.mensaje= s;
    }

    public String getMensajes() {
        return mensaje;
    }
}
