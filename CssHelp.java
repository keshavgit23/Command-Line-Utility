interface CSSProperties{
   public void properties();
}

class Color implements CSSProperties{
    @Override
    public void properties(){
        System.out.println("Color Properties:");
        System.out.println("color");
    }
}

class Background implements CSSProperties{
    @Override 
   public void properties(){
        System.out.println("Background Properties:");
        System.out.println("background-color");
        System.out.println("background-image");
        System.out.println("background-size");
        System.out.println("background-position");
    }
}

class Text implements CSSProperties{
    @Override
    public void properties(){
        System.out.println("Text Properties: ");
        System.out.println("font-size");
        System.out.println("font-weight");
        System.out.println("font-style");
        System.out.println("text-align");
    }
}

class BoxModel implements CSSProperties{
    @Override
    public void properties(){
        System.out.println("Size Properties:");
        System.out.println("width");
        System.out.println("height");
        System.out.println("max-width");
        System.out.println("min-height");

        System.out.println("Spacing Properties: ");
        System.out.println("margin");
        System.out.println("padding");

        System.out.println("Border Properties: ");
        System.out.println("border");
        System.out.println("border-width");
        System.out.println("border-style");
        System.out.println("border-color");
        System.out.println("border-radius");
    }
}

class CssHelp {
    public static void main(String[] args) {
        System.out.println("Program Started...");

        if(args.length==0){
            System.out.println("Please enter a CSS topic.");
            return;
        }
        String topic =  args[0].toLowerCase();

        CSSProperties prop = null;
        switch(topic){
            case "color":
                prop = new Color();
                break;
                case "background":
                prop = new Background();
                break;
                case "text":
                prop = new Text();
                break;
                case "boxmodel":
                prop = new BoxModel();
                break;
                default:
                System.out.println("Not found CSS topic!");
                return;
        }
        prop.properties();
    }
}