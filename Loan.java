import java.time.LocalDate;

/**
 * Loan 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
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
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public String toString()
    {
        return " ";
    }
}