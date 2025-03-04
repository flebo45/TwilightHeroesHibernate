package org.Model;

import org.Controller.PlayerController;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Consumables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    protected String name;

    @Column(nullable = false)
    protected String description;

    public Consumables() {}

    public Consumables(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Metodo astratto che ogni consumabile implementerà
    public abstract void consume(Player player , PlayerController pgController);
    public String getName(){
        return name;
    }
    
    @Override
    public String toString() {
        return name + ", " + description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
