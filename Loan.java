import java.time.LocalDate;

/**
 * 대출 정보가 담겨있는 클래스.
 *
 * @author (2023320012 강성하,202332010박성준,202332029정지후,202332006정준영)
 * @version (2026/11/03)
 */
public class Loan
{
    private Book borrowBook;
    private User borrower;
    private LocalDate dueDate;
    private LocalDate loanDate;

    /**
     * Loan 클래스의 객체 생성자
     */
    public Loan(User borrower, Book borrowBook)
    {
        this.borrower = borrower;
        this.borrowBook = borrowBook;
    }

    /**
     * Loan객체를 출력하는 메소드
     *
     */
    public void display()
    {

    }
}