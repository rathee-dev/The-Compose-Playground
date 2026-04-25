package com.himanshu.composequadrant

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource

@Composable
fun ComposeQuadrantApp(modifier: Modifier = Modifier){
    Column(modifier.fillMaxSize()//This uses the modified property of inner padding
//  This here uses default modifier and goes beyond status bar not considering the inner padding
//        Modifier.fillMaxSize()
    ) {
        Row(Modifier.weight(1f)) {
            ComposeInfoCard(
                title = stringResource(R.string.first_title),
                desc = stringResource(R.string.first_desc),
                backgroundColor= Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposeInfoCard(
                title = stringResource(R.string.second_title),
                desc = stringResource(R.string.second_desc),
                backgroundColor= Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposeInfoCard(
                title = stringResource(R.string.third_title),
                desc = stringResource(R.string.third_desc),
                backgroundColor= Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposeInfoCard(
                title = stringResource(R.string.fourth_title),
                desc = stringResource(R.string.fourth_desc),
                backgroundColor= Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }

    }

}