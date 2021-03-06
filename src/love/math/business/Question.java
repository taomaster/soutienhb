package love.math.business;

import java.util.List;

/**
 * Created by Human Booster on 08/09/2017.
 */
public class Question {
    private int id;
    private String text;
    private List<Choice> choices;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", choices=" + choices +
                '}';
    }
}
