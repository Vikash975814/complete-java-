class ParkingSystem {
    int big,mediam,small;
    public ParkingSystem(int big, int mediam, int small) {
        this.big=big;
        this.mediam=mediam;
        this.small=small;
    }    
    public boolean addCar(int carType) {
        if(carType==1){
            if(big>0){
                big--;
                return true;
}
            return false;
}
        if(carType==2){
            if(mediam>0){
                mediam--;
                return true;
}
            return false;
}
        else{
            if(small>0){
                small--;
                return true;
}
            return false;
}
    }
}
