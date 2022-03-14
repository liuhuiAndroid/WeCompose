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

val nums = mutableStateListOf(1,2,3)
val map = mutableStateMapOf(1 to "One", 2 to "Two")

@Stable 不要轻易重写equals