package math.business;

import javax.persistence.*;

/**
 * Created by Human Booster on 08/09/2017.
 */

//Il s'agit d'une classe de jointure, qui permet de lier les utilisateurs et les réponses qu'ils ont donné aux questions.
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Choice choice;

    public Answer() {

    }

    public Answer(User user, Choice choice) {
        this.user = user;
        this.choice = choice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", user=" + user +
                ", choice=" + choice +
                '}';
    }
}
