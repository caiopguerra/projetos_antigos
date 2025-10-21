import React from "react";
import { View, Text, Image } from "react-native";
import { ButtonL, Input, Container, Texto } from "./style";
import { LinearGradient } from "expo-linear-gradient";

function Register({ navigation }) {
  return (
    <LinearGradient
      style={{
        justifyContent: "center",
        alignItems: "center",
        height: "100%",
        width: "100%",
      }}
      colors={["#E3B68E", "#740916", "#000000"]}
    >
      <Image
        source={require("../../../assets/3capylogo.png")}
        style={{ width: "90%", height: "14%",  bottom: "10%", position: "absolute",
        top: "10%", resizeMode: 'contain'}}
      />
      <Image
        source={require("../../../assets/4capyanjoroto.png")}
        style={{
          width: "45%",
          height: "45%",
          resizeMode: "contain",
          bottom: "10%",
          position: "absolute",
          top: "18%",
        }}
      />

      <Input
       style={{
       position:'absolute',
       top: '61%' 
      }}
      placeholder="Digite seu email" />

      <Input
      style={{
        position:'absolute',
        top: '70%' 
       }}
      placeholder="Digite sua senha" />
      <Texto
      style={{
        position:'absolute',
        top: '76%' 
       }}
      >Senha deve ter no minimo seis caracteres</Texto>
      <Input
      style={{
        position:'absolute',
        top: '79%' 
       }}
      placeholder="Confirme sua Senha" />

      <ButtonL
      style={{
        position:'absolute',
        top: '91%',
        alignItems: 'center',
       }}
      onPress={() => navigation.navigate("Login")}>
        <Text>Enviar cadastro</Text>
      </ButtonL>
    </LinearGradient>
  );
}

export default Register;
