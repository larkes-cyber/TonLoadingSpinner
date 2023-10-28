package com.example.tonspinneranimation

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource

@Composable
fun CrystalSpinner(
    modifier:Modifier = Modifier
) {

    val transition = rememberInfiniteTransition()

    val opacity by transition.animateFloat(
        initialValue = 1f,
        targetValue = 0.2f,
        animationSpec = infiniteRepeatable(
            animation = tween(600),
            repeatMode = RepeatMode.Reverse
        )
    )

    Image(
        painter = painterResource(id = R.drawable.ton_crystal_icon),
        contentDescription = "",
        modifier = modifier.alpha(opacity)
    )

}