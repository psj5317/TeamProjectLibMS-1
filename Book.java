
/**
 * 책 객체의 속성과 메소드가 담겨있는 Book 클래스.
 *
 *
 * @author (2023320012 강성하,202332010박성준,202332029정지후,202332006정준영)
 * @version (2026/11/03)
 */
public class Book extends DB_Element
{
    private String author;
    private String bookID;
    private String title;

    /**
     * Book 클래스의 객체 생성자
     */
    public Book(String bookID, String title, String author)
    {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    /**
     * 대출 작업을 수행하는 메소드 
     *
     * @param  
     * 
     */
    public String getID()
    {
        return bookID;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String toString()
    {
        return " ";
    }

}