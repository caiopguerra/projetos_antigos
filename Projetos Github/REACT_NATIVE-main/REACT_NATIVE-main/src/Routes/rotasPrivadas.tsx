import { createNativeStackNavigator } from '@react-navigation/native-stack'
// import Cart from '../screens/Cart';
import Home from '../screens/Home';

const Tab = createNativeStackNavigator();

function RotasPrivadas (){
    return(
            <Tab.Navigator screenOptions={{headerShown:false}}>
                <Tab.Screen name="Home" component={ Home } />
                {/* <Tab.Screen name="Carrinho" component={ Cart } /> */}
                
            </Tab.Navigator>
    )
}
export default RotasPrivadas