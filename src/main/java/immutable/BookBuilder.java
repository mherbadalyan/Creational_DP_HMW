package immutable;

public class BookBuilder {
    private  String code;
    private  String title;
    private  String author;
    private  int publishingYear;
    private  String description;
    private  Genre genre;

    public BookBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
        return this;
    }

    public BookBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public BookBuilder setGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public Book build() {
        return new Book(code,title,genre,author,publishingYear,description);
    }
}
