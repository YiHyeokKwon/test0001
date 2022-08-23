package Utills;

import java.util.HashMap;
import java.util.Map;

public class UriParser {
    
    /*
    uri 규칙
    - /articles/write
    - /articles/delete?id=1
     */
    
    private String URI;
    private String controllerCode;
    private String target;
    private boolean isValid = false;
    
    private Map<String, Object> parameter = new HashMap<>();
    
    public UriParser(String uri){
        this.URI = uri;
        parse();
    }
    
    private void parse(){
        // /articles/delete ? id=1
        String[] uriSplit = this.URI.split("\\?", 2);
        if(uriSplit.length == 2){
            String paramBody = uriSplit[1];
            String[] splitParam = paramBody.split("=", 2);
            
            parameter.put(splitParam[0], splitParam[1]);
        }
        
        // [], articles, delete
        String[] uriBodySplit = uriSplit[0].split("/");
        
        this.controllerCode = uriBodySplit[1];
        this.target = uriBodySplit[2];
        
        isValid = true;
        
    }

    public String getControllerCode() {
    }

    public String getTarget() {
    }

    public Map<String, Object> getParameter() {
    }
}
