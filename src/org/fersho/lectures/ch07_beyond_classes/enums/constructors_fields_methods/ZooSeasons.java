package org.fersho.lectures.ch07_beyond_classes.enums.constructors_fields_methods;

public enum ZooSeasons {
    WINTER {
        public String getHours() {
            return "10am-3pm";
        }
    },
    SPRING {
        public String getHours() {
            return "9am-5pm";
        }
    },
    SUMMER {
        public String getHours() {
            return "9am-7pm";
        }
    },
    FALL {
        public String getHours() {
            return "9am-5pm";
        }
    };
    public abstract String getHours();
}

 enum ZooSeasons2 {
    WINTER {
        public String getHours() {
            return "10am-3pm";
        }
    },    
    SUMMER {
        public String getHours() {
            return "9am-7pm";
        }
    },
    SPRING,FALL;
    public String getHours() {
        return "9am-5pm";
    };
}
