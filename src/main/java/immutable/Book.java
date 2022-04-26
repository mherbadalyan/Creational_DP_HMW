package immutable;

import java.util.Objects;

public class Book {
    private final String code;
    private final String title;
    private final String author;
    private final int publishingYear;
    private final String description;
    private final Genre genre;

    public Book(String code, String title, Genre genre, String author, int publishingYear, String description) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.description = description;
        this.genre = genre;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getDescription() {
        return description;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(code, book.code) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(description, book.description) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, title, author, publishingYear, description, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", description='" + description + '\'' +
                ", genre=" + genre +
                '}';
    }
}
