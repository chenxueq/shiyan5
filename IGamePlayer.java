package dynamicProxy;

public interface IGamePlayer
{
    //登录游戏
    public void login(String user, String password);

    //打怪
    public void killBoss();

    //升级
    public void upgrade();
}
