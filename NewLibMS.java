import java.util.*;

/**
 * 도서관 관리 시스템 클래스
 *
 * @author (2023320012 강성하,202332010박성준,202332029정지후,202332006정준영)
 * @version (2026/11/03)
 */
public class NewLibMS
{
    public String SMLibrary;
    
    /**
     * 책을 빌리는 메소드
     *
     * @param  userID : 학생의 학번 , bookID : 책 번호
     * 
     */
    public void borrowBook(String userID,String bookID)
    {
        Book book = bookDB.search(bookID);
    } 

    /**
     * 책을 등록하는 메소드
     *
     * @param  title : 책의 제목, author : 책의 저자
     * 
     */
    public void registerBook(String title, String author)
    {
        
    }

    /**
     * 이용자를 신규 등록하는 메소드 
     *
     * @param  stID : 이용자의 학번 , name : 이용자의 이름
     */
    public void registerUser(String stID, String name)
    {
        
    }

}
