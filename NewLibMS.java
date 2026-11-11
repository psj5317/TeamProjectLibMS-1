import java.util.*;

/**
 * 도서관 관리 시스템 클래스
 *
 * @author (2023320012 강성하,202332010박성준,202332029정지후,202332006정준영)
 * @version (2026/11/09)
 */
public class NewLibMS
{
    private String libName;
    private BookDB bookDB;
    private LoanDB loanDB;
    private UserDB userDB;

    /**
     * NewLibMS 클래스의 객체 생성자
     *
     */
    public NewLibMS(){
        this.libName = "";
        this.bookDB = new BookDB();
        this.loanDB = new LoanDB();
        this.userDB = new UserDB();
    }

    /**
     * 책을 빌리는 메소드
     *
     * @param  userID : 학생의 학번
     *         bookID : 책 번호
     * 
     */
    public void borrowBook(String userID,String bookID)
    {
        Book book = bookDB.search(bookID);
        User user = userDB.search(userID);
        book.display();
        user.display();
        boolean resultBook = book.check();
        boolean resultUser = user.check();

        if(resultBook == false && resultUser==false){
            System.out.println("책과 이용자 모두 대출 불가능한 상태입니다!");
        }
        else if(resultBook == true && resultUser == false){
            System.out.println("이용자가 대출 불가능한 상태입니다!");
        }
        else if(resultBook == false && resultUser == true){
            System.out.println("책이 대출 불가능한 상태입니다!");
        }
        else{
            Loan loan = new Loan(user, book);
            loan.display();
            loanDB.addLoan(loan);
        }
    }

    /**
     * 책을 등록하는 메소드
     *
     * @param  title : 책의 제목
     *         author : 책의 저자
     * 
     */
    public void registerBook(String title, String author)
    {
        String bookID = bookDB.getNewID();
        Book book = new Book(title, author, bookID);
        bookDB.addBook(book);
        System.out.println("신규 책 등록이 완료되었습니다!");
    }

    /**
     * 이용자를 신규 등록하는 메소드 
     *
     * @param  stID : 이용자의 학번 , name : 이용자의 이름
     */
    public void registerUser(String stID, String name)
    {   
        User findUser = userDB.search(stID);
        if(findUser != null){
            System.out.println("이미 등록된 이용자 입니다");
        } else {
            User user = new User(stID,name);
            userDB.addUser(user);
            System.out.println("신규 이용자 등록이 완료되었습니다.");
        }
        
    }
}
