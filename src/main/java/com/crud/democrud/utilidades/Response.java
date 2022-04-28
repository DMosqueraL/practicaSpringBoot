package com.crud.democrud.utilidades;

public class Response {

    /**
     * Indica de si existe un error o no en la respuesta del API
     */
    public Boolean error;

    /**
     * Mensaje del API cuando es utilizada
     */
    public String message;

    /**
     * Información del API cuando es necesario
     */
    public Object data;

    /**
     * Constructor de la clase
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    public Response() {
        error = false;
        message = "";
        data = null;
    }

    /**
     * Restaura a ceros la respuesta del API
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    public void restart() {
        error = false;
        message = "";
        data = null;
    }
}
