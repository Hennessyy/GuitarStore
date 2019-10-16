public class GuitarSpec {

    private Builder builder;
    private String model;
    private NumStrings numString;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(){
        this.builder = Builder.FENDER;
        this.model = "";
        this.numString = NumStrings.SIX;
        this.type=Type.ACOUSTIC;
        this.backWood=Wood.ALDER;
        this.topWood=Wood.ALDER;
    }
    public GuitarSpec(Builder builder, String model, NumStrings numString,Type type, Wood backWood,Wood topWood){
        this.builder = builder;
        this.model = model;
        this.numString = numString;
        this.type=type;
        this.backWood=backWood;
        this.topWood=topWood;
    }
    public Builder getBuilder(){
        return builder;
    }
    public String getModel(){
        return model;
    }
    public Type getType(){
        return type;
    }
    public Wood getBackwood(){
        return backWood;
    }
    public Wood getTopwood(){
        return topWood;
    }
    public NumStrings getNumString() { return numString; }



    public boolean matches(GuitarSpec spec){

        if (this.getBuilder() != spec.getBuilder())
            return false;

        String model = this.getModel().toLowerCase();

        if (this.getNumString() != spec.getNumString())
            return false;

        if ((this.model != null) && (!model.equals("")) &&
                (!model.equals(spec.getModel().toLowerCase())))
            return false;
        if (this.getType() != spec.getType())
            return false;
        if (this.getBackwood() != spec.getBackwood())
            return false;
        if (this.getTopwood() != spec.getTopwood())
            return false;

        return true;
    }
}
