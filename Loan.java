import java.time.LocalDate;

/**
 * 대출 정보가 담겨있는 클래스.
 *
 * @author (2023320012 강성하,202332010박성준,202332029정지후,202332006정준영)
 * @version (2026/11/09)
 */
public class Loan
{
    Book book;
    User user;
    private LocalDate dueDate;
    private LocalDate loanDate;
    
    /**
     * Loan 클래스의 객체 생성자
     */
    public Loan(User user, Book book)
    {
        this.user = user;
        this.book = book;
        this.loanDate = loanDate.now();
        this.dueDate = loanDate.plusDays(15);
        book.loan = this;
    }

    /**
     * Loan객체를 출력하는 메소드
     *
     */
    public void display()
    {

    }
}