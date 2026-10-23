package me.santiagorojasfacebook.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PostStats(
    modifier: Modifier = Modifier,
    likesCount: Int = 24,
    commentsCount: Int = 3,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        // Lado izquierdo: ícono de Like + número de likes
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "👍",
                fontSize = 16.sp,
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = likesCount.toString(),
                fontSize = 14.sp,
                color = Color(0xFF65676B),
            )
        }

        // Lado derecho: cantidad de comentarios
        Text(
            text = "$commentsCount comentarios",
            fontSize = 14.sp,
            color = Color(0xFF65676B),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PostStatsPreview() {
    PostStats()
}
