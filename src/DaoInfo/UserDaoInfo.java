package DaoInfo;

import java.util.List;

import Model.User;

public interface UserDaoInfo {
	public int regist(String UserName,String Pwd);
	public boolean login(String UserName,String Pwd);
	public boolean SaveMoney(String UserName,Double Money);
	public double WatchBal(String UserName);
	List<User> getAllUser();
}