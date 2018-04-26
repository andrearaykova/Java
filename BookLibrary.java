import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;

/**
 * Created by andrearaykova on 10/17/17.
 */
public class BookLibrary {
    static class Book{
        private String title;
        private String author;
        private String publisher;
        private LocalDate releaseDate;
        private String isbn;
        private Double price;

        public Book(String title, String author, String publisher, LocalDate releaseDate, String isbn, Double price) {
            this.setTitle(title);
            this.setAuthor(author);
            this.setPublisher(publisher);
            this.setReleaseDate(releaseDate);
            this.setIsbn(isbn);
            this.setPrice(price);
        }

        public String getTitle(){
            return this.title;
        }

        private void setTitle(String newTitle){
            this.title = newTitle;
        }

        public String getAuthor() {
            return author;
        }

        private void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        private void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public LocalDate getReleaseDate() {
            return releaseDate;
        }

        private void setReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
        }

        public String getIsbn() {
            return isbn;
        }

        private void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public Double getPrice() {
            return price;
        }

        private void setPrice(Double price) {
            this.price = price;
        }
    }

    static class Library{
        private String name;
        private List<Book> bookList;

        public Library(String name){
            this.name = name;
            this.bookList = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public List<Book> getBookList() {
            return Collections.unmodifiableList(this.bookList);
        }

        private void setBookList(ArrayList<Book> bookList) {
            this.bookList = bookList;
        }

        public void addBook(Book book){
            this.bookList.add(book);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        Library library = new Library("Book 1");

        while (n-->0){
            String[] input = scanner.nextLine().split(" ");

            String title = input[0];
            String author = input[1];
            String publisher = input[2];
            String inputDate = input[3];
            DateTimeFormatter formater = DateTimeFormatter.ofPattern("d.M.yyyy");
            LocalDate releaseDate = LocalDate.parse(inputDate,formater);
            String isbn = input[4];
            Double price = Double.parseDouble(input[5]);




            Book book = new Book(title,author,publisher,releaseDate,isbn,price);
            library.addBook(book);
        }

        DateTimeFormatter frm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String inputEndDate  = scanner.nextLine();
        LocalDate endDate = LocalDate.parse(inputEndDate,frm);

        LinkedHashMap<String,LocalDate> books = new LinkedHashMap<>();
        library.getBookList().stream().filter(e -> e.getReleaseDate().isAfter(endDate))
                .sorted(Comparator.comparing(Book::getTitle))
                .sorted((e1,e2) -> e1.getReleaseDate().compareTo(e2.getReleaseDate()))
                .forEach(e -> {

           // if (e.getReleaseDate().isAfter(endDate)) {
           //     books.put(e.getTitle(),e.getReleaseDate());
                System.out.println(e.getTitle() + " -> " + frm.format (e.getReleaseDate()));
          //  }

         //  } else {
         //      books.put(e.getTitle(),books.get(e.getTitle()) + e.getReleaseDate());
         //  }
        });



      // books.entrySet().stream().sorted((e1,e2) -> {
      //     int sort = Double.compare(e2.getValue(),e1.getValue());

      //     if (sort == 0){
      //         sort = e1.getKey().compareTo(e2.getKey());
      //     }
      //      return sort;
       // })
       //    .forEach(e -> {
       //    System.out.printf("%s -> %.2f\n",e.getKey(),e.getValue());
       //});

    }
}
