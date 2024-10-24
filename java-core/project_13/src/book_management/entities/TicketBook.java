package book_management.entities;


import java.time.LocalDateTime;

public class TicketBook {
   private int id;
   private int bookId;
   private int memberId;
   private int quantity;
   private LocalDateTime borrowDate;
   private LocalDateTime returrnDate;

    public TicketBook() {
    }

    public TicketBook(int id, int bookId, int memberId, int quantity, LocalDateTime borrowDate, LocalDateTime returrnDate) {
        this.id = id;
        this.bookId = bookId;
        this.memberId = memberId;
        this.quantity = quantity;
        this.borrowDate = borrowDate;
        this.returrnDate = returrnDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDateTime getReturrnDate() {
        return returrnDate;
    }

    public void setReturrnDate(LocalDateTime returrnDate) {
        this.returrnDate = returrnDate;
    }

    @Override
    public String toString() {
        return "TicketBook{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", memberId=" + memberId +
                ", quantity=" + quantity +
                ", borrowDate=" + borrowDate +
                ", returrnDate=" + returrnDate +
                '}';
    }
}
