import React from "react";
import { View, TextInput, Switch, Image } from "react-native";
import IconSearch from "react-native-vector-icons/Ionicons";
import { ThemeContextProvider, useTheme } from "../../Context/ThemeContext";
import { Button } from "react-native-paper";
// import { headerView } from './style'

const Header = () => {
  const { toggleThemeType, themeType, isDarkTheme, theme } = useTheme();

  return (
    <View
      style={{
        backgroundColor: "#740916",
        width: "100%",
        height: "16%",
        paddingHorizontal: "2.85%",
        flexDirection: "column",
        paddingBottom: "1.85%",
      }}
    >
      <View
        style={{
          flexDirection: "row",
          justifyContent: "space-between",
          height: "100%",
        }}
      >
        <Button
          mode="contained"
          onPress={toggleThemeType}
          style={{
            width: "5%",
            height: "25%",
            position: "absolute",
            bottom: "55%",
            backgroundColor: '#141414',
            
          }}
        ></Button>

        <TextInput
          style={{
            backgroundColor: "white",
            width: "75%",
            borderRadius: 15,
            height: "35%",
            top: "16%",
          }}
        />
        <IconSearch
          name="search-outline"
          style={{
            height: "25%",
            width: "8%",
            position: "absolute",
            top: "58%",
            right: "27%",
            fontSize: 30,
          }}
        />

        <Image
          style={{
            width: "28%",
            height: "82%",
            resizeMode: "contain",
            position: 'absolute',
            left: '75%',
            top: '21%',
          }}
          source={require("../../../assets/1capyroto.png")}
        />
      </View>
    </View>
  );
};

export default Header;
