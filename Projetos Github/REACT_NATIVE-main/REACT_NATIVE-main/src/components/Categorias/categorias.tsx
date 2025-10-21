// import React, { useState, useEffect } from 'react-native';

// const Categoria = () => {
//   const [categorias, setCategorias] = useState([]);
//   const [novaCategoria, setNovaCategoria] = useState('');

//   useEffect(() => {
//     // Simulação de chamada à API para obter as categorias existentes
//     // substituir por uma chamada real quando a deby passar a API
//     const obterCategorias = async () => {
//       try {
//         const response = await axios('/api/categorias');
//         const data = await response.json();
//         setCategorias(data);
//       } catch (error) {
//         console.error('Erro ao obter categorias:', error);
//       }
//     };

//     obterCategorias();
//   }, []);

//   const handleNovaCategoriaChange = (event) => {
//     setNovaCategoria(event.target.value);
//   };

//   const handleNovaCategoriaSubmit = async (event) => {
//     event.preventDefault();

//     // Simulação de chamada à API para criar uma nova categoria
//     // substituir por uma chamada real quando a deby passar a API

//     try {
//       const response = await fetch('/api/categorias', {
//         method: 'POST',
//         headers: {
//           'Content-Type': 'application/json',
//         },
//         body: JSON.stringify({ nome: novaCategoria }),
//       });
//       const data = await response.json();

//       // Atualiza o estado com a nova categoria
//       setCategorias([...categorias, data]);
//       setNovaCategoria('');
//     } catch (error) {
//       console.error('Erro ao criar categoria:', error);
//     }
//   }
// };

// export default Categoria;
