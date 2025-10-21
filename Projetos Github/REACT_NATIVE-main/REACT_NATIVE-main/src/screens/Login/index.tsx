import React, { useState } from "react";
import { Text, Image, Alert, TouchableOpacity } from "react-native";
import { ButtonL, Container } from "./style";
import { useNavigation } from "@react-navigation/native";
import { useAuth } from "../../Context/authContext";
import { useForm, FieldValues } from "react-hook-form";
import { InputControl } from "../../components/InputControl";
import { LinearGradient } from "expo-linear-gradient";

interface ScreenNavigationProp {
  navigate: (screen: string) => void;
}

interface IFormInput {
  [name: string]: any;
}
function Usuario() {
  const { login } = useAuth();
  const { handleSubmit, control } = useForm<FieldValues>();
  const { navigate } = useNavigation<ScreenNavigationProp>();
  const [loading, setLoading] = useState(false);

  const handleLogin = (form: IFormInput) => {
    const data = {
      username: form.username,
      password: form.password,
    };
    try {
      setLoading(true);
      login(data);
    } catch (err) {
      Alert.alert("Erro de Autenticação", "Erro");
    }
  };

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
        style={{
          width: "90%",
          height: "14%",
          marginTop: "0%",
          resizeMode: "contain",
          position: "absolute",
          top: "8%",
        }}
      />
      <Image
        source={require("../../../assets/4capyanjoroto.png")}
        style={{
          width: "50%",
          height: "45%",
          resizeMode: "contain",
          bottom: "10%",
          position: "absolute",
          top: "16%",
        }}
      />
      <Container
        style={{
          width: "100%",
          height: "100%",
          justifyContent: "center",
          alignSelf: "center",
          alignItems: "center",
          position: "absolute",
          top: "30%",
        }}
      >
        <Text
          style={{
            position: "absolute",
            top: "33%",
            left: "14%",
            color: "white",
            fontSize: 20,
          }}
        >
          Nome de usuário ou Email
        </Text>
        <InputControl
          style={{ height: "60%" }}
          placeholder="Digite seu usuário"
          name="username"
          control={control}
        />
        <Text
          style={{
            position: "absolute",
            top: "43%",
            left: "14%",
            color: "white",
            fontSize: 20,
          }}
        >
          Senha
        </Text>
        <InputControl
          style={{ height: "60%" }}
          placeholder="Digite sua senha"
          name="password"
          control={control}
          secureTextEntry
          keyboardType="numeric"
        />
        {
          <ButtonL
            onPress={handleSubmit(handleLogin)}
            style={{ bottom: "1%" }}
          >
            <Text>
                entre aqui
            </Text>
          </ButtonL>
        }
        <ButtonL onPress={() => navigate("Register")}>
          <Text>Cadastre-se</Text>
        </ButtonL>
      </Container>
    </LinearGradient>
  );
}

export default Usuario;