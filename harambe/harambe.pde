int datboi= 10;
int speed=10;
void setup(){  
  size(500,500);
}
void draw(){

background(123,99,23);
datboi=datboi+1;
ellipse(datboi+speed,200,150,150);
fill(125,100,41);
stroke(50,50,50);
}
