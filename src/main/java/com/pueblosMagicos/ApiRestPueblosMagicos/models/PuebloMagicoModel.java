package com.pueblosMagicos.ApiRestPueblosMagicos.models;

import javax.persistence.*;

// 4to El modelo la representación real de la base de datos
@Entity
@Table(name = "pueblomagico")
public class PuebloMagicoModel {
    // Etiquetas de spring para mapear un objeto a una tabla
    // Entity = modelo real, Table = nombre de la tabla

    // Id = La base de datos sabe que es un id
    // generatedValue = se genera automaticamente y se autoincrementa
    // Column = unico y no nulo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpueblomagico", unique = true, nullable = false)
    private Integer idPuebloMagico;

    @Column(name = "idestado_fk", nullable = false)
    private Integer idEstado_fk;

    @Column(name = "nombrepueblomagico", nullable = false)
    private String nombrePuebloMagico;

    @Column(name = "dirlatitud", nullable = false)
    private Float dirLatitud;
    
    @Column(name = "dirlongitud", nullable = false)
    private Float dirLongitud;

    // getters y setters
    public Integer getIdPuebloMagico() {
        return idPuebloMagico;
    }

    public void setIdPuebloMagico(Integer idPuebloMagico) {
        this.idPuebloMagico = idPuebloMagico;
    }

    public Integer getIdEstado_fk() {
        return idEstado_fk;
    }

    public void setIdEstado_fk(Integer idEstado_fk) {
        this.idEstado_fk = idEstado_fk;
    }

    public String getNombrePuebloMagico() {
        return nombrePuebloMagico;
    }

    public void setNombrePuebloMagico(String nombrePuebloMagico) {
        this.nombrePuebloMagico = nombrePuebloMagico;
    }

    public Float getDirLatitud() {
        return dirLatitud;
    }

    public void setDirLatitud(Float dirLatitud) {
        this.dirLatitud = dirLatitud;
    }

    public Float getDirLongitud() {
        return dirLongitud;
    }

    public void setDirLongitud(Float dirLongitud) {
        this.dirLongitud = dirLongitud;
    }

}
