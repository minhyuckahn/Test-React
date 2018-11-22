package test.apple;

public enum AppleColor {
	    RED("RED"),GREEN("GREEN");
	    private String color;
	    AppleColor(String color) {
	        this.color = color;
	    }
	    public String getColor() {
	        return color;
	    }
}
