import java.util.*;

/**
 * 도서관 관리 시스템 클래스
 *
 * @author (2023320012 강성하,202332010박성준,202332029정지후,202332006정준영)
 * @version (2026/11/03)
 */
public class LMS
{
    LibDB<Book> bookDB;
    LibDB<User> userDB;
    HashMap<User,ArrayList<Loan>> loanDB;

    /**
     * LMS 클래스의 객체 생성자
     */
    public LMS()
    {
        bookDB = new LibDB<Book>();
        userDB = new LibDB<User>();
        loanDB = new HashMap<User,ArrayList<Loan>>();
    }

    /**
     * 사용자를 등록하는 메소드 
     *
     * @param  학생의 학번과 학생의 이름
     * 
     */
    public void borrowBook(String userID,String bookID)
    {
        
    } 

    /**
     * 도서 객체를 생성해서 등록하는 메소드 
     *
     * @param  도서의 ID,도서 제목,도서 저자
     * 
     */
    public LibDB<Book> setBookDB(String bookFile)
    {
        
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public LibDB<User> setUserDB(String userFile)
    {
        
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public int sampleMethod(int y)
    {
        
    }
}
