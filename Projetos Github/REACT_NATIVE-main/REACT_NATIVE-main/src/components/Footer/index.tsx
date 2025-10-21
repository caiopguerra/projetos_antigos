import * as React from 'react';
import { Button,Modal,Text, View } from 'react-native';
import { NavigationContainer } from '@react-navigation/native';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import Icon from 'react-native-vector-icons/Octicons';
import IconCart from 'react-native-vector-icons/Ionicons'
import Sidebar from '../SideBar/sideBar';
import Home from '../../screens/Home';
import { useState } from 'react';
import styles from '../SideBar/styles';


function Feed() {
  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
      <Text>LALALA!</Text>
      
    </View>

  );
}

function Profile(  ) {
  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
      <Text>Profile!</Text>
      
    </View>
  );
}

function Notifications() {
  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
      <Text>Notifications!</Text>
    </View>
  )
}
function Menu() {

  const Sidebar: React.FC = () => {
    const [isSidebarOpen, setIsSidebarOpen] = useState(false);
  
    const openSidebar = () => {
      setIsSidebarOpen(true);
    };
  
    const closeSidebar = () => {
      setIsSidebarOpen(false);
    };
  
    return (
      <View style={styles.container}>
        <Button
          title="Open sidebar"
          onPress={openSidebar}
        />
  
        <Modal
          visible={isSidebarOpen}
          animationType="slide"
          transparent={true}
        >
          <View style={styles.sidebarContainer}>
            <View style={styles.sidebarContent}>
              <Text style={styles.paragraph}>I'm in the Sidebar!</Text>
              <Button
                title="Close sidebar"
                onPress={closeSidebar}
              />
            </View>
          </View>
        </Modal>
      </View>
    );
  };

}

const Tab = createBottomTabNavigator();

export function MyTabs() {
  return (
    <Tab.Navigator
      initialRouteName="Feed"
      screenOptions={{
        tabBarActiveTintColor: '#740916',
      }}
    >
      <Tab.Screen
        name="HomeIcon"
        component={Home}
        options={{
          tabBarLabel: 'Home',
          tabBarIcon: ({ color, size }) => (
            <Icon name="home" size={size} color={color} />
          ),
        }}
      />
      <Tab.Screen
        name="Notifications"
        component={Notifications}
        options={{
          tabBarLabel: 'Usuario',
          tabBarIcon: ({ color, size }) => (
            <Icon name="person" size={size} color={color} />
          ),
        }}
      />
      <Tab.Screen
        name="Profile"
        component={Profile}
        options={{
          tabBarLabel: 'Carrinho',
          tabBarIcon: ({ color, size }) => (
              <IconCart name="cart-outline" size={size} color={color}
              />
          ),
       }}
      />
      <Tab.Screen
        name="Menu"
        component={Sidebar}
        options={{
          tabBarLabel: 'Menu',
          tabBarIcon: ({ color, size }) => (
            <IconCart name="menu-outline" size={size} color={color} />
            
          ),
        }}
      />
    </Tab.Navigator>
  );
}

export default function App() {
  return (
    <View style={{ marginBottom: '12%' }}>
      <MyTabs />
    </View>
  );
}
