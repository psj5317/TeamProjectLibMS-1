
/**
 * 책 객체의 속성과 메소드가 담겨있는 Book 클래스.
 *
 *
 * @author (2023320012 강성하,202332010박성준,202332029정지후,202332006정준영)
 * @version (2026/11/03)
 */
public class Book
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
     * Book 객체를 출력하는 메소드
     *
     */
    public void display()
    {
        
    }

    /**
     * 책이 대출 가능한지 알려주는 메소드
     *
     * @return  책이 대출 가능하지 않으면 false
     */
    public boolean check()
    {
        
    }
}