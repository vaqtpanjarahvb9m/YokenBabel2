package controller;

public class Config {
	
	String bdd = "kornoeil_db";
	//Connexion locale BDD
	String username = "root";
	String password = "root";
	String port = "8889";
	String host = "jdbc:mysql://localhost:";
	//String username = "8251991";
	//String password = "T6egd7@@";
	//String host = "jdbc:mysql://";
	//String url = "jdbc:mysql://https://8251991.admin.dc0.gpaas.net/phpmyadmin/:3306/kornoeil_db";
	//https://8251991.admin.dc0.gpaas.net/phpmyadmin First
	//String url = this.host+this.port+"/"+this.bdd;
	String url = this.host+this.port+"/"+this.bdd;
	String key = "qwazerty";
	
	public Config(){
	}

	public Config(String bdd, String username, String password, String port, String host) {
		this.bdd = bdd;
		this.username = username;
		this.password = password;
		//this.usernamePMA = usernamePMA;
		//this.passwordPMA = passwordPMA;
		this.port = port;
		this.host = host;
		this.url = host+port+"/";
	}

	public String getBdd() {
		return bdd;
	}

	public void setBdd(String bdd) {
		this.bdd = bdd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public String getUsernamePMA() {
		return usernamePMA;
	}

	public void setUsernamePMA(String usernamePMA) {
		this.usernamePMA = usernamePMA;
	}

	public String getPasswordPMA() {
		return passwordPMA;
	}

	public void setPasswordPMA(String passwordPMA) {
		this.passwordPMA = passwordPMA;
	}*/

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
