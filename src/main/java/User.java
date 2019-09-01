public class User {

    private Long id;
    private String login;
    private String password;

    public User(Long id,String login,String password){
        this.id=id;
        this.login=login;
        this.password=password;
    }


    public String getLogin(){
        return login;
    }
    public Long getId(){
        return id;
    }
    public String getPassword(){
        return password;
    }
}
