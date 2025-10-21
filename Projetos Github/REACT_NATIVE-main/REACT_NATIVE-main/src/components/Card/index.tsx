import React from 'react'
import { View, TouchableOpacity, Text, Image } from 'react-native'
import {  CardP } from './style'
import { IProduto } from '../../screens/Home'

interface ProdutoCardProps{
  item: IProduto
}

export const Card = ( { item } : ProdutoCardProps) => {
  return (
    
        <CardP>

            <Text style={{color: 'white', position:'absolute', width:'50%', top:'4%',height: '50%', left:'3%' }}>Produto: {item.nome}</Text>
            <Text style={{color: 'white', width: '95%', height:'40%', position:'absolute', bottom:'5%', left:'3%' }}>Descrição: {item.descricao}</Text>
            <Text style={{color: 'white', width: '95%', height:'40%', position:'absolute', top:'5%',left: '55%'}}>Preço:C$ {item.valorUnitario} capycoins</Text>

        </CardP>
    
  )
}


