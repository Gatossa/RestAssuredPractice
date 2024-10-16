import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;

public class Post {
    @JsonInclude(JsonInclude.Include.NON_NULL)

    private String title;
    private String author;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(title, post.title) && Objects.equals(author, post.author) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
