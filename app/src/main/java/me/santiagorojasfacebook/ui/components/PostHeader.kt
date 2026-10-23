package me.santiagorojasfacebook.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Colores oficiales de Facebook
private val FacebookTextPrimary = Color(0xFF050505)
private val FacebookTextSecondary = Color(0xFF65676B)
private val FacebookBlueBorder = Color(0xFF1877F2)

@Composable
fun PostHeader(
    modifier: Modifier = Modifier,
    userName: String = "Santiago Rojas",
    timeAgo: String = "2 h",
    audience: String = "🌎"
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Avatar de Perfil estilo Facebook (con borde sutil de historia/actividad)
        Box(
            modifier = Modifier
                .size(42.dp)
                .clip(CircleShape)
                .border(1.5.dp, FacebookBlueBorder, CircleShape)
                .padding(2.dp)
                .clip(CircleShape)
                .background(Color(0xFFE4E6EB)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = userName.take(1).uppercase(),
                color = FacebookTextPrimary,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        // Columna de Nombre y Subtítulo (Hora + Privacidad)
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = userName,
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp,
                color = FacebookTextPrimary
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$timeAgo · ",
                    fontSize = 12.sp,
                    color = FacebookTextSecondary
                )
                Text(
                    text = audience,
                    fontSize = 11.sp,
                    color = FacebookTextSecondary
                )
            }
        }

        // Acciones superiores de Facebook (3 puntos + opción cerrar)
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { },
                modifier = Modifier.size(32.dp)
            ) {
                Text(
                    text = "•••",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = FacebookTextSecondary
                )
            }
            Spacer(modifier = Modifier.width(4.dp))
            IconButton(
                onClick = { },
                modifier = Modifier.size(32.dp)
            ) {
                Text(
                    text = "✕",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = FacebookTextSecondary
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostHeaderPreview() {
    PostHeader()
}
