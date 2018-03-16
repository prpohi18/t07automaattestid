package IdDecoder;


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

        if (split1st.equals("1") || split1st.equals("3") || split1st.equals("5")) {
            return "m";
        } else if (split1st.equals("2") || split1st.equals("4") || split1st.equals("6")) {
            return "n";
        } else {
            throw new IllegalArgumentException();
        }
    }
}