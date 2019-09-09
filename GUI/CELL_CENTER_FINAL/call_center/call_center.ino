int LED1=13;
int LED2=12;
int LED3=11;
int LED4=10;
int LED5=9;

int BOTON1=8;
int BOTON2=7;
int BOTON3=6;
int BOTON4=5;
int BOTON5=4;

int val1;
int val2;
int val3;
int val4;
int val5;
int resp=0;

void setup(){
pinMode(LED1,OUTPUT);
pinMode(LED2,OUTPUT);
pinMode(LED3,OUTPUT);
pinMode(LED4,OUTPUT);
pinMode(LED5,OUTPUT);

pinMode(BOTON1,INPUT);
pinMode(BOTON2,INPUT);
pinMode(BOTON3,INPUT);
pinMode(BOTON4,INPUT);
pinMode(BOTON5,INPUT);

}
void loop(){
val1=digitalRead(BOTON1);
val2=digitalRead(BOTON2);
val3=digitalRead(BOTON3);
val4=digitalRead(BOTON4);
val5=digitalRead(BOTON5);

if(val1==HIGH){
digitalWrite(LED1,HIGH);
delay(10000);
digitalWrite(LED1,LOW);
resp=1;
}

if(val2==HIGH){
digitalWrite(LED2,HIGH);
delay(10000);
digitalWrite(LED2,LOW);
resp=2;
}

if(val3==HIGH){
digitalWrite(LED3,HIGH);
delay(10000);
digitalWrite(LED3,LOW);
resp=3;
}

if(val4==HIGH){
digitalWrite(LED4,HIGH);
delay(10000);
digitalWrite(LED4,LOW);
resp=4;
}

if(val5==HIGH){
digitalWrite(LED5,HIGH);
delay(10000);
digitalWrite(LED5,LOW);
resp=5;
}

}
