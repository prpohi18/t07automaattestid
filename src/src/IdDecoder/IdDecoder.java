package IdDecoder;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class IdDecoder {
   private String idCode;

    public IdDecoder(String idCode){
        this.idCode = idCode;
    }

    public boolean checklength(){
        return idCode.length() == 11;
    }

    public String checkgender(){
        String split1st = idCode.substring(0,1 );

        switch (split1st) {
            case "1":
            case "3":
            case "5":
                return "m";
            case "2":
            case "4":
            case "6":
                return "n";
            default:
                throw new IllegalArgumentException();
        }
    }
}
