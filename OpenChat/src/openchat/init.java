package openchat;

/**
 *
 * @author Jason.
 */
public class init {
    private final String appsName = "OpenChat";
    private final String appsVersion = "Beta Version";
    
    private final String dbName = "open_chat";
    private final String dbTableName = "users";
    
    private final String serverName = "OpenChatServer";
    private final int serverPort = 1099;
    
    private String ipServer = "192.168.0.1";
    
    
    public String getAppsName(){
        return appsName;
    }
    public String getAppsVersion(){
        return appsVersion;
    }
    
    public String getDbName(){
        return dbName;
    }
    public String getDbTableName(){
        return dbTableName;
    }
    
    public String getServerName(){
        return serverName;
    }
    public int getServerPort(){
        return serverPort;
    }
    
    public String getIp(){
        return ipServer;
    }
    public void setIp(String ipServer){
        this.ipServer = ipServer;
    }
    
    
    private final String name1 = "Roslynlia";
    private final String name2 = "Daniel";
    private final String name3 = "M. Naufal";
    private final String name4 = "JASON";
    
    private final String nim1 = "2101628335";
    private final String nim2 = "2101634991";
    private final String nim3 = "2101";
    private final String nim4 = "2101700371";
    
    
    public String getName(){
        return name4;
    }
    public String getNim(){
        return nim4;
    }
}
