package entities;

import java.util.Objects;

public class Customer {

    private String nome;
    private String email;

    public Customer(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;

        return getNome().equals(customer.getNome());
    }

    @Override
    public int hashCode() {
        return getNome().hashCode();
    }
}
