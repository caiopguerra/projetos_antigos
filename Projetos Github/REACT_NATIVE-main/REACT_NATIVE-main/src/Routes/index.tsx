import * as React from 'react';
import RotasPublicas from './rotasPublicas';
import RotasPrivadas from './rotasPrivadas';
import {useAuth} from '../Context/authContext'
import { MyTabs } from '../components/Footer';

function Rotas() {
    const{id} = useAuth();
    return(
        id?<RotasPrivadas/> : <RotasPublicas/> 
    )
}

export default Rotas
