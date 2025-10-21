import * as React from 'react';
import {AuthProvider} from '../Context/authContext'
import Rotas from '.';

function Navigation() {
    return(
        <AuthProvider>
            <Rotas/>
        </AuthProvider>
    )
}

export default Navigation;