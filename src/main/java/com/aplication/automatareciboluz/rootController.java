package com.aplication.automatareciboluz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class rootController {
    @FXML
    private TextArea Textarea_codigo;
    @FXML
    private Button botoomValidarCodigo;
    @FXML
    private Button bottom_atras;
    @FXML
    private Label labelcodigo;
    @FXML
    private TextField textFieldCodigo;


    char[] alfabetoNumeros = {'0','1','2','3','4','5','6','7','8','9'};
    char[] numeroServicio = new char[12];
    char[] fechaLimite = new char[8];
    char[] importe =new char[9];
    char[] pais= new char[2];


    @FXML
    void volverAtras(ActionEvent event) {
    }
    @FXML
    void validarPlaca(ActionEvent event) {
        Textarea_codigo.setText("");
        if (textFieldCodigo.getText().length()==0){
            System.out.println("Cadena vacia");
            Textarea_codigo.setText("Cadena vacia");
        }else {
            if (textFieldCodigo.getText().length() !=30){
                System.out.println("La longitud del codigo no corresponde a 30 caracteres");
                Textarea_codigo.setText("La longitud del codigo no corresponde a 30 caracteres");
            }else {
                char[] cadenaCodigoChars = textFieldCodigo.getText().toCharArray();
                q0(cadenaCodigoChars);
            }
        }
    }

    public void q0(char[] cadenaCodigoChars){
        if (cadenaCodigoChars[0] == alfabetoNumeros[0]) {
            pais[0]=cadenaCodigoChars[0];
            q1(cadenaCodigoChars);
        }else{
            System.out.println("Invalido la cadena no corresponde a mexico, caracter 1 y 2 invalido --> "+cadenaCodigoChars[0]+cadenaCodigoChars[1]);
            Textarea_codigo.setText("Invalido la cadena no corresponde a mexico, caracter 1 y 2 invalido --> "+cadenaCodigoChars[0]+cadenaCodigoChars[1]);

        }
    }
    public void q1(char[] cadenaCodigoChars){
        if (cadenaCodigoChars[1]==alfabetoNumeros[1]){
            pais[1]=cadenaCodigoChars[1];
            q2(cadenaCodigoChars);
        }else {
            System.out.println("Invalido la cadena no corresponde a mexico, caracter 1 y 2 invalido--> "+cadenaCodigoChars[0]+cadenaCodigoChars[1]);
            Textarea_codigo.setText("Invalido la cadena no corresponde a mexico, caracter 1 y 2 invalido --> "+cadenaCodigoChars[0]+cadenaCodigoChars[1]);

        }
    }
    public void q2(char[] cadenaCodigoChars){
        for (int i = 0; i <alfabetoNumeros.length; i++){
            if (cadenaCodigoChars[2]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[0]=cadenaCodigoChars[2];
                q3(cadenaCodigoChars);
            }else{
                if((i==9)&&(cadenaCodigoChars[2]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero3-->: "+cadenaCodigoChars[2]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero3-->: "+cadenaCodigoChars[2]+" es invalido, no corresponde al rango de numeros");

                }
            }
        }
    }

    public void q3(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[3]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[1]=cadenaCodigoChars[3];
                q4(cadenaCodigoChars);
            }else{
                if((i==9)&&(cadenaCodigoChars[3]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero4-->: "+cadenaCodigoChars[3]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero4-->: "+cadenaCodigoChars[3]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
    }
    public void q4(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[4]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[2]=cadenaCodigoChars[4];
                q5(cadenaCodigoChars);
            }else {
                if((i==9) &&(cadenaCodigoChars[4]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero5-->: "+cadenaCodigoChars[4]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero5-->: "+cadenaCodigoChars[4]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }

    }
    public void q5(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[5]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[3]=cadenaCodigoChars[5];
                q6(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[5]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero6-->: "+cadenaCodigoChars[5]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero6-->: "+cadenaCodigoChars[5]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
    }
    public void q6(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[6]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[4]=cadenaCodigoChars[6];
                q7(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[6]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero7-->: "+cadenaCodigoChars[6]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero7-->: "+cadenaCodigoChars[6]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }

    }
    public void q7(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[7]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[5]=cadenaCodigoChars[7];
                q8(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[7]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero8-->: "+cadenaCodigoChars[7]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero8-->: "+cadenaCodigoChars[7]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
    }
    public void q8(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[8]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[6]=cadenaCodigoChars[8];
                q9(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[8]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero9-->: "+cadenaCodigoChars[8]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero9-->: "+cadenaCodigoChars[8]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
    }
    public void q9(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[9]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[7]=cadenaCodigoChars[9];
                q10(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[9]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero10-->: "+cadenaCodigoChars[9]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero10-->: "+cadenaCodigoChars[9]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }

    }
    public void q10(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[10]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[8]=cadenaCodigoChars[10];
                q11(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[10]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero11-->: "+cadenaCodigoChars[10]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero11-->: "+cadenaCodigoChars[10]+" es invalido, no corresponde al rango de numeros");

                }
            }
        }
    }
    public void q11(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[11]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[9]=cadenaCodigoChars[11];
                q12(cadenaCodigoChars);
            }else{
                if((i==9)&&(cadenaCodigoChars[11] != alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero12-->: "+cadenaCodigoChars[11]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero12-->: "+cadenaCodigoChars[11]+" es invalido, no corresponde al rango de numeros");

                }
            }
        }
    }
    public void q12(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[12]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[10]=cadenaCodigoChars[12];
                q13(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[12]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero13-->: "+cadenaCodigoChars[12]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero13-->: "+cadenaCodigoChars[12]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }

    }
    public void q13(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[13]==alfabetoNumeros[i]){
                i=9;
                numeroServicio[11]=cadenaCodigoChars[13];
                q14(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[13]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero14-->: "+cadenaCodigoChars[13]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero14-->: "+cadenaCodigoChars[13]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
    }
    public void q14(char[] cadenaCodigoChars) {
        if ((cadenaCodigoChars[14] == alfabetoNumeros[0]) || cadenaCodigoChars[14]==alfabetoNumeros[1]) {
            fechaLimite[0]=cadenaCodigoChars[14];
            q15(cadenaCodigoChars);
        }else {
            if (cadenaCodigoChars[14]==alfabetoNumeros[2]){
                fechaLimite[0]=cadenaCodigoChars[14];
                q17(cadenaCodigoChars);
            }else {
                System.out.println("Rechazado, el caracter numero15-->: "+cadenaCodigoChars[14]+" es invalido, no corresponde al rango de numeros");
                Textarea_codigo.setText("Rechazado, el caracter numero15-->: "+cadenaCodigoChars[14]+" es invalido, no corresponde al rango de numeros");
            }
        }
    }
    public void q15(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[15]==alfabetoNumeros[i]){
                fechaLimite[1]=cadenaCodigoChars[15];
                fechaLimite[2]='/';
                i=9;
                q16(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[15]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero16-->: "+cadenaCodigoChars[15]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero16-->: "+cadenaCodigoChars[15]+" es invalido, no corresponde al rango de numeros");

                }
            }
        }
    }
    public void q16(char[] cadenaCodigoChars){
        if(cadenaCodigoChars[16]==alfabetoNumeros[0]){
            fechaLimite[3]=cadenaCodigoChars[16];
            q18(cadenaCodigoChars);
        }else {
            if (cadenaCodigoChars[16]==alfabetoNumeros[1]){
                fechaLimite[3]=cadenaCodigoChars[16];
                q20(cadenaCodigoChars);
            }else {
                System.out.println("Rechazado, el caracter numero17-->: "+cadenaCodigoChars[16]+" es invalido, no corresponde al rango de numeros");
                Textarea_codigo.setText("Rechazado, el caracter numero17-->: "+cadenaCodigoChars[16]+" es invalido, no corresponde al rango de numeros");
            }
        }
    }
    public void q17(char[] cadenaCodigoChars){
        for (int i=0;i<3;i++){
            if (cadenaCodigoChars[15]==alfabetoNumeros[i]){
                fechaLimite[1]=cadenaCodigoChars[15];
                fechaLimite[2]='/';
                i=2;
                q16(cadenaCodigoChars);
            }else{
                if((i==2) &&(cadenaCodigoChars[13]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero15-->: "+cadenaCodigoChars[15]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero15-->: "+cadenaCodigoChars[15]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
    }
    public void q18(char[] cadenaCodigoChars){
        for (int i=1;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[17]==alfabetoNumeros[i]){
                i=9;
                fechaLimite[4]=cadenaCodigoChars[17];
                fechaLimite[5]='/';
                q19(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[17]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero18-->: "+cadenaCodigoChars[17]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero18-->: "+cadenaCodigoChars[17]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
    }
    public void q19(char[] cadenaCodigoChars){
        if ((cadenaCodigoChars[18] == alfabetoNumeros[1]) || (cadenaCodigoChars[18] == alfabetoNumeros[2])){
            fechaLimite[6]=cadenaCodigoChars[18];
            q34(cadenaCodigoChars);
        }else {
            if (cadenaCodigoChars[18]==alfabetoNumeros[0]){
                fechaLimite[6]=cadenaCodigoChars[18];
                q21(cadenaCodigoChars);
            }else {
                if (cadenaCodigoChars[18]==alfabetoNumeros[3]){
                    fechaLimite[6]=cadenaCodigoChars[18];
                    q23(cadenaCodigoChars);
                }
                else {
                    System.out.println("Rechazado, el caracter numero19-->: "+cadenaCodigoChars[18]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero19-->: "+cadenaCodigoChars[18]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
    }
    public void q20(char[] cadenaCodigoChars){
        for (int i=0;i<3;i++){
            if (cadenaCodigoChars[17]==alfabetoNumeros[i]){
                i=2;
                fechaLimite[4]=cadenaCodigoChars[17];
                fechaLimite[5]='/';
                q19(cadenaCodigoChars);
            }else{
                if((i==2) &&(cadenaCodigoChars[17]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero18-->: "+cadenaCodigoChars[17]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero18-->: "+cadenaCodigoChars[17]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
        //System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[2]+"es invalido, no corresponde al formato");
    }
    public void q21(char[] cadenaCodigoChars){
        for (int i=1;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[19]==alfabetoNumeros[i]){
                i=9;
                fechaLimite[7]=cadenaCodigoChars[19];
                q22(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[19]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero20-->: "+cadenaCodigoChars[19]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero20-->: "+cadenaCodigoChars[19]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
        //System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[20]+"es invalido, no corresponde al formato");

    }
    public void q22(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[20]==alfabetoNumeros[i]){
                i=9;
                importe[0]=cadenaCodigoChars[20];
                q24(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[20]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero21-->: "+cadenaCodigoChars[21]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero21-->: "+cadenaCodigoChars[21]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
       // System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[21]+"es invalido, no corresponde al formato");

    }
    public void q23(char[] cadenaCodigoChars){
        if (cadenaCodigoChars[19]==alfabetoNumeros[0] || cadenaCodigoChars[19]==alfabetoNumeros[1]){
             fechaLimite[7]=cadenaCodigoChars[19];
             q22(cadenaCodigoChars);
        }else{
             System.out.println("Rechazado, el caracter numero20-->: "+cadenaCodigoChars[19]+" es invalido, no corresponde al rango de numeros");
             Textarea_codigo.setText("Rechazado, el caracter numero20-->: "+cadenaCodigoChars[19]+" es invalido, no corresponde al rango de numeros");

        }
    }
    public void q24(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[21]==alfabetoNumeros[i]){
                i=9;
                importe[1]=cadenaCodigoChars[21];
                q25(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[21]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero22-->: "+cadenaCodigoChars[21]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero22-->: "+cadenaCodigoChars[21]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
       // System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[22]+"es invalido, no corresponde al formato");
    }
    public void q25(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[22]==alfabetoNumeros[i]){
                i=9;
                importe[2]=cadenaCodigoChars[22];
                q26(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[22]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero23-->: "+cadenaCodigoChars[22]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero23-->: "+cadenaCodigoChars[22]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
        //System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[23]+"es invalido, no corresponde al formato");
    }
    public void q26(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[23]==alfabetoNumeros[i]){
                i=9;
                importe[3]=cadenaCodigoChars[23];
                q27(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[23]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero24-->: "+cadenaCodigoChars[23]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero24-->: "+cadenaCodigoChars[23]+" es invalido, no corresponde al rango de numeros");

                }
            }
        }
        //System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[24]+"es invalido, no corresponde al formato");

    }
    public void q27(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[24]==alfabetoNumeros[i]){
                i=9;
                importe[4]=cadenaCodigoChars[24];
                q28(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[24]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero25-->: "+cadenaCodigoChars[24]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero25-->: "+cadenaCodigoChars[24]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
       // System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[25]+"es invalido, no corresponde al formato");

    }
    public void q28(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[25]==alfabetoNumeros[i]){
                i=9;
                importe[5]=cadenaCodigoChars[25];
                q29(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[25]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero26-->: "+cadenaCodigoChars[25]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero26-->: "+cadenaCodigoChars[25]+" es invalido, no corresponde al rango de numeros");

                }
            }
        }
    }
    public void q29(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[26]==alfabetoNumeros[i]){
                i=9;
                importe[6]=cadenaCodigoChars[26];
                q30(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[26]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero27-->: "+cadenaCodigoChars[26]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero27-->: "+cadenaCodigoChars[26]+" es invalido, no corresponde al rango de numeros");

                }
            }
        }
        //System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[27]+"es invalido, no corresponde al formato");

    }
    public void q30(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[27]==alfabetoNumeros[i]){
                i=9;
                importe[7]=cadenaCodigoChars[27];
                q31(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[27]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero28-->: "+cadenaCodigoChars[27]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero28-->: "+cadenaCodigoChars[27]+" es invalido, no corresponde al rango de numeros");
                }
            }
        }
       // System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[28]+"es invalido, no corresponde al formato");
    }
    public void q31(char[] cadenaCodigoChars){
        for (int i=1;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[28]==alfabetoNumeros[i]){
                i=9;
                importe[8]=cadenaCodigoChars[28];
                q32(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[28]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero29-->: "+cadenaCodigoChars[29]+" es invalido, no corresponde al rango de numero");
                    Textarea_codigo.setText("Rechazado, el caracter numero29-->: "+cadenaCodigoChars[29]+" es invalido, no corresponde al rango de numero");

                }
            }
        }
        //System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[29]+"es invalido, no corresponde al formato");
    }
    public void q32(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if (cadenaCodigoChars[29]==alfabetoNumeros[i]){
                i=9;
                q33(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[29]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero30-->: "+cadenaCodigoChars[29]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero30-->: "+cadenaCodigoChars[29]+" es invalido, no corresponde al rango de numeros");

                }
            }
        }
      //  System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[30]+"es invalido, no corresponde al formato");

    }
    public void q33(char[] cadenaCodigoChars){
        System.out.println("Codigo aceptado");
        String numeroS = String.valueOf(numeroServicio);
        String fechaL = String.valueOf(fechaLimite);
        String Importe = String.valueOf(importe);

        if(pais[0]=='0' && pais[1]=='1'){
            System.out.println("Servicio de Mexico");
            Textarea_codigo.setText("----------------------\nServicio de Mexico\nNumero de servicio: "+numeroS
                    +"\nFecha limite: "+fechaL+"\nImporte: $"+Importe);

            System.out.println("Numero de servicio: "+numeroS);
            System.out.println("Fecha limite aa/mm/dd: "+fechaL);
            System.out.println("Importe: "+ Importe);
        }
    }
    public void q34(char[] cadenaCodigoChars){
        for (int i=0;i<alfabetoNumeros.length;i++){
            if(cadenaCodigoChars[19]==alfabetoNumeros[i]){
                i=9;
                fechaLimite[7]=cadenaCodigoChars[19];
                q22(cadenaCodigoChars);
            }else{
                if((i==9) &&(cadenaCodigoChars[19]!=alfabetoNumeros[i])){
                    System.out.println("Rechazado, el caracter numero20-->: "+cadenaCodigoChars[19]+" es invalido, no corresponde al rango de numeros");
                    Textarea_codigo.setText("Rechazado, el caracter numero20-->: "+cadenaCodigoChars[19]+" es invalido, no corresponde al rango de numeros");

                }
            }
        }
        //System.out.println("Rechazado, el caracter: "+cadenaCodigoChars[19]+"es invalido, no corresponde al formato");
    }
}
