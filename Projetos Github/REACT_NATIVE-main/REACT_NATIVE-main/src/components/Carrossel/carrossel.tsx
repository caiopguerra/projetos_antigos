// import React from "react"
// import { View, StyleSheet, Dimensions } from "react-native"
// import Carousel from "react-native-snap-carousel"

// const SLIDER_WIDTH = Dimensions.get("window").width
// const ITEM_WIDTH = SLIDER_WIDTH * 0.88

// const carouselItems = [
//   {
//     imgUrl: "https://i.imgur.com/UYiroysl.jpg",
//   },
//   {
//     imgUrl: "https://i.imgur.com/UPrs1EWl.jpg",
//   },
//   {
//     imgUrl: "https://i.imgur.com/MABUbpDl.jpg",
//   },
//   {
//     imgUrl: "https://i.imgur.com/KZsmUi2l.jpg",
//   }
// ]

// type Props = {
//   item: {
//     imgUrl: string
//   }
//   index: number
// }

// function carouselCardItem({ item, index }: Props) {
//   return (
//     <View style={styles.cardCarousel} key={index}>
//       <Image style={styles.image} source={{ uri: item.imgUrl }} />
//     </View>
//   )
// }

// export function Carrossel() {
//   return (
//     <View style={styles.container}>
//       <Carousel
//         data={carouselItems}
//         renderItem={carouselCardItem}
//         sliderWidth={SLIDER_WIDTH}
//         itemWidth={ITEM_WIDTH}
//         useScrollView={true}
//       />
//     </View>
//   )
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//   },
//   cardCarousel: {
//     width: ITEM_WIDTH,
//   },
//   image: {
//     height: 250,
//     borderRadius: 8,
//   },
// })
