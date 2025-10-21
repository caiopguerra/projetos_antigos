// import { LinearGradient} from 'expo-linear-gradient'
// import Navigation from './src/Routes/navigation';
// import { createDrawerNavigator } from '@react-navigation/drawer';
// import { NavigationContainer } from '@react-navigation/native';
// import { ThemeContextProvider, useTheme } from './src/Context/ThemeContext';
// import {createStackNavigator} from '@react-navigation/stack'

// const Stack = createStackNavigator();

// export default function App() {
//   return (
//     <>
//     <ThemeContextProvider>
//     <Stack.Navigator>
//     <Navigation/>
//     <LinearGradient
//        style={{ width: '100%', height: '100%', justifyContent: 'flex-end',position: 'absolute', zIndex: -1,  }}
//       colors={['#740916', '#E3B68E']}>
//     </LinearGradient>
//     </Stack.Navigator>
//     </ThemeContextProvider>
//     </>
//   );
// 

import React from 'react';
import { LinearGradient } from 'expo-linear-gradient';
import Navigation from './src/Routes/navigation';
import { NavigationContainer } from '@react-navigation/native';
import { ThemeContextProvider} from './src/Context/ThemeContext';
import { createStackNavigator } from '@react-navigation/stack';


export default function App() {
  return (

    
      <ThemeContextProvider>
        <Navigation/>
      </ThemeContextProvider>
   
  );
}


