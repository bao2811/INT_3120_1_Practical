package com.example.bai1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Theme tối giản
object SimpleTheme {
    val background = Color(0xFFF2F2F2)
    val primaryText = Color.Black
    val secondaryText = Color.DarkGray
    val spacing = 16.dp

    val headlineStyle = TextStyle(fontSize = 24.sp, color = primaryText)
    val bodyStyle = TextStyle(fontSize = 16.sp, color = secondaryText)
}

@Composable
fun GreetingCard(name: String, message: String, image: Painter) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(SimpleTheme.spacing),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = "Ảnh minh họa",
            modifier = Modifier.size(120.dp)
        )
        Spacer(modifier = Modifier.height(SimpleTheme.spacing))
        Text(text = "Xin chào $name!", style = SimpleTheme.headlineStyle)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = message, style = SimpleTheme.bodyStyle)
    }
}

@Composable
fun GreetingCardPreview(image: Painter) {
    Box(modifier = Modifier.fillMaxSize().padding(SimpleTheme.spacing), contentAlignment = Alignment.Center) {
        GreetingCard(
            name = "Bảo Hoàng",
            message = "Học Compose dễ hơn bạn nghĩ 😉",
            image = image
        )
    }
}
