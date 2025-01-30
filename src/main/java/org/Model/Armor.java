package org.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "ARMORS")
public class Armor extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String set;  // Nome del set dell'armatura

    @Column(nullable = false)
    private int stat;  // Valore della statistica aumentata

    @Column(name = "stat_ench", nullable = false)
    private String statEnch;  // Nome della statistica aumentata (es. "forza", "agilità", "difesa")

    @Column(nullable = false)
    private String part;  // Parte del corpo equipaggiata (elmo, corazza, gambali, guanti, anello)

    // Costruttore vuoto per JPA
    public Armor() {}

    // Costruttore con parametri
    public Armor(String name, String description, String set, String part, int stat, String statEnch) {
        this.name = name;
        this.description = description;
        this.set = set;
        this.part = part;
        this.stat = stat;
        this.statEnch = statEnch;
    }

    // GETTERS & SETTERS
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSet() { return set; }
    public void setSet(String set) { this.set = set; }

    public int getStat() { return stat; }
    public void setStat(int stat) { this.stat = stat; }

    public String getStatEnch() { return statEnch; }
    public void setStatEnch(String statEnch) { this.statEnch = statEnch; }

    public String getPart() { return part; }
    public void setPart(String part) { this.part = part; }

    // Metodo per visualizzare i dettagli dell'armatura
    @Override
    public String toString() {
        return name + " (" + part + ") - Aumenta " + statEnch + " di " + stat;
    }
}
