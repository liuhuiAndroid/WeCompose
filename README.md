# WeCompose
扔物线版微信

material
foundation
animation
ui
runtime

val name = mutableStateOf("compose")
使用 name.value

// 加在可能进入recompose过程的变量上
var name by remember { mutableStateOf("compose") }
使用 name
