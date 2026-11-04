
/**
 * 사용자 객체의 속성과 메소드가 담겨있는 User클래스.
 *
 * @author (2023320012 강성하,202332010박성준,202332029정지후,202332006정준영)
 * @version (2026/11/03)
 */
public class User extends DB_Element
{
    private String name;
    private Integer stID;

    /**
     * User 클래스의 객체 생성자
     */
    public User(int stID, String name)
    {
        this.stID = stID;
        this.name = name;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public String getID()
    {
        return String.valueOf(stID);
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