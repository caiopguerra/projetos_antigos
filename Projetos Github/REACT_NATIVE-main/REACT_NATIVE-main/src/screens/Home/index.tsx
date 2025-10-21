import React from 'react'
import { View, Text, FlatList, Image, ScrollView, SafeAreaView, ActivityIndicator } from 'react-native'
import { Api } from '../../services/Api'
import { useState, useEffect } from 'react'
import { Card } from '../../components/Card'
import Header from '../../components/Header/header'
import Footer from '../../components/Footer'



export interface IProduto{

  produtoId: number;
  nome:string;
  descricao:string;
  valorUnitario:number;

}
const Home = () => {
  const [produtos, setProdutos] = useState<IProduto[]>([])



  React.useEffect(() => {
    const loadProdutos = async () => {
      const response = await Api.get('/produto/lista');
      setProdutos(response.data);
    };
   loadProdutos();
  }, []);
console.log(produtos);

  
  return (
    <View style={{justifyContent: 'space-around', flex: 1}}>
    <Header/>
      <FlatList style={{marginTop: '5%'}}
        data={produtos}
        renderItem={({ item }) => {
          return <Card item={item} />
        }}
      />
    </View>

  )
}

export default Home
