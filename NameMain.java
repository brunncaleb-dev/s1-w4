public class NameMain{
    public static void main(String[] args) {
        Name n = new Name(" SeAn  "," MicHaEl"," mORRIS    ");
        System.out.println(n.lastFirst());
        System.out.println(n.fullName());
        System.out.println(n.initials());
        System.out.println(n.nickName());
    } 
}