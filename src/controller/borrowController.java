package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class borrowController {

    @Autowired
    private borrowService borrowService;

    @PostMapping("/borrow")
    public ResponseEntity<String> borrowBook(@RequestBody BorrowDTO borrowDTO) {
        try {
            borrowService.borrowBook(borrowDTO);
            return new ResponseEntity<>("Book borrowed successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/books")
    public String getBookList(Model model) {
        List<Book> books = bookService.getAllBooks();
        List<Book> availableBooks = new ArrayList<>();
        List<Book> borrowedBooks = new ArrayList<>();

        for (Book book : books) {
            if ("在库".equals(book.getStatus())) {
                availableBooks.add(book); 
            } else {
                borrowedBooks.add(book); 
            }
        }

        model.addAttribute("availableBooks", availableBooks);
        model.addAttribute("borrowedBooks", borrowedBooks);

        return "bookList";
    }
}