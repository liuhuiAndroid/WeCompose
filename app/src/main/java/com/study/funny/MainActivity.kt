package com.study.funny

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.study.funny.ui.theme.WeComposeTheme
import com.study.funny.ui.theme.black
import com.study.funny.ui.theme.green3
import com.study.funny.ui.theme.white1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeComposeTheme {
                Column {
//                    WeBottomBar()
                }
            }
        }
    }

}

@Composable
private fun WeBottomBar(selected: Int) {
    Row(Modifier.background(color = white1)) {
        TabItem(
            iconId = if (selected == 0) R.drawable.ic_chat_filled else R.drawable.ic_chat_outlined,
            title = "微信",
            tint = if (selected == 0) green3 else black,
            modifier = Modifier.weight(1f)
        )
        TabItem(
            iconId = if (selected == 1) R.drawable.ic_contacts_filled else R.drawable.ic_contacts_outlined,
            title = "通讯录",
            tint = if (selected == 1) green3 else black,
            modifier = Modifier.weight(1f)
        )
        TabItem(
            iconId = if (selected == 2) R.drawable.ic_discovery_filled else R.drawable.ic_discovery_outlined,
            title = "发现",
            tint = if (selected == 2) green3 else black,
            modifier = Modifier.weight(1f)
        )
        TabItem(
            iconId = if (selected == 3) R.drawable.ic_me_filled else R.drawable.ic_me_outlined,
            title = "我",
            tint = if (selected == 3) green3 else black,
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
private fun TabItem(@DrawableRes iconId: Int, title: String, tint: Color, modifier: Modifier) {
    Column(
        modifier.padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = iconId),
            contentDescription = title,
            Modifier.size(24.dp),
            tint = tint
        )
        Text(text = title, fontSize = 11.sp, color = tint)
    }
}

@Preview(showBackground = true)
@Composable
fun WeBottomBarPreview() {
    WeBottomBar(0)
}

// 快捷键：prev
@Preview(showBackground = true)
@Composable
fun TabItemPreview() {
    TabItem(
        iconId = R.drawable.ic_chat_filled,
        title = "微信",
        tint = MaterialTheme.colors.error,
        modifier = Modifier
    )
}