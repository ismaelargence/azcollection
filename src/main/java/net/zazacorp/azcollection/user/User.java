package net.zazacorp.azcollection.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Blob;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

//Si à terme on est amené à utiliser tous les getters et Setter => utiliser @Data qui les génères sans qu'on ait à les écrire
//Je l'ai pas utilisé pour pas qu'un attribut puisse être modifier n'importe comment
@Document //@Document crée une collection mongodb du nom de la classe User et rend l'objet ajoutable à celle-ci
public class User {
    @Id
    private String id;
    @Indexed(unique = true)
    private String pseudo;
    @Indexed(unique = true)
    private String email;
    private String password;
    //private Blob profilePicture;
    private int numberWarning;
    private Role role;
    private LocalDateTime created;

    public User(String pseudo, String email, String password, Role role) {
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.role = role;
        this.numberWarning = 0;
        this.created = LocalDateTime.now();
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public void setProfilePicture(Blob profilePicture) {
        this.profilePicture = profilePicture;
    }*/

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    /*public Blob getProfilePicture() {
        return profilePicture;
    }*/

    public int getNumberWarning() {
        return numberWarning;
    }

    public Role getRole() {
        return role;
    }

    public LocalDateTime getCerated() {
        return created;
    }
}
