// import React, { useState, useEffect } from 'react';

// const Produto = () => {
//   const [produtos, setProdutos] = useState([]);
//   const [novoProduto, setNovoProduto] = useState('');

//   useEffect(() => {
//     // Simulação de chamada à API para obter os produtos existentes
//     // substituir por uma chamada real quando a deby passar a API
//     const obterProdutos = async () => {
//       try {
//         const response = await fetch('/api/produtos');
//         const data = await response.json();
//         setProdutos(data);
//       } catch (error) {
//         console.error('Erro ao obter produtos:', error);
//       }
//     };

//     obterProdutos();
//   }, []);

//   const handleNovoProdutoChange = (event) => {
//     setNovoProduto(event.target.value);
//   };

//   const handleNovoProdutoSubmit = async (event) => {
//     event.preventDefault();

//     // Simulação de chamada à API para criar um novo produto
//     // substituir por uma chamada real quando a deby passar a API

//   };

// }