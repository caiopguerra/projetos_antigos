import React, { useState } from 'react';
import {Button,Modal,Text,View,
} from 'react-native';

import styles from './styles';

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

export default Sidebar;
